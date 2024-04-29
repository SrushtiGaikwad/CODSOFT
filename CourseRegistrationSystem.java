import java.util.ArrayList;
import java.util.List;

class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    private List<Student> enrolledStudents;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            return true;
        }
        return false; // Course is full
    }

    public boolean removeStudent(Student student) {
        return enrolledStudents.remove(student);
    }
}

class Student {
    private int id;
    private String name;
    private List<Course> registeredCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>(); // Ensure that you've imported ArrayList as well
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void enrollCourse(Course course) {
        registeredCourses.add(course);
        course.enrollStudent(this);
    }

    public void dropCourse(Course course) {
        registeredCourses.remove(course);
        course.removeStudent(this);
    }

    // Getter and setter methods for id, name, and registeredCourses

    // Other methods as needed
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        // Example usage
        Course course1 = new Course("CS101", "Introduction to Programming", "Learn basics of programming", 30, "Mon/Wed 9:00-10:30");
        Course course2 = new Course("CS201", "Data Structures", "Study advanced data structures", 25, "Tue/Thu 11:00-12:30");

        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        student1.dropCourse(course1);

        // Display course information
        System.out.println("Available Courses:");
        displayCourseInfo(course1);
        displayCourseInfo(course2);
    }

    public static void displayCourseInfo(Course course) {
        System.out.println("Course Code: " + course.getCode());
        System.out.println("Title: " + course.getTitle());
        System.out.println("Description: " + course.getDescription());
        System.out.println("Capacity: " + course.getCapacity());
        System.out.println("Schedule: " + course.getSchedule());
        System.out.println("Enrolled Students: " + course.getEnrolledStudents().size());
        System.out.println();
    }
}
