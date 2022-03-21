import java.util.Scanner;

public class ExerciseDay1 {
    public static void  main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Ask what the user has accomplished today so far
        System.out.print("What's something you've done today? ");
        // Get done1, done2, done3
        String done1 = console.nextLine();
        System.out.print("What is another thing you've done today? ");
        String done2 = console.nextLine();
        System.out.print("What's one more thing you've done today? ");
        String done3 = console.nextLine();

        // Ask what the user still needs to do today
        System.out.print("What's something you still want to get done today? ");
        // Get need1, need2, need3
        String need1 = console.nextLine();
        System.out.print("What's another thing you still want to do today? ");
        String need2 = console.nextLine();
        System.out.print("What's the last thing you want to get done today? ");
        String need3 = console.nextLine();

        // Display first line text
        System.out.println();
        System.out.println();
        System.out.println("This is your Dev-Attendable To Do List");
        // Display line of asterisks
        System.out.println("*****************************");
        System.out.println();
        // Due:
        System.out.println("Due:");
        // List Tasks
        String dueList = String.format("1. %s. %n2. %s. %n3. %s.", need1, need2, need3);
        System.out.print(dueList);
        // Add 2 empty lines
        System.out.println();
        System.out.println();
        // Completed:
        System.out.println("Completed:");
        // List Tasks
        String doneList = String.format("1. %s. %n2. %s. %n3. %s.", done1, done2, done3);
        System.out.print(doneList);
        System.out.println();
        System.out.println();

    }
}
