import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Map<Integer, String> students = new HashMap<>();

        // Valid input
        manager.addStudent(students, 1, "Alice");
        manager.addStudent(students, 2, "Bob");
        manager.addStudent(students, 3, "Charlie");

        // Invalid inputs
        manager.addStudent(students, -2, "Bob");              // Negative ID
        manager.addStudent(students, 3, null);                // Null name
        manager.addStudent(students, 4, "");                  // Empty name

        // Null key/value test
        try {
            students.put(null, "John");
        } catch (NullPointerException e) {
            System.out.println("Error: Null key is not allowed.");
        }

        try {
            students.put(5, null);
        } catch (NullPointerException e) {
            System.out.println("Error: Null value is not allowed.");
        }

        // Sorting
        manager.sortStudents(students);

        // Search
        manager.searchStudent(students, 1);   // Should find Alice
        manager.searchStudent(students, 10);  // Should not find

        // Remove
        manager.removeStudent(students, 1);   // Remove Alice
        manager.removeStudent(students, 99);  // Not found

        // Highest and Lowest ID
        manager.addStudent(students, 100, "Diane");
        manager.addStudent(students, 20, "Edward");
        manager.findStudentWithHighestId(students);
        manager.findStudentWithLowestId(students);
    }
}
