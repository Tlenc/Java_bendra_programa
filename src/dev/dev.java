package dev;

import java.util.Scanner;

public class dev {
    public static final int ACTION_SUM = 1;
    public static final int ACTION_SUBTRACTION = 2;
    public static final int ACTION_MULTIPLICATION = 3;
    public static final int ACTION_REPEAT = 5;

    public dev() {


        skaiciuok();

    }

    public void skaiciuok() {
        boolean arTesti = true;
        while (arTesti == true) {
            System.out.println("Įveskite du skaičius :");
            Scanner sc = new Scanner(System.in);
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            System.out.println("Pasirinkite veiksmą: ");
            System.out.println("1 - suma");
            System.out.println("2- skirtumas");
            System.out.println("3 - sandauga : ");
            int veiksmas = sc.nextInt();
            switch (veiksmas) {
                case ACTION_SUM:
                    System.out.println("Suma : " + (a + b));
                    break;
                case ACTION_SUBTRACTION:
                    System.out.println("Skirtumas : " + (a - b));
                    break;
                case ACTION_MULTIPLICATION:
                    System.out.println("Daugyba : " + (a * b));
                    break;
            }
            System.out.println("Jei norite kartoti,įveskite 5");
            int kartoj = sc.nextInt();
            if (kartoj != ACTION_REPEAT)
                arTesti = false;
        }
    }
}

