class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    // 4-argument constructor[cite: 1]
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // Overloaded constructor chaining to the 4-arg constructor via this(...)[cite: 1]
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    // Method calculating total credits[cite: 1]
    public int totalCredits() {
        return credits + labCredits;
    }
}

public class MainM3 {
    public static void main(String[] args) {
        Course theoryCourse = new Course("21CSC201J", "Data Structures", 4);
        Course labCourse = new Course("21CSC205L", "DSA Lab", 3, 1);

        System.out.println(theoryCourse.code + " total credits: " + theoryCourse.totalCredits());
        System.out.println(labCourse.code + " total credits: " + labCourse.totalCredits());
    }
}