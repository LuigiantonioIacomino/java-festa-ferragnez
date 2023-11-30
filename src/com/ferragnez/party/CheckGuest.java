package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] namesOfGuests=new String[10];
        namesOfGuests[0]="Dua Lipa";
        namesOfGuests[1]="Paris Hilton";
        namesOfGuests[2]="Manuel Agnelli";
        namesOfGuests[3]="J-ax";
        namesOfGuests[4]="Francesco Totti";
        namesOfGuests[5]="Ilary Blasi";
        namesOfGuests[6]="Bebe Vio";
        namesOfGuests[7]="Luis";
        namesOfGuests[8]="Pardis Zarei";
        namesOfGuests[9]="Rachel Zeilic";
        Scanner scan=new Scanner(System.in);
        System.out.println("Come ti chiami?: ");
        String nameOfUser=scan.nextLine();
        for (int i = 0; i < namesOfGuests.length; i++) {
            if(nameOfUser.equals(namesOfGuests[i])) {
                System.out.println("Prego! Puoi entrare");
                break;
            }
            else{
                if(i==9) {
                    System.out.println("Non puoi entrare");
                }
            }
        }





    }
}
