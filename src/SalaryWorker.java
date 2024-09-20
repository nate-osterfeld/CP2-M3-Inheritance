public class SalaryWorker extends Worker {
    // fields
    private double annualSalary;

    // constructor
    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, int hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(Person person, int hourlyPayRate, double annualSalary) {
        super(person, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(Worker worker, double annualSalary) {
        super(worker.getFirstName(),
                worker.getLastName(),
                worker.getID(),
                worker.getTitle(),
                worker.getYOB(),
                worker.getHourlyPayRate()); // getHourlyPayRate isn't needed, but required for worker constructor

        this.annualSalary = annualSalary;
    }

    // getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    // setters
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // overrides
    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.println("Weekly pay: $" + (annualSalary / 52));
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                super.toString() +
                "annualSalary=" + annualSalary +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + annualSalary;
    }

    @Override
    public String toJSON() {
        String workerJSON = super.toJSON();

        return workerJSON.substring(0, workerJSON.length() - 1)
                + ",\"annualSalary\":" + "\"" + annualSalary + "\"}";
    }

    @Override
    public String toXML() {
        String workerXML = super.toXML();

        return "<SalaryWorker>" + workerXML.substring(8, workerXML.length() - 9)
                + "<annualSalary>" + annualSalary + "</annualSalary>"
                + "</SalaryWorker>";
    }
}
