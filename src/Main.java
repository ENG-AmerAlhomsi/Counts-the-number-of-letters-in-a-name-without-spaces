import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = scanner.nextLine();
        String nameWithoutSpace= name.replaceAll("\\s","");

        System.out.println("What is your age ?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();

        System.out.println("Hi "+ name+ " you was born in "+ year);
        System.out.println("your name contain " + nameWithoutSpace.length()+ " letters");

    }
}