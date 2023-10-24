package org.example;

public class Main {
    public static void main(String[] args) {
        String ortaMetin = "Ilginizi cekebilir";
        String altMetin = "Vade Suresi";

        System.out.println(ortaMetin);

        double dolarDun = 18.15;
        double dolarBugun = 18.15;

        String okYonu = "";

        if(dolarBugun<dolarDun)
        {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }
        else if (dolarDun == dolarBugun)
        {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
        else
        {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        String[] krediler = {"Hizli Kredi", "Mutlu emekli", "Binlerce Veri"};
        for (int i = 0; i < krediler.length; i++)
        {
            System.out.println(krediler[i]);
        }

    }
}