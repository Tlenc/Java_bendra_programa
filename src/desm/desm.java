package desm;


import java.util.Scanner;

public class desm {
    public static final int FIRST_NR = 1;

    public desm() {

        int sk = 0;
        int suma = 0;


        boolean arSkaicius = false;
        while (arSkaicius == false) {
            try {
                System.out.println("Įveskite skaičių didiesnį nei 0");
                Scanner sc = new Scanner(System.in);
                sk = sc.nextInt();
                suma = sk;
                if (sk > 0) {
                    arSkaicius = true;
                    for (int i = FIRST_NR; i < sk; i++) {
                        suma += i;
                    }
                    System.out.println("Suma :" + suma);
                  }
            } catch (Exception klaida) {
                System.out.println("Įvedėte ne skaičių,bandykite dar kartą");
                arSkaicius = false;
            }
        }
    }
}





