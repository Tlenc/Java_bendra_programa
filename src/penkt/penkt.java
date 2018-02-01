package penkt;

import java.util.Scanner;

public class penkt {
    public penkt(){
        int[] mas = new int[5];
        int suma = 0;
        System.out.println("Įveskite 5 skaičius : ");
        for(int i =0;i < mas.length;i++){
            Scanner sc = new Scanner(System.in);
            mas[i] = sc.nextInt();
            suma += mas[i];
        }
        System.out.println("Suma yra :"+ suma);
    }
}
