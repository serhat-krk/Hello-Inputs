import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write your name:");
        Scanner scanner = new Scanner(System.in);
        String name = new scanner.nextLine();
        System.out.println("Hello " + name);
    }
}