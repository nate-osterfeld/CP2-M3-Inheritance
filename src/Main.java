public class Main {
    public static void main(String[] args) {
        Person joe = new Person("Joe", "Walsh", "000001", "Mr.", 1960);
        Worker joeWorker = new Worker(joe, 20);

        joeWorker.displayWeeklyPay(60);

        SalaryWorker joeSalary = new SalaryWorker(joeWorker, 0, 75000);

        System.out.println("toString \n" + joeSalary.toString());
        System.out.println("toCSV \n" + joeSalary.toCSV());
        System.out.println("toJSON \n" + joeSalary.toJSON());
        System.out.println("toXML \n" + joeSalary.toXML());
    }
}