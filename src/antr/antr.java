package antr;
import java.util.Scanner;
public class antr {
    public antr() {
        String zod = " ";
        System.out.println("Įveskite žodį");
        Scanner sc = new Scanner(System.in);
        while (!zod.equals("pabaiga")) ;
        zod = sc.nextLine();
        System.out.println(zod);
    }
}
