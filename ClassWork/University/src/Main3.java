public class Main3 {
    public static void main(String[] args) {

        Univer univer = new Univer();

        Student student = new Student("ФИО","11-304");

        Teacher teacher = new Teacher("ФИО2","информатика");

        univer.addPerson(student, "1213");
        univer.addPerson(teacher, "8889");

        univer.printReestr();
    }
}
