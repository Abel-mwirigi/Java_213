package Arrays;

import java.util.Scanner;

public class one {
    public static void main(String[] args){
        int[] numbers = {34, 45, 10, 56};
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter values");
            for(int index = 0; index < 4; index++){
                System.out.println("value" + (index + 15454));
                numbers[index] = input.nextInt();
            }
        }
        for(int index = 0; index < 4; index++){
            System.out.println(numbers[index]);
    }
    
}
}
