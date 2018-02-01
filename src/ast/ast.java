package ast;

import java.util.Scanner;

public class ast {

    public ast() {

        System.out.println("Kiek skaičių ketinate įvesti? ");
        Scanner sc = new Scanner(System.in);
        int dyd = sc.nextInt();
        float[] mas = new float[dyd];
        System.out.println("Įveskite skaičius :");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextFloat();
        }

        skaiciavimas(mas);


    }

    public static void skaiciavimas(float[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                System.out.println(array[i]);
            }

        }


    }
}


