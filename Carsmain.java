import java.util.ArrayList;
import java.util.Scanner;

public class Carsmain {
public static void main(String[] args) {
    ArrayList<Cars>carsList = new ArrayList<>();
    try (Scanner myInputs = new Scanner(System.in)) {
        int n;
        String model;
        String make;
        double price;
        String capacity;
        String color;
        String batteryCapacity;
        String batteryLifespan;
        String engineCapacity;
        String fuelType;
        char type;

        
        System.out.println("Enter the number of car/s ");
        n = myInputs.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Enter car " + (i+1) + " details");
            System.out.println("Enter model");
            model = myInputs.next();
            System.out.println("Enter make");
            make = myInputs.next();
            System.out.println("Enter price");
            price = myInputs.nextDouble();
            System.out.println("Enter the capacity");
            capacity = myInputs.next();
            System.out.println("Enter the color");
            color = myInputs.next();

            System.out.println("What type of car/s do you want enter E for electric and O for ordinary ");
            type = myInputs.next().charAt(0);
            if(type == 'E'){ 
                System.out.println("Enter battery capacity");
                batteryCapacity = myInputs.next();
                System.out.println("Enter battery lifespan");
                batteryLifespan = myInputs.next();
                Electrictycars electrictycars = new Electrictycars(model, make, price, capacity, color, batteryCapacity, batteryLifespan);
                carsList.add(electrictycars);
            }
            else if (type == 'O')
            {
                System.out.println("Enter engine capacity");
                engineCapacity = myInputs.next();
                System.out.println("Enter fuel type");
                fuelType = myInputs.next();
                OrdinaryCars ordinaryCars = new OrdinaryCars(model, make, price, capacity, color, engineCapacity, fuelType);
                carsList.add(ordinaryCars);
            }
            else{
                System.out.println("Invalid input");
            }

        }
    }
    for (int j = 0; j < carsList.size(); j++){
        carsList.get(j).getDetails();
    }
}
}
