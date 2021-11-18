package nl.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        for(int i =0; i < 10; i++) {
            System.out.println(i);
        }

        int counter = 0;
        while(counter < 10) {
            System.out.println(counter);
            counter++;
        }*/


        String studentName = "";
        int grade = -1;
/*
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Voer student naam in:");
            studentName = in.nextLine();
            System.out.println("Voer cijfer in:");
            grade = in.nextInt();
        }
        while(grade < 6); */


        while(grade < 6) {
            Scanner in = new Scanner(System.in);
            System.out.println("Voer student naam in:");
            studentName = in.nextLine();
            System.out.println("Voer cijfer in:");
            grade = in.nextInt();
        }

        System.out.println("Student met naam " + studentName + " heeft voldoende cijfer: " + grade );

    }
}
