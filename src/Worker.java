public class Worker extends Person {
    // fields
    private int hourlyPayRate;

    // constructors
    public Worker(String firstName, String lastName, String ID, String title, int YOB, int hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);

        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, int hourlyPayRate) {
        super(person.getFirstName(),
                person.getLastName(),
                person.getID(),
                person.getTitle(),
                person.getYOB());

        this.hourlyPayRate = hourlyPayRate;
    }

    // methods
    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40)
            return hoursWorked * hourlyPayRate;

        return hoursWorked * (hourlyPayRate * 1.5);
    }

    public void displayWeeklyPay(double hoursWorked) {
        String format = "%.2f"; // rounded to 2 decimals
        double regularPay = hoursWorked * hourlyPayRate;
        double overtimePay = (hoursWorked - 40) * hourlyPayRate;
        double totalPay = regularPay + overtimePay;

        if (hoursWorked <= 40) {
            System.out.println("Regular pay: $" + String.format(format, regularPay));
            System.out.println("Overtime pay: $0.00");
            System.out.println("Total pay: $" + String.format(format, totalPay));
        } else {
            System.out.println("Regular pay: $" + String.format(format, regularPay));
            System.out.println("Overtime pay: $" + String.format(format, overtimePay));
            System.out.println("Total pay: $" + String.format(format, totalPay));
        }
    }

    // getters
    public int getHourlyPayRate() {
        return hourlyPayRate;
    }

    // setters
    public void setHourlyPayRate(int hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    // overrides
    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + hourlyPayRate;
    }

    @Override
    public String toJSON() {
        String personJSON = super.toJSON();

        return personJSON.substring(0, personJSON.length() - 1)
                + ",\"hourlyPayRate\":" + "\"" + hourlyPayRate + "\"}";
    }

    @Override
    public String toXML() {
        String personXML = super.toXML();

        return "<Worker>" + personXML.substring(8, personXML.length() - 9)
                + "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>"
                + "</Worker>";
    }
}
