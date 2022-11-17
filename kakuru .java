
package code;
import java.util.Scanner;

public class Ambrose {
    
 public static void main(String[] args)

   {

      float[] marks = new float[6];

      float sum=0;

      Scanner scan = new Scanner(System.in);

      

      System.out.print("Enter Marks Obtained in 6 Subjects: ");

      for(int i=0; i<6; i++)

      {

     sum += marks[i];

      }

           float avg = sum/6;

      String grade = "";

       if(avg>=80)

       System.out.println("A");


      else if(avg>=75 && avg<79)

        System.out.println("B+");

      else if(avg>=70 && avg<74)
System.out.println("B");
        

      else if(avg>=65 && avg<69)

         System.out.println("C+");

      else if(avg>=60 && avg<64)

         System.out.println("C");

      else if(avg>=55 && avg<59)

       
        System.out.println("D+");

      else if(avg>=50 && avg<54)

        
System.out.println("D");
      

      else if(avg<=49)

         System.out.println("F");

                

   }

}
