package com.croc.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String source = "/*\n" +
                " * My first ever program in Java!\n" +
                " */\n" +
                "class Hello { // class body starts here \n" +
                "  \n" +
                "  /* main method */\n" +
                "  public static void main(String[] args/* we put command line arguments here*/) {\n" +
                "    // this line prints my first greeting to the screen\n" +
                "    System.out.println(\"Hi!\"); // :)\n" +
                "  }\n" +
                "} // the end\n" +
                "// to be continued...\n";
        String noComments = removeJavaComments(source);
        System.out.println(noComments);
    }

    static String removeJavaComments(String source) {
        StringBuilder noComments = new StringBuilder();
        Pattern pattern = Pattern.compile("(/\\*([\\S\\s]+?)\\*/)|(//.*)");
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            matcher.appendReplacement(noComments, "");
        }
        matcher.appendTail(noComments);
        return String.valueOf(noComments);
    }
}