import java.util.ArrayList;
public class Tester extends Employee {
    ArrayList<String> testerTests = new ArrayList<>();

    public Tester(String fname, String lname, String adress, String email, String pesel, int yearEmployed) {
        super(fname, lname, adress, email, pesel, yearEmployed);
    }
    void addTestType(String testType){
    testerTests.add(testType);
    }
     public int calculateSalary() {
        return super.calculateSalary() +testerTests.size() * 300;
    }
}