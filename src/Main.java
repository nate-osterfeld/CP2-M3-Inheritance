import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("Joe", "Walsh", "000001", "Mr.", 1947, 22));
        workers.add(new Worker("Lindsey", "Buckingham", "000002", "Mr.", 1949, 28));
        workers.add(new Worker("Bob", "Weir", "000003", "Mr.", 1947, 26));
        workers.add(new SalaryWorker("Lou", "Reed", "000004", "Mr.", 1942, 0, 75000));
        workers.add(new SalaryWorker("Frank", "Zappa", "000005", "Mr.", 1940, 0, 80000));
        workers.add(new SalaryWorker("Syd", "Barrett", "000006", "Mr.", 1946, 0, 78000));

        for (int week = 1; week <= 3; week++) {
            for (Worker w: workers) {
                if (week != 2) {
                    if (w.getHourlyPayRate() == 0)
                        System.out.println("Week " + week + " (salary)");
                    else
                        System.out.println("Week " + week + " (hourly)");

                    System.out.println("Name: " + w.formalName());
                    w.displayWeeklyPay(40);
                } else {
                    if (w.getHourlyPayRate() == 0)
                        System.out.println("Week " + week + " (salary)");
                    else
                        System.out.println("Week " + week + " (hourly)");

                    System.out.println("Name: " + w.formalName());
                    w.displayWeeklyPay(50);
                }

                System.out.println();
            }
        }
    }
}