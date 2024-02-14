public class Main2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Person student = new Student("ФИО","11-304");

        student.enrollment("1023");

        Person teacher = new Teacher("ФИО2","информатика");

        teacher.enrollment("2000");

        System.out.println(student.getClass().getName());
        System.out.println(teacher.getClass().getName());

        /*
        // Здесь будет ошибка компиляции - student для компилятора имеет тип Person
        System.out.println(student.getStudNumber());
        System.out.println(teacher.getNumberPass());
         */

        // Используем приведение типов
        System.out.println(((Student)student).getStudNumber());
        System.out.println(((Teacher)teacher).getNumberPass());
    }

}
