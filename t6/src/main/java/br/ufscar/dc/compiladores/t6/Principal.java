package br.ufscar.dc.compiladores.t6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

public class Principal {
    public static void main(String[] args) throws IOException {

        try (PrintWriter pw = new PrintWriter(args[1])) {
            CharStream cs = CharStreams.fromFileName(args[0]);

            receitasLexer lexer = new receitasLexer(cs);
            //criado uma lista para armazenar os possiveis erros 
            List<String> erros = new ArrayList<>();
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?,?> r, Object o,
                                        int line, int charPos, String msg, RecognitionException e) {
                    erros.add(String.format("Linha %d:%d %s", line, charPos, msg));
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            receitasParser parser = new receitasParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?,?> r, Object o,
                                        int line, int charPos, String msg, RecognitionException e) {
                    erros.add(String.format("Linha %d:%d %s", line, charPos, msg));
                }
            });

            ParseTree arvore = parser.programa();


/*
            T5Semantico sem = new T5Semantico();
            sem.visit(arvore);
            erros.addAll(T5SemanticoUtils.errosSemanticos);

            //se tiver algum erro, eh printado no arquivo
            if (!erros.isEmpty()) {
                erros.forEach(pw::println);
                pw.println("Fim da compilacao");
                return;
            }

            T5GeradorC ger = new T5GeradorC(sem.pilhaDeTabelas);
            ger.visit(arvore);
            pw.print(ger.getSaida());
*/
        }
    }
}
