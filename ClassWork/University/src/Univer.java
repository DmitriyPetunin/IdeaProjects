public class Univer {
    private Person[] persons;
    private int count = 0;

    public Univer() {
        persons = new Person[10000];
    }
    public void addPerson(Person person, String order) {
        person.enrollment(order);
        persons[count++] = person;
    }

    public void printReestr() {
        for(int i = 0; i < count; i++)
            System.out.println(persons[i]);
    }
}
