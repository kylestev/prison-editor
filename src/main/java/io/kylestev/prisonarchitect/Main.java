package io.kylestev.prisonarchitect;

import io.kylestev.prisonarchitect.parser.antlr.PrisonLexer;
import io.kylestev.prisonarchitect.parser.antlr.PrisonParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        PrisonParser parser = getParseTree(new File(getPrisonFile("herro.prison")));

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        parser.prog().toStringTree(parser);

        System.out.println(System.currentTimeMillis() - start);
    }

    private static PrisonParser getParseTree(File f) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(f));
        PrisonLexer lexer = new PrisonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        return new PrisonParser(tokens);

    }

    private static String getPrisonFile(String name) {
        return System.getProperty("user.home") + String.format("/Library/Application Support/Prison Architect/saves/%s", name);
    }
}
