public class Student {
    String name;
    void getStudentName() {
        System.out.println("Name of student is " + name);
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Digvijay";
        student.getStudentName();
    }

}