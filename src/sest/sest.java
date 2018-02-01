package sest;

import java.util.Scanner;

public class sest {
    public sest(){
                String[] mas = new String[5];
                System.out.println("Įveskite 5 žodžius : ");
                for(int i =0;i < mas.length;i++){
                    Scanner sc = new Scanner(System.in);
                    mas[i] = sc.nextLine();
                }
                for(int i =0;i < mas.length;i++)

                System.out.println(i+ "žodis yra"+ mas[i]);
            }
        }

