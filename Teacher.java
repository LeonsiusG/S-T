import java.util.Scanner;

public class Teacher {
    String name;
    String subject;
    int age;
    int hoursWorked;

    public Teacher(String name, String subject, int age, int hoursWorked) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.hoursWorked = hoursWorked;
    }

    public void display() {
        System.out.println("--" + this.getClass().getSimpleName() + " Teacher--");
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Age: " + age);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + calculateSalary());
    }

    public int calculateSalary() {
        return 0; // Default salary for base Teacher
    }
}

class PartTimeTeacher extends Teacher {
    public PartTimeTeacher(String name, String subject, int age, int hoursWorked) {
        super(name, subject, age, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        return 1800000; // Example salary for part-time
    }
}

class FullTimeTeacher extends Teacher {
    public FullTimeTeacher(String name, String subject, int age, int hoursWorked) {
        super(name, subject, age, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        return 3600000; // Example salary for full-time
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose one : 1. Student 2. Teacher");
        int choice = scanner.nextInt();
        
        if (choice == 2) {
            System.out.println("Choose one : 1. Full Time 2. Part Time");
            int teacherType = scanner.nextInt();
            
            // Creating a Teacher object
            Teacher teacher;
            if (teacherType == 1) {
                teacher = new FullTimeTeacher("Roy", "Indonesian", 40, 30);
            } else {
                teacher = new PartTimeTeacher("Roy", "Indonesian", 40, 30);
            }
            
            // Display teacher information
            teacher.display();
        } else {
            // You can add a Student class and logic here if needed
            System.out.println("Student option not implemented.");
        }
        
        scanner.close();
    }
}
