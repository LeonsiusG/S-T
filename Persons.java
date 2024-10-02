import java.util.Scanner;

public class Persons {

    public static class Person {
        String name;
        int age;
        String major;
        int studentNumber;
        int score;

        public Person(String name, int age, String major, int studentNumber, int score) {
            this.name = name;
            this.age = age;
            this.major = major;
            this.studentNumber = studentNumber;
            this.score = score;
        }

        public void displayStudent() {
            System.out.println("--Student--");
            System.out.println("Name : " + name);
            System.out.println("Major : " + major);
            System.out.println("Age : " + age);
            System.out.println("Student Number : " + studentNumber);
            System.out.println("Score : " + score);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose one: 1. Student 2. Teacher");
        int choice = scanner.nextInt();

        if (choice == 1) {
            String name = "Rio";
            String major = "RPL";
            int age = 15;
            int studentNumber = 2;
            int score = 90;

            Person student = new Person(name, age, major, studentNumber, score);
            student.displayStudent();
        } else if (choice == 2) {
            System.out.println("--Teacher--");
            System.out.println("Details for Teacher not specified.");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
