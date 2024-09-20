public class Main {
    public static void main(String[] args) {
        Person joe = new Person("Joe", "Walsh", "000001", "Mr.", 1960);
        Worker joeWorker = new Worker(joe, 20);

        joeWorker.displayWeeklyPay(60);
        System.out.print(joeWorker.toXML());
    }
}