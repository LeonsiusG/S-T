import java.util.Scanner;

public class Teachers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose one : 1. Student 2. Teacher");
        int role = scanner.nextInt();

        if (role == 2) {
            System.out.println("Choose one : 1. Full Time 2. Part Time");
            int type = scanner.nextInt();

            if (type == 1) {
                // Full-time teacher details
                String name = "Rina";
                String subject = "English";
                String unit = "Kurikulum";
                int age = 30;
                int salary = 5000000;

                System.out.println("--Full Time Teacher--");
                System.out.println("Name : " + name);
                System.out.println("Age : " + age);
                System.out.println("Subject : " + subject);
                System.out.println("Unit : " + unit);
                System.out.println("Salary : " + salary);
            } else if (type == 2) {
                // Part-time teacher details
                String name = "Arif";
                String subject = "Math";
                String unit = "Extracurricular";
                int age = 28;
                int salary = 2500000;

                System.out.println("--Part Time Teacher--");
                System.out.println("Name : " + name);
                System.out.println("Age : " + age);
                System.out.println("Subject : " + subject);
                System.out.println("Unit : " + unit);
                System.out.println("Salary : " + salary);
            } else {
                System.out.println("Invalid option for teacher type.");
            }
        } else if (role == 1) {
            // Student details
            String name = "Budi";
            int age = 16;
            String grade = "10th Grade";
            String major = "Science";

            System.out.println("--Student--");
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Grade : " + grade);
            System.out.println("Major : " + major);
        } else {
            System.out.println("Invalid role selected.");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
