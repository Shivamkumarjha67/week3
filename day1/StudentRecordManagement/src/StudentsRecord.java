import java.util.Scanner;

public class StudentsRecord {
    public static void main(String[] args) {
        // Initializing the scanner object
        Scanner input = new Scanner(System.in);

        // Head of the singly linked list
        Student head = new Student(100, "Sahil", 11, 'C');
        Student temp = head;

        // Adding the 4 more student in linked list
        for(int i=1; i<3; i++) {
            int rollNumber = 100 + i;
            System.out.println("Enter the name of student: ");
            String name = input.next();
            System.out.println("Enter the age of the student: ");
            int age = input.nextInt();
            System.out.println("Enter the grade for the student: ");
            char grade = input.next().charAt(0);

            Student curr = new Student(rollNumber, name, age, grade);
            temp.next = curr;
            temp = curr;
        }

        // Adding the record in the beginning of the list and displaying it
//        head = addRecordInBeginning(head, input);
//        head = addRecordInMiddle(head, input, 3);
//        head = addRecordAtTheEnd(head, input);
//        displayRecord(head);
//        System.out.println("---------------------------------");

        head = deleteRecordByRollNumber(head, 101);
        displayRecord(head);
        updateGradeByRollNumber(head, 101);

        input.close();
    }

    private static void updateGradeByRollNumber(Student head, int rollNumber) {
        while(head != null && head.rollNumber != rollNumber) {
            head = head.next;
        }

        if(head != null) {
            head.setGrade('F');
        }
    }

    private static Student deleteRecordByRollNumber(Student head, int rollNumber) {
        if(head.rollNumber == rollNumber) return head.next;

        Student curr = head;
        Student prev = null;

        while(curr != null && curr.rollNumber != rollNumber) {
            prev = curr;
            curr = curr.next;
        }

        if(curr != null)
        prev.next = curr.next;

        return head;
    }

    private static Student addRecordAtTheEnd(Student head, Scanner input) {
        System.out.println("Enter the roll number: ");
        int rollNumber = input.nextInt();

        if(searchStudentByRollNumber(rollNumber, head)) {
            System.out.println("Already student exists with this roll number!! Try Again...");
            return addRecordInBeginning(head, input);
        }

        System.out.println("Enter the name of student: ");
        String name = input.next();
        System.out.println("Enter the age of the student: ");
        int age = input.nextInt();
        System.out.println("Enter the grade for the student: ");
        char grade = input.next().charAt(0);

        Student temp = new Student(rollNumber, name, age, grade);
        Student curr = head;

        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = temp;
        return head;
    }

    private static Student addRecordInBeginning(Student head, Scanner input) {
        System.out.println("Enter the roll number: ");
        int rollNumber = input.nextInt();

        if(searchStudentByRollNumber(rollNumber, head)) {
            System.out.println("Already student exists with this roll number!! Try Again...");
            return addRecordInBeginning(head, input);
        }

        System.out.println("Enter the name of student: ");
        String name = input.next();
        System.out.println("Enter the age of the student: ");
        int age = input.nextInt();
        System.out.println("Enter the grade for the student: ");
        char grade = input.next().charAt(0);

        Student temp = new Student(rollNumber, name, age, grade);
        temp.next = head;
        head = temp;

        return head;
    }

    private static boolean searchStudentByRollNumber(int rollNumber, Student head) {
        while(head != null) {
            if(head.rollNumber == rollNumber) return true;

            head = head.next;
        }

        return false;
    }

    private static Student addRecordInMiddle(Student head, Scanner input, int position) {
        if(position <= 0) {
            System.out.println("Enter the valid position..");
            return null;
        }

        System.out.println("Enter the roll number: ");
        int rollNumber = input.nextInt();

        if(searchStudentByRollNumber(rollNumber, head)) {
            System.out.println("Already student exists with this roll number!! Try Again...");
            return addRecordInBeginning(head, input);
        }

        System.out.println("Enter the name of student: ");
        String name = input.next();
        System.out.println("Enter the age of the student: ");
        int age = input.nextInt();
        System.out.println("Enter the grade for the student: ");
        char grade = input.next().charAt(0);

        Student temp = new Student(rollNumber, name, age, grade);
        position--;

        if(position == 0) {
            temp.next = head;
            head = temp;
        } else {
            position--;
            Student curr = head;

            while(position > 0) {
                curr = curr.next;
                position--;
            }

            temp.next = curr.next;
            curr.next = temp;
        }

        return head;
    }

    private static void displayRecord(Student head) {
        while(head != null) {
            head.displayStudentRecord();
            head = head.next;
        }
    }
}
