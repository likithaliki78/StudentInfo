import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollnumber = Integer.parseInt(sc.nextLine()); 

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = Integer.parseInt(sc.nextLine()); 

            Student obj = new Student(name, rollnumber, course, marks);
            obj.display();

        } catch (Exception e) {
            System.out.println("Input Error: " + e);
        } finally {
            sc.close(); 
        }
    }
}

class Student {
    private String name;
    private int rollnumber;
    private String course;
    private int marks;

    public Student(String name, int rollnumber, String course, int marks) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.course = course;
        this.marks = marks;
    }

    public String grade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    public void display() {
        System.out.println("\n--- Student Info ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade(marks));
    }
}
