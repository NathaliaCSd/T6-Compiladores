package br.ufscar.dc.compiladores.t6;

import java.util.HashMap;
import java.util.Map;

/**
 * Guarda nomes de ingredientes e receitas, permitindo consultas por tipo.
 */
public class TabelaDeSimbolos {
    public enum TipoEntrada {
        INGREDIENTE,
        RECEITA
    }

    // Mapeia nome -> tipo (ingrediente ou receita)
    private final Map<String, TipoEntrada> tabela = new HashMap<>();

    /**
     * Adiciona um ingrediente ao inventário.
     */
    public void adicionarIngrediente(String nome) {
        tabela.put(nome, TipoEntrada.INGREDIENTE);
    }

    /**
     * Verifica se um ingrediente já está no inventário.
     */
    public boolean existeIngrediente(String nome) {
        return tabela.get(nome) == TipoEntrada.INGREDIENTE;
    }

    /**
     * Adiciona uma receita ao conjunto de receitas.
     */
    public void adicionarReceita(String nome) {
        tabela.put(nome, TipoEntrada.RECEITA);
    }

    /**
     * Verifica se uma receita já foi declarada.
     */
    public boolean existeReceita(String nome) {
        return tabela.get(nome) == TipoEntrada.RECEITA;
    }

    /**
     * Retorna o tipo de entrada (ingrediente ou receita) ou null se não existir.
     */
    public TipoEntrada verificar(String nome) {
        return tabela.get(nome);
    }

    public class TipoReceitas {
    }
}
