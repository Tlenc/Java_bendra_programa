package pirm;

import java.util.Scanner;

public class pirm {
    public pirm() {
        System.out.println("Įveskite skaičiu : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Skaičius" + a + " yra lyginis");

        } else {
            System.out.println("Skaičius" + a + " yra nelyginis");
        }

    }
}

