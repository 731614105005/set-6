# set-6
import java.io.*;
 import java.util.*;
 public class Leap
 {
   public static void main(String args[])throws IOException
   {
    Scanner sc=new Scanner(System.in);
     int year=sc.nextInt();
     if(year%4==0 || year%100==0 || year%400==0)
     {
       System.out.println("year is leapyear");
       }
       else
       {
         System.out.println("year is not a leapyear");
         }
         }
         }
