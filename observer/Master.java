package observer;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    private Profession profession;

    public Master(String name, Profession profession) {
        this.name = name;
        this.profession = profession;
        minSalary = random.nextDouble(60000, 80000);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (vacancy.getProfession() == profession) {
            if (minSalary <= vacancy.getSalary()) {
                System.out.printf("Рабочий %s - %s (%.2f) >>> Мне нужна эта работа! [%s - %s - %.2f]\n",
                        name, profession, minSalary, vacancy.getCompanyName(), vacancy.getProfession(), vacancy.getSalary());
                minSalary = vacancy.getSalary();
            } else {
                System.out.printf("Рабочий %s  - %s >>> Я найду работу получше (%.2f)! [%s - %s - %.2f]\n",
                        name, profession, minSalary, vacancy.getCompanyName(), vacancy.getProfession(), vacancy.getSalary());
            }
        }
    }
}
