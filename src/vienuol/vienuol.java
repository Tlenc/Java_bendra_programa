package vienuol;


import java.util.Scanner;

public class vienuol {
    public static final int FIRST_NR = 1;
    public static final int ACTION_SUM = 1;
    public static final int ACTION_MULT = 2;

    public vienuol() {

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
                }
            } catch (Exception klaida) {
                System.out.println("Įvedėte ne skaičių,bandykite dar kartą");
                arSkaicius = false;
            }
        }
        System.out.println("Pasirinkite veiksmą:");
        System.out.println("1 - suma");
        System.out.println("2 - sandauga");
        Scanner sc = new Scanner(System.in);
        int veiksmas = sc.nextInt();
        switch (veiksmas) {
            case ACTION_SUM:
                for (int i = FIRST_NR; i < sk; i++) {
                    suma += i;
                }
                System.out.println("Suma :" + suma);
                break;
            case ACTION_MULT:
                for (int i = FIRST_NR; i < sk; i++) {
                    suma *=  i;

                }
                System.out.println("Suma :" + suma);
                break;

        }


    }
}



