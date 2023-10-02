package decison_structure;

import java.util.Scanner;

public class GradeMessage_SwtichExpressions {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade) {
            case "A"-> "Excellent Job !";

            case "B" -> {
                System.out.println("some text");
                yield "great job !"; // yield to return something or in other word assign some value
            }
            case "C" -> "good job !";

            case "D" -> "You can do better !";

            case "F" -> "No No you need to wake up  body !!";

            default -> "Error :( invalid grade";
        };

        System.out.println(message);
    }
}
