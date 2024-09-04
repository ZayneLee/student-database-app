public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many new users we want to add
        Student s1 = new Student();
        s1.enroll();
        s1.payTuition();
        System.out.println(s1.toString());
        // Create n number of new students
    }
}
