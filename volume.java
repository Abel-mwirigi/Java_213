import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        String password = "Mwirigi";
        String userPassword;
        double radius;
        double height;
        double volume;
        System.out.println("Enter your password");
        try (Scanner myPassword = new Scanner(System.in)) {
            userPassword = myPassword.nextLine();
        }
        if(password.compareTo(userPassword)==0){
            System.out.println("Enter the radius");
            try (Scanner myRadius = new Scanner(System.in)) {
                radius= myRadius.nextDouble();
            }
            System.out.println("Enter your height");
            try (Scanner myHeight = new Scanner(System.in)) {
                height= myHeight.nextDouble();
            }
            volume = (22/7) *radius*radius*height;
            System.out.println("This tank can hold "+volume+"litres of water");
        }
        else{
            System.out.println("Incorrect password you cannot use the sytem");
        }
    }
}
