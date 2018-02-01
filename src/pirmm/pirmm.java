package pirmm;

import java.util.Scanner;

public class pirmm {
    public pirmm() {
        System.out.println("Įveskite skaičiu : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 7 == 0) {
            System.out.println("Skaičius" + a + " dalinasi iš 7");

        } else if(a % 5 == 0) {
            System.out.println("Skaičius" + a + "  dalinasi iš 7");
        }else if (a % 3 == 0) {
            System.out.println("Skaičius" + a + "  dalinasi iš 3");
        }else {
            System.out.println("Skaičius" + a + "  nesidalina");
        }

    }
}
