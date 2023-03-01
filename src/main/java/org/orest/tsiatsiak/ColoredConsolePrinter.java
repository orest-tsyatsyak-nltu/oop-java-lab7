package org.orest.tsiatsiak;

public enum ColoredConsolePrinter {

    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    public final String ansiCode;

    ColoredConsolePrinter(String ansiCode){
        this.ansiCode = ansiCode;
    }

    public static void println(String str, ColoredConsolePrinter color) {
        System.out.println(color + str + RESET);
    }

    public static void print(String str, ColoredConsolePrinter color) {
        System.out.print(color + str + RESET);
    }

    @Override
    public String toString() {
        return ansiCode;
    }

}
