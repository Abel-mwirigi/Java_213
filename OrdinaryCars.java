public class OrdinaryCars extends Cars{
    private String engineCapacity;
    private String fuelType;

    public OrdinaryCars(String model, String make, double price, String capacity, String color, String engineCapacity, String fuelType){
        super(model, make, price, capacity, color);
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }
    void OrdinaryCarsDetails(){
        System.out.println(engineCapacity);
        System.out.println(fuelType);
    }
}
