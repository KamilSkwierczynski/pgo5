import java.util.ArrayList;

public class Manager extends Employee {
    static ArrayList<Goal> managerGoals = new ArrayList<>();

    public Manager(String fname, String lname, String adress, String email, String pesel, int yearEmployed){
        super(fname, lname, adress, email, pesel, yearEmployed);
    }
    void addGoals(Goal goal) {
        managerGoals.add(goal);
    }
    int goalsBonus() {
        return managerGoals.stream()
                .mapToInt(obj -> obj.goalsAchived() ? obj.bonus : 0)
                .sum();

    }
    int calculateSalary() {
        return super.calculateSalary() + goalsBonus();
    }
}
