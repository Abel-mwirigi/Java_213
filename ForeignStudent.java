public class ForeignStudent extends Students{
    private String passportNumber;

    public ForeignStudent(String name, String passportNumber){
        super(name);
        this.passportNumber = passportNumber;
    }
    void studentDetails(){
        System.out.println("Passport: " + passportNumber);
    }
}
