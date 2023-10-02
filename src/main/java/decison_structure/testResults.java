package decison_structure;

import java.util.Scanner;

public class testResults {

    public static void main(String[] args) {

        System.out.println("Enter test Score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        char grade = ' ';

        if(score < 60) {
            grade = 'F';
        }
        else if(score < 70) {
            grade = 'D';
        }
        else if (score < 80) {
            grade = 'C';
        }
        else if (score < 90) {

        } else {
            grade = 'A';
        }

        System.out.println("Your grade: " + grade);
    }
}
