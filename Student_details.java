import java.util.Scanner;

public class Student_details {
    public static void main(String[] args) {

        System.out.println("enter the number of students you want to print");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Students[] students = new Students[n];

        for(int i =0;i<n;i++){
            System.out.println("enter the student details"+(i+1)+" :");

            System.out.print("Name");
            String name = input.nextLine();
            input.nextLine();

            System.out.print("Rollno");
            int rollno = input.nextInt();
            input.nextLine();

            System.out.print("Marks");
            float marks = input.nextFloat();
            input.nextLine();

            students[i] = new Students(name, rollno, marks);



        }
        System.out.println("\n--- Student Details ---");
        for(Students s : students){
            s.Display_details();
            System.out.println("----------------------");
        }
        input.close();
        
    }
    
}
class Students{
    String name;
    int rollno;
    float marks;

    public Students(String name, int rollno, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks =marks;
    }

    public void Display_details(){
        System.out.println("Name :"+" "+name);
        System.out.println("rollno :"+" "+rollno);
        System.out.println("Marks :"+" "+marks);
    }
}

