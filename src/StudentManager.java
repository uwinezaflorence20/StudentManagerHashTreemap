import java.util.*;

public class StudentManager {

    public void addStudent(Map<Integer, String> students, int studentId, String name) {
        try {
            if (studentId <= 0) {
                throw new IllegalArgumentException("Student ID must be positive!");
            }
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be null or empty!");
            }
            students.put(studentId, name);
            System.out.println("Student added: ID = " + studentId + ", Name = " + name);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void sortStudents(Map<Integer, String> students) {
        try {
            TreeMap<Integer, String> sorted = new TreeMap<>(students);
            System.out.println("Sorted students:");
            for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
                System.out.println("ID = " + entry.getKey() + ", Name = " + entry.getValue());
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot sort null map.");
        }
    }

    public void searchStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.containsKey(studentId)) {
                System.out.println("Student found: ID = " + studentId + ", Name = " + students.get(studentId));
            } else {
                System.out.println("Student with ID " + studentId + " not found.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Student map is null.");
        }
    }

    public void removeStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.remove(studentId) != null) {
                System.out.println("Student with ID " + studentId + " removed.");
            } else {
                System.out.println("No student found with ID " + studentId);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Student map is null.");
        }
    }

    public void findStudentWithHighestId(Map<Integer, String> students) {
        try {
            if (students.isEmpty()) {
                System.out.println("No students in the record.");
                return;
            }
            int maxId = Collections.max(students.keySet());
            System.out.println("Student with highest ID: ID = " + maxId + ", Name = " + students.get(maxId));
        } catch (NullPointerException e) {
            System.out.println("Error: Student map is null.");
        }
    }

    public void findStudentWithLowestId(Map<Integer, String> students) {
        try {
            if (students.isEmpty()) {
                System.out.println("No students in the record.");
                return;
            }
            int minId = Collections.min(students.keySet());
            System.out.println("Student with lowest ID: ID = " + minId + ", Name = " + students.get(minId));
        } catch (NullPointerException e) {
            System.out.println("Error: Student map is null.");
        }
    }
}
