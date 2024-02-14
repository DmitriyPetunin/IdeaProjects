public class Main {
    public static void main(String[] args) {
        //Person person = new Person();

        Student student = new Student("ФИО","11-304");

        Teacher teacher = new Teacher("ФИО2","информатика");

        System.out.println(student.stringValue());
        System.out.println(teacher.stringValue());
    }
}