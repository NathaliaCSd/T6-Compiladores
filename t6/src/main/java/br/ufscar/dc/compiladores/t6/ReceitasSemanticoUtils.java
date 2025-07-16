package br.ufscar.dc.compiladores.t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.Token;
import br.ufscar.dc.compiladores.t6.TabelaDeSimbolos.TipoEntrada;

/**
 * Utilitários para análise semântica da DSL de receitas.
 * Acumula erros, permite limpar e recuperar a lista.
 */
public class ReceitasSemanticoUtils {

    private static final List<String> errosSemanticos = new ArrayList<>();

    /**
     * Limpa todos os erros semânticos acumulados.
     */
    public static void limparErros() {
        errosSemanticos.clear();
    }

    /**
     * Retorna uma cópia da lista de erros semânticos.
     */
    public static List<String> getErrosSemanticos() {
        return Collections.unmodifiableList(new ArrayList<>(errosSemanticos));
    }

    /**
     * Adiciona um erro semântico baseado em token.
     */
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Linha %d:%d - %s\n", linha, coluna, mensagem));
    }

    /**
     * Recupera o tipo de entrada (ingrediente ou receita) na tabela.
     */
    public static TipoEntrada verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}
