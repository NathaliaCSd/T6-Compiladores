package br.ufscar.dc.compiladores.t6;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.t6.TabelaDeSimbolos.TipoEntrada;


public class ReceitasSemanticoUtils {
      public static List<String> errosSemanticos = new ArrayList<>();
    
    //Adiciona um erro semantico:
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Erro %d:%d - %s", linha, coluna, mensagem));
    }
    
    //Verifica se o tipo esta correto:
    public static TipoEntrada verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}
