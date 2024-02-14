import java.util.UUID;

public class Student extends Person{
    private String group;

    private String studNumber;

    public Student(String lastName, String firstName, String middleName) {
        // переадресовываем в конструктор родительского класса Person
        super(lastName, firstName, middleName);
    }
    public Student(String fio, String group) {
        // переадресовываем в конструктор родительского класса Person
        super(fio);
        this.group = group;
    }

    public String getStudNumber() {
        return studNumber;
    }

    public String stringValue() {
        return super.toString() + " " + group;
    }

    public String toString() {
        return "Студент " + lastName + " номер студ. билета " + studNumber;
    }

    public void enrollment(String order) {
        this.order = order;

        studNumber = UUID.randomUUID().toString();
    }
}
