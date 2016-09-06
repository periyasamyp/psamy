import java.io.*;
import java.util.*;
public class seed{

     public static void main(String []args){
         Scanner ob=new Scanner(System.in);
         int a,r,sum=0;
         a=ob.nextInt();
         sum=a;
         for(;a>0;)
         {
             r=a%10;
             sum=sum *r;
             a=a/10;
         }
         System.out.println("123 seed of"+sum);
     }
}
