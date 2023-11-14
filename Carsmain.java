import java.util.ArrayList;
import java.util.Scanner;

public class Carsmain {
public static void main(String[] args) {
    ArrayList<Cars>carsList = new ArrayList<>();
    double sum = 0;
    try (Scanner myInputs = new Scanner(System.in)) {
        int n;
        String model;
        String make;
        double price;

        System.out.println("Enter the number of cars ");
        n = myInputs.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Enter car " + (i+1) + " details");
            System.out.println("Enter model");
            model = myInputs.next();
            System.out.println("Enter make");
            make = myInputs.next();
            System.out.println("Enter price");
            price = myInputs.nextDouble();
            Cars cars = new Cars(model, make, price);
            carsList.add(cars);
        }
    }
    for(int i = 0; i < carsList.size(); i++){
        carsList.get(i).getDetails();
    }
    for(int i = 0; i < carsList.size(); i++){
        double max = carsList.get(0).getPrice();
        if (carsList.get(i).getPrice() > max){
            max = carsList.get(i).getPrice();
            System.out.println("The price of the most expensive car is: " + max);
        }
        sum = sum + carsList.get(i).getPrice();
        System.out.println("The total cost is: "+ sum);
    }
    double avAge = (float)sum / carsList.size();
    System.out.println("Average price: "+ avAge);
}
}
