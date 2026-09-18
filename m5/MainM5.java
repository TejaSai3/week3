class Student {
    // Instance fields[cite: 1]
    String name;
    double attendance;

    // Static fields shared across all instances[cite: 1]
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    public Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++; // Increments per object creation[cite: 1]
    }

    // Static method accessing only static members[cite: 1]
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class MainM5 {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 85.5);
        Student s2 = new Student("Anitha", 92.0);

        // Accessed through class name, not instances[cite: 1]
        Student.printCollegeInfo();
    }
}