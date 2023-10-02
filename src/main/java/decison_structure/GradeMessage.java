package decison_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = null;

        switch(grade) {
            case "A":
                message = "Excellent Job !";
                break;
            case "B":
                message = "great job !";
                break;
            case "C":
                message = "good job !";
                break;
            case "D":
                message = "You can do better !";
                break;
            case "F":
                message = "No No you need to wake up  body !!";
                break;
            default:
                message = "Error :( invalid grade";
                break;
        }

        System.out.println(message);
    }
}
