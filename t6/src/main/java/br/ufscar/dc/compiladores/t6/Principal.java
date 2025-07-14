package br.ufscar.dc.compiladores.t6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Principal {
    public static void main(String[] args) throws IOException {

        try (PrintWriter pw = new PrintWriter(args[1])) {
            CharStream cs = CharStreams.fromFileName(args[0]);

            ReceitasLexer lexer = new ReceitasLexer(cs);
            // criado uma lista para armazenar os possiveis erros
            List<String> erros = new ArrayList<>();
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object o,
                        int line, int charPos, String msg, RecognitionException e) {
                    erros.add(String.format("Linha %d:%d %s", line, charPos, msg));
                }
            });

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

            ReceitasSemantico sem = new ReceitasSemantico();
            sem.visitPrograma(arvore);
            erros.addAll(ReceitasSemanticoUtils.getErrosSemanticos());

            // se tiver algum erro, eh printado no arquivo
            if (!erros.isEmpty()) {
                erros.forEach(pw::println);
                pw.println("Fim da compilacao");
                return;
            }

            ReceitasGeradorHTML ger = new ReceitasGeradorHTML();
            ger.visitPrograma(arvore);
            ger.escreverHTML(args[1]);
        }
    }
}