package org.orest.tsiatsiak;

public class Lab7ConsoleApplication {

    public static void main(String[] args) {
        Storage<String, String> countryToCurrency = new Storage<>();
        countryToCurrency.store("UKRAINE", "Hryvnia");
        countryToCurrency.store("USA", "US Dollar");
        countryToCurrency.store("UKRAINE", "Hryvnia");
        countryToCurrency.store("SPAIN", "Euro");
        countryToCurrency.store("SLOVAKIA", "Euro");
        countryToCurrency.store("NORTHERN MARIANA ISLANDS", "US Dollar");
        countryToCurrency.store("MONGOLIA", "Tugrik");
        countryToCurrency.store("MALTA", "Euro");
        countryToCurrency.store("JAMAICA", "Jamaican Dollar");
        countryToCurrency.store("INDONESIA", "Rupiah");
        ColoredConsolePrinter.println("Storage:", ColoredConsolePrinter.BLUE);
        System.out.println(countryToCurrency);
        ColoredConsolePrinter.println("getFirstValuesBySecond(\"Euro\")", ColoredConsolePrinter.BLUE);
        System.out.println(countryToCurrency.getFirstValuesBySecond("Euro"));
        ColoredConsolePrinter.println("getSecondValuesByFirst(\"MONGOLIA\")", ColoredConsolePrinter.BLUE);
        System.out.println(countryToCurrency.getSecondValuesByFirst("MONGOLIA"));
        ColoredConsolePrinter.println("getAllFirsts()", ColoredConsolePrinter.BLUE);
        System.out.println(countryToCurrency.getAllFirsts());
        ColoredConsolePrinter.println("getAllSeconds()", ColoredConsolePrinter.BLUE);
        System.out.println(countryToCurrency.getAllSeconds());
        ColoredConsolePrinter.println(
                "deleteAllByFirstValue(\"MALTA\") and deleteAllBySecondValue(\"Euro\")",
                ColoredConsolePrinter.BLUE
        );
        countryToCurrency.deleteAllByFirstValue("MALTA");
        countryToCurrency.deleteAllBySecondValue("Euro");
        System.out.println(countryToCurrency.getAllFirsts());
        System.out.println(countryToCurrency.getAllSeconds());
    }



}
