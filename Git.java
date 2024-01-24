import TaskNinth.Student
public class Git {
    public static void main(String[] args) {
        // Creating a Student object with parameters
        Student obj = new Student("Sovisal", "Phnom Penh", 5);

        try {
            // Adding grades for different courses
            obj.addCourseGrade("Java", 100);
            obj.addCourseGrade("Network", 90);
            obj.addCourseGrade("STA", 100);
            obj.addCourseGrade("Ca", 100);
            obj.addCourseGrade("MIS", 80);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Printing the grades
        System.out.println("\n=====================================");
        obj.printGrade();
    }
}
