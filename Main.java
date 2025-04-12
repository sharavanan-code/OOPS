public class Main{
    public static void main(String[] args) {
        Student s1 = new Student("sharavanan", 213 ,100);
        System.out.println(s1);
        
    }
}
class Student{
    String name;
    int rollno;
    float marks;

    public  Student(String name, int rollno, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;

    }

    public String toString(){
        return "Name: " + name + ", Roll No: " + rollno + ", Marks: " + marks;
    }
}