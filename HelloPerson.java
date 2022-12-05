import java.util.Scanner;

public class HelloPerson {
    public static void main (String[] args) {
        Scanner enterName = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = enterName.nextLine();
        enterName.close();

        System.out.print("Hello " + name);
    }
}