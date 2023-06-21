package observer;

public class Company {

    private String companyName;
    private  double maxSalary;

    private Publisher jobAgency;


    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(Vacancy vacancy){
        jobAgency.sendOffer(vacancy);
    }

    public String getCompanyName() {
        return companyName;
    }
}