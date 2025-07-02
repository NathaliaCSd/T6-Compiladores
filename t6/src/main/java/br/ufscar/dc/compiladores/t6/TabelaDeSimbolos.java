package br.ufscar.dc.compiladores.t6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabelaDeSimbolos {
      public enum TipoReceitas {
        LITERAL,
        INTEIRO,
        ML,
        UN,
        G,
        INVALIDO
    }

    public enum TipoEntrada {
        VARIAVEL,
        TIPO,
        REQUER
    }

    public class EntradaTabelaDeSimbolos {
        String nome;
        TipoEntrada tipoEntrada;
        TipoReceitas tipo;
        boolean ehPonteiro;
        boolean ehVetor;
        boolean ehVar;
        TabelaDeSimbolos registro;
        List<EntradaTabelaDeSimbolos> parametros;
        Object valor; // Para constantes

        // Construtor principal para constantes
        public EntradaTabelaDeSimbolos(String nome, TipoEntrada tipoEntrada, TipoT5 tipo, Object valor) {
            this.nome = nome;
            this.tipoEntrada = tipoEntrada;
            this.tipo = tipo;
            this.valor = valor;
            this.ehPonteiro = false;
            this.ehVetor = false;
            this.ehVar = false;
            this.registro = null;
            this.parametros = new ArrayList<>();
        }

        // Construtor para Variáveis/Parâmetros
        public EntradaTabelaDeSimbolos(String nome, TipoEntrada tipoEntrada, TipoT5 tipo, boolean ehPonteiro,
                TabelaDeSimbolos registro, boolean ehVetor, boolean ehVar) {
            this(nome, tipoEntrada, tipo, null);
            this.ehPonteiro = ehPonteiro;
            this.registro = registro;
            this.ehVetor = ehVetor;
            this.ehVar = ehVar;
        }

        // Construtor para Funções/Procedimentos
        public EntradaTabelaDeSimbolos(String nome, TipoEntrada tipoEntrada, TipoT5 tipoRetorno) {
            this(nome, tipoEntrada, tipoRetorno, null);
        }

        public TipoT5 getTipo() {
            return this.tipo;
        }

        public boolean isPonteiro() {
            return this.ehPonteiro;
        }

        public boolean isVetor() {
            return this.ehVetor;
        }

        public boolean isVar() {
            return this.ehVar;
        }

        public TabelaDeSimbolos getRegistro() {
            return this.registro;
        }

        public TipoEntrada getTipoEntrada() {
            return this.tipoEntrada;
        }

        public List<EntradaTabelaDeSimbolos> getParametros() {
            return this.parametros;
        }

        public TipoT5 getTipoRetorno() {
            return this.tipo;
        }
    }

    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    public void adicionar(String nome, TipoT5 tipo) {
        adicionar(nome, 
                TipoEntrada.VARIAVEL, 
                tipo, 
                false, 
                null, 
                false,
                false); 
    }

    public void adicionar(String nome, TipoEntrada tipoEntrada, TipoT5 tipo, boolean ehPonteiro,
            TabelaDeSimbolos registro, boolean ehVetor, boolean ehVar) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipoEntrada, tipo, ehPonteiro, registro, ehVetor, ehVar));
    }

    

    public void adicionarConstante(String nome, TipoT5 tipo, Object valor) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, TipoEntrada.CONSTANTE, tipo, valor));
    }

    public void adicionarFuncao(String nome, TipoT5 tipoRetorno) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, TipoEntrada.FUNCAO, tipoRetorno));
    }

    public void adicionarProcedimento(String nome) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, TipoEntrada.PROCEDIMENTO, null));
    }

    public void adicionarParametro(String nomeSubRotina, EntradaTabelaDeSimbolos parametro) {
        if (tabela.containsKey(nomeSubRotina)) {
            tabela.get(nomeSubRotina).parametros.add(parametro);
        }
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public EntradaTabelaDeSimbolos getEntrada(String nome) {
        return tabela.get(nome);
    }

    public List<EntradaTabelaDeSimbolos> entradas() {
        return new ArrayList<>(tabela.values());
    }

}
