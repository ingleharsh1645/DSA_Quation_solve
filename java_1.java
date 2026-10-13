import java.util.*;
public class java_1 {
    // why java used the main() declare the static ==> used for the minimized the new memory creation and new object creation and constructor violaion
    // static : used the shared data or we are declare the without creating object
    // non static : private data for that class and we are declaring the creating the object

   public  class teacher{
        String name;
        static  int salary;

        void result_display(int marks){
            System.out.println("your marks are the :" + marks);
        }
    }

   public static void main(String[] args) {
        int marks = 36;
        teacher t1 = new teacher();
        teacher t2 = new teacher ();
        t1.salary = 20_000;
        t1.name="harsh";
        t2.name="Ruhi";
        t1.result_display(100);
        t2.result_display(2000);
    }

}


