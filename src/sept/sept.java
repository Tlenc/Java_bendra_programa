package sept;

import java.util.Scanner;

public class sept {
    public sept(){
        System.out.println("Kiek skaičių ketinate įvesti? ");
        Scanner sc = new Scanner(System.in);
        int dyd = sc.nextInt();
        float[] mas = new float[dyd];
        System.out.println("Įveskite skaičius :");
        for (int i = 0; i<mas.length;i++){
            mas[i] = sc.nextFloat();
        }
        for (int i =0;i < mas.length;i++){
            if (mas[i]>100){
                System.out.println(mas[i] + " Yra daugiau už 100");
            }
        }
    }
}
