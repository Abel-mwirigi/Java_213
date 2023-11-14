public class Cars {
    private String model;
    private String make;
    private double price;

    public Cars(String model, String make, double price){
        this.model = model;
        this.make = make;
        this.price = price;
    }

    void getDetails() {
        System.out.println("Model: " + model);
        System.out.println("Make: " + make);
        System.out.println("Price: " + price);
    }
    double getPrice(){
        return price;
    }
}
