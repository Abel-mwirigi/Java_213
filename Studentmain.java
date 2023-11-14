import java.util.ArrayList;
import java.util.Scanner;

public class Studentmain {
    public static void main(String[] args) {
        ArrayList<Student>studentList = new ArrayList<>();
        int sum = 0;
        try (Scanner myInputs = new Scanner(System.in)) {
            String name;
            int age;
            //System.out.println("Enter student details");
            for(int i = 0; i < 5; i++){
                System.out.println("Enter student " + (i+1) + " details");
                System.out.println("Enter Name");
                name = myInputs.next();
                System.out.println("Enter age");
                age = myInputs.nextInt();
                Student student = new Student(name, age);
                studentList.add(student);

            }
        }
        for(int i = 0; i < studentList.size(); i++){
            studentList.get(i).getDetails();
        }
        for(int i = 0; i < studentList.size(); i++){
            sum = sum + studentList.get(i).getAge();
        }
        double avAge = (float)sum / studentList.size();
        System.out.println("Average age: "+avAge);
    }
}
