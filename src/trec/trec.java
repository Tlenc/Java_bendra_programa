package trec;
import java.util.Scanner;
public class trec {
    public static final int EXIT_CODE = 0;
    public trec(){
        float suma = 0;
        float sk = 0;
        do {

            System.out.println("Įveskite skaičių");
            Scanner sc = new Scanner(System.in);
            sk = sc.nextFloat();
            suma += sk;
        }while (sk != EXIT_CODE);
        System.out.println("Suma : " + suma);

    }
}
