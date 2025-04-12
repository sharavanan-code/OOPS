import java.util.Scanner;

public class MultipleObjectsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the person you want to print");
        int n = input.nextInt();

        Person[] person = new Person[n];

        for(int i = 0; i<n; i++){

            System.out.println("enter the details"+(i+1)+"person");

            System.out.print("Name : ");
            String name = input.next();
            input.nextLine();

            System.out.print("Age : ");
            int age = input.nextInt();

            person[i] = new Person(name, age);



        }
        System.out.println("Displaying th person details");
        for(int i=0; i<n; i++){
            System.out.println("\nPerson " + (i + 1) + ":");
            person[i].display_info();

        }
        
    }
    
}
class Person{
    String name;
    int age ;

    public  Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void display_info(){
        System.out.println("Name"+" : "+name);
        System.out.println("Age"+" : "+age);
    }

}
