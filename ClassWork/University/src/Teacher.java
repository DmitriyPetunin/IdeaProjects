import java.util.UUID;

public class Teacher extends Person{
    private String subject;

    private String numberPass;

    public Teacher(String lastName, String firstName, String middleName) {
        // переадресовываем в конструктор родительского класса Person
        super(lastName, firstName, middleName);
    }

    public Teacher(String fio, String subject) {
        // переадресовываем в конструктор родительского класса Person
        super(fio);
        this.subject = subject;
    }

    public String getNumberPass() {
        return numberPass;
    }

    public String stringValue() {
        return super.toString() + " " + subject;
    }

    public String toString() {
        return "Преподаватель " + lastName + " номер пропуска " + numberPass;
    }
    public void enrollment(String order) {
        this.order = order;

        numberPass = UUID.randomUUID().toString();

    }

}
