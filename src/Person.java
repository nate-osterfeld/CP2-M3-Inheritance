import java.util.Calendar;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    // constructor
    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }


    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public int getYOB() {
        return YOB;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public String getAge() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - YOB;
        return String.valueOf(age);
    }

    public String getAge(int year) {
        int age = year - YOB;
        return String.valueOf(age);
    }

    // data formatting
    public String toCSV() {
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title +
                ", " + this.YOB;
    }

    public String toJSON() {
        String retString = "";
        char DQ = '"'; // double quote

        retString = "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + this.firstName + DQ + ",";
        retString += DQ + "lastName" + DQ + ":" + DQ + this.lastName + DQ + ",";
        retString += DQ + "title" + DQ + ":" + DQ + this.title + DQ + ",";
        retString += DQ + "yob" + DQ + ":" + DQ + this.YOB + DQ;

        return "{" + retString + "}";
    }

    public String toXML() {
        String retString = "";

        retString = "<Person>" + "<ID>" + this.ID + "</ID>";
        retString += "<firstName>" + this.firstName + "</firstName>";
        retString += "<lastName>" + this.lastName + "</lastName>";
        retString += "<title>" + this.title + "</title>";
        retString += "<yob>" + this.YOB + "</yob>" + "</Person>";

        return retString;
    }

    // Overrides
    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", yob=" + YOB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(ID, person.ID) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, ID, title, YOB);
    }
}
