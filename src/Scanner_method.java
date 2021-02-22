import java.util.Scanner;

public class Scanner_method {
    public static void main(String[] args) {
        String s1 = "Hello ";
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String s2 = scan.next();
        System.out.print("Enter your age: ");
        Scanner scan2 = new Scanner(System.in);
        double x = scan2.nextDouble();
        System.out.print("Are you married? (true or false): ");
        Scanner scan3 = new Scanner(System.in);
        boolean b = scan3.nextBoolean();
        System.out.println(s1 + s2);
        System.out.print("you are ");
        System.out.print(x);
        System.out.println(" years old.");
        System.out.print("your mariage status is:");
        System.out.print(b);

    }
}
