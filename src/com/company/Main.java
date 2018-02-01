package com.company;

import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0;
    public static final int ACTION_1 = 1;
    public static final int ACTION_2 = 2;
    public static final int ACTION_3 = 3;
    public static final int ACTION_4 = 4;
    public static final int ACTION_5 = 5;
    public static final int ACTION_6 = 6;
    public static final int ACTION_7 = 7;
    public static final int ACTION_8 = 8;
    public static final int ACTION_9 = 9;
    public static final int ACTION_10 = 10;
    public static final int ACTION_11 = 11;
    public static final int ACTION_12 = 12;


    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.vygdykPrograma();

    }

    private void rodytiPasirinkima() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite norima veiksma");
        System.out.println("1 - Lyginis/nelyginis");
        System.out.println("2 - Dalyba iš 7,5,3");
        System.out.println("3 - Žodžių vedimas iki pabaiga");
        System.out.println("4 - Skaičių sudėtis,kol neįvesta 0");
        System.out.println("5 - Skaičių sudėtis,kol neįvesta 0 su apsauga");
        System.out.println("6 - Skaičių vedimas į masyvą,ir jų suma");
        System.out.println("7 - žodžių vedimas į masyvą,ir jų atvaizdavimas");
        System.out.println("8 - skaičių vedimas į masyvą,ir jų atvaizdavimas,jei jie didesni už 100");
        System.out.println("9 - skaičių vedimas į masyvą,ir jų atvaizdavimas,jei jie didesni už 100 masyve");
        System.out.println("10 - skaičių sudėtis,atimtis,daugyba");
        System.out.println("11 - skaičių nuo n suma");
        System.out.println("12 - skaičių nuo n suma ar sandauga");


    }

    public void vygdykPrograma() {
        boolean arTesti = true;
        Scanner sc = new Scanner(System.in);
        while (arTesti == true) {
            rodytiPasirinkima();
            int veiksmas = sc.nextInt();
            switch (veiksmas) {
                case EXIT_CODE:
                    arTesti = false;
                    break;

                case ACTION_1:
                    new pirm.pirm();
                    break;
                case ACTION_2:
                    new pirmm.pirmm();
                    break;
                case ACTION_3:
                    new antr.antr();
                    break;
                case ACTION_4:
                    new trec.trec();
                    break;
                case ACTION_5:
                    new ketv.ketv();
                    break;
                case ACTION_6:
                    new penkt.penkt();
                    break;
                case ACTION_7:
                    new sest.sest();
                    break;
                case ACTION_8:
                    new sept.sept();
                    break;
                case ACTION_9:
                    new ast.ast();
                    break;
                case ACTION_10:
                    new dev.dev();
                    break;
                case ACTION_11:
                    new desm.desm();
                    break;
                case ACTION_12:
                    new vienuol.vienuol();
                    break;
            }
        }
    }
}
