public class Cars {
    private String model;
    private String make;
    private double price;
    private String capacity;
    private String color;

    public Cars(String model, String make, double price, String capacity, String color){
        this.model = model;
        this.make = make;
        this.price = price;
        this.capacity = capacity;
        this.color = color;
    }

    void getDetails() {
        System.out.println("Model: " + model);
        System.out.println("Make: " + make);
        System.out.println("Price: " + price);
        System.out.println("capacity: " + capacity);
        System.out.println("color: " + color);
    }
    
    //double getPrice(){
        //return price;
   // }
}
