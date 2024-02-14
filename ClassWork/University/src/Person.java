public abstract class Person {

    protected String lastName;
    protected String firstName;
    protected String middleName;

    protected String order;

    // Определяем конструктор класса
    // Имя конструктора = имя класса
    // не указывается тип возвращаемого значения
    // можно указать аргументы
    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        System.out.println("Задействован конструктор с тремя аргументами");
    }

    public Person(String fio) {
        String[] fioArr = fio.split(" ");

        if (fioArr.length > 0) {
            this.lastName = fioArr[0];
        }
        if (fioArr.length > 1) {
            this.firstName = fioArr[1];
        }
        if (fioArr.length > 2) {
            this.middleName = fioArr[2];
        }
        System.out.println("Задействован конструктор с одним аргументом");
    }

    public Person() {
        System.out.println("Задействован конструктор по умолчанию");
    }

    public String toString() {
        return super.toString();
        //return lastName + " " + firstName + " " + middleName;
    }

    public abstract String stringValue();

    /**
     * Метод абстрактный, процедуры зачисления различны для разных категорий
     * @param order
     */
    public abstract void enrollment(String order);
}
