public class Student {
    public int rollNumber;
    private String name;
    private int age;
    private char grade;
    public Student next;

    Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        next = null;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void displayStudentRecord() {
        System.out.println("Name of the student is " + name + " and roll number is " + rollNumber + ". Age of student is " + age + ". Grade he got is " + grade);
    }
}
