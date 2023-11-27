import java.util.Scanner;

public class lesson1{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        try (Scanner myInput = new Scanner(System.in)) {
            System.out.println("Enter a numbr");
            c = myInput.nextInt();
        }
        int result = a + b + c;
        System.out.println(result);
    }
}