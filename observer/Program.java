package observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov", Profession.MIDDLE);
        Master petrov = new Master("Petrov", Profession.SENIOR);
        Student sidorov = new Student("Sidorov", Profession.JUNIOR);
        Manager semenov = new Manager("Semenov", Profession.JUNIOR);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(semenov);

        Vacancy vacancyJuniour = new Vacancy(geekBrains,20000, Profession.JUNIOR);
        Vacancy vacancyMiddle = new Vacancy(google, 30000, Profession.MIDDLE);
        Vacancy vacancySenior = new Vacancy(yandex, 50000, Profession.SENIOR);

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee(vacancyJuniour);
            google.needEmployee(vacancyMiddle);
            yandex.needEmployee(vacancySenior);
        }
    }

}
