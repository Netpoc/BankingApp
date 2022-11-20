import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        char c = scanner.next().charAt(0);
        System.out.println("value = " + c);
    }
}
