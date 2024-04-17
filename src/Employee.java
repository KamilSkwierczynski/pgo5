import java.time.LocalDate;

public class Employee {
    String imie;
    String nazwisko;
    String adres;
    String email;
    String pesel;
    int rokZatrudnienia;
    static int baseSalary = 3000;
    static int everyYearBonus = 1000;

    public Employee(String imie, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
    }
    static int getCurrentYear() {
        return LocalDate.now().getYear();
    }
    int calculateSalary() {
        return baseSalary + (getCurrentYear() - rokZatrudnienia) * everyYearBonus;
    }

}
