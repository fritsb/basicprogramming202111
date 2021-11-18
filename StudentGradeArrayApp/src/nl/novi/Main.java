package nl.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] studentNames = askStudentNames();
        int[] grades = askStudentGrades();

        displayInfo(studentNames, grades);
    }

    public static String[] askStudentNames() {
        String[] studentNames = new String[3];

        for(int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            String studentName = "";
            while(studentName.isEmpty()) {
                System.out.println("Voer studentnaam in:");
                studentName = input.nextLine();
            }
            System.out.println("Lengte van de naam: " + studentName.length());

            studentNames[i] = studentName.toUpperCase();
        }
        return studentNames;
    }

    public static int[] askStudentGrades() {
        int[] grades = new int[3];

        for(int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            //int grade = input.nextInt();
            int grade = -1;
            while(grade < 1 || grade > 10) {
                System.out.println("Voer cijfer in:");
                grade = input.nextInt();
            }

            grades[i] = grade;
        }
        return grades;
    }

    public static void displayInfo(String[] names, int[] studentGrades) {
        for(int i =0; i < names.length; i++) {
            System.out.println("Naam van de student:" + names[i]);
            System.out.println("Cijfer van de student: " + studentGrades[i]);
        }
    }

}
