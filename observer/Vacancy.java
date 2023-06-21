package observer;

public class Vacancy {

    private Company company;

    private double salary;

    private Profession profession;



    public Vacancy(Company company, int salary, Profession profession) {
        this.company = company;
        this.salary = salary;
        this.profession = profession;
    }

    public String getCompanyName() {
        return company.getCompanyName();
    }

    public double getSalary() {
        return salary;
    }

    public Profession getProfession() {
        return profession;
    }
}
