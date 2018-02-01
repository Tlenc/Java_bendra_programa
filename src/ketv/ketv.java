package ketv;

import java.util.Scanner;

public class ketv {
    public static final int EXIT_CODE = 0;

    public ketv() {
        float suma = 0;
        float sk = 0;
        do {
            sk = tikSkaicius();
            suma += sk;
        } while (sk != EXIT_CODE);
        System.out.println("Suma : " + suma);

    }

    public static float tikSkaicius() {
        float rezultatas = 0;
        boolean arSkaicius = false;
        while (arSkaicius == false) {
            try {
                System.out.println("Įveskite skaičių");
                Scanner sc = new Scanner(System.in);
                rezultatas = sc.nextFloat();
                arSkaicius = true;
            } catch (Exception klaida) {
                System.out.println("Įvesta ne skaičius,mėginkite dar kartą");

            }

        }
        return rezultatas;
    }


}
