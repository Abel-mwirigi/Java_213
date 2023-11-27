public class Electrictycars extends Cars{
    private String batteryCapacity;
    private String batteryLifespan;

    public Electrictycars(String model, String make, double price, String capacity, String color, String batteryCapacity, String batteryLifespan){
        super(model, make, price, capacity, color);
        this.batteryCapacity = batteryCapacity;
        this.batteryLifespan = batteryLifespan;
    }
    void ElectrictycarsDetails(){
        System.out.println(batteryCapacity);
        System.out.println(batteryLifespan);
    }

}
