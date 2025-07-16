package br.ufscar.dc.compiladores.t6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;

public class Principal {
    public static void main(String[] args) throws IOException {
        // 0) Limpa erros de compilação anteriores
        ReceitasSemanticoUtils.limparErros();

        try (PrintWriter pw = new PrintWriter(args[1])) {
            CharStream cs = CharStreams.fromFileName(args[0]);

            // 1) -> Lexer
            ReceitasLexer lexer = new ReceitasLexer(cs);
            List<String> erros = new ArrayList<>();
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object o,
                                        int line, int charPos, String msg, RecognitionException e) {
                    erros.add(String.format("Linha %d:%d %s\n", line, charPos, msg));
                }
            });

            // 2) -> Parser
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ReceitasParser parser = new ReceitasParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object o,
                                        int line, int charPos, String msg, RecognitionException e) {
                    erros.add(String.format("Linha %d:%d %s\n", line, charPos, msg));
                }
            });

            // 3) Chama o parser
            ReceitasParser.ProgramaContext arvore = parser.programa();

            // 4) Se tiver erro sintático, imprime e sai
            if (!erros.isEmpty()) {
                erros.forEach(pw::println);
                pw.println("Fim da compilacao");
                return;
            }

            // 5) Análise semântica
            ReceitasSemantico sem = new ReceitasSemantico();
            sem.visitPrograma(arvore);

            // 6) Recupera erros semânticos
            List<String> errosSem = ReceitasSemanticoUtils.getErrosSemanticos();
            if (!errosSem.isEmpty()) {
                errosSem.forEach(pw::println);
                pw.println("Fim da compilacao");
                return;
            }

            // 7) Geração de HTML
            ReceitasGeradorHTML ger = new ReceitasGeradorHTML();
            ger.visitPrograma(arvore);
            ger.escreverHTML(args[1]);
        }
    }
}
