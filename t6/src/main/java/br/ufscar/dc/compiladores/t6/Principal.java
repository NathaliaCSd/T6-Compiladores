package br.ufscar.dc.compiladores.t6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Principal {
    public static void main(String[] args) throws IOException {
        // args[0]: arquivo de entrada .txt
        // args[1]: arquivo de saída .html

        // 1) Leitura e análise léxica
        CharStream cs = CharStreams.fromFileName(args[0]);
        ReceitasLexer lexer = new ReceitasLexer(cs);
        List<String> erros = new ArrayList<>();
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> r, Object o,
                                    int line, int charPos, String msg, RecognitionException e) {
                erros.add(String.format("Linha %d:%d %s", line, charPos, msg));
            }
        });

        // 2) Análise sintática
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ReceitasParser parser = new ReceitasParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> r, Object o,
                                    int line, int charPos, String msg, RecognitionException e) {
                erros.add(String.format("Linha %d:%d %s", line, charPos, msg));
            }
        });
        ReceitasParser.ProgramaContext arvore = parser.programa();

        // 3) Se houve erro sintático, imprime e sai
        try (PrintWriter pw = new PrintWriter(args[1])) {
            if (!erros.isEmpty()) {
                erros.forEach(pw::println);
                pw.println("Fim da compilacao");
                return;
            }

            // 4) Análise semântica
            ReceitasSemantico sem = new ReceitasSemantico();
            sem.visitPrograma(arvore);
            List<String> semErros = SemanticoUtils.getErros();
            if (!semErros.isEmpty()) {
                semErros.forEach(pw::println);
                pw.println("Fim da compilacao");
                return;
            }

            // 5) Geração de HTML
            ReceitasGeradorHTML ger = new ReceitasGeradorHTML();
            ger.visitPrograma(arvore);
            // escrevendo diretamente no arquivo de saída HTML
            ger.escreverHTML(args[1]);
        }
    }
}
