import java.io.*;

class Input3
{
 public static void main(String a[])throws IOException  //(Exception asa lihu shakta)
 {
   InputStreamReader iobj = new InputStreamReader(System.in);
   BufferedReader bobj = new BufferedReader(iobj);

   System.out.println("Enter string");
   String str = bobj.readLine();

   System.out.println("Enter integer");
   int no =  Integer.parseInt(bobj.readLine());

   System.out.println("Enter float");
   float f = Float.parseFloat(bobj.readLine());

   System.out.println("Enter double");
   double d = Double.parseDouble(bobj.readLine());

   System.out.println("Entered string is : "+str);
   System.out.println("Entered integer is : "+no);
   System.out.println("Entered float is : "+f);
   System.out.println("Entered double is : "+d);



 
 }
}

stringch ka??????
java cha use web krta ...applicatn veveg lya machine vr run hotat...so safest way to store data as def is samw...incase of integer kuthe 2 asel 4 asel...but string sagli kde same uttam sadhan ahe string sooooooo used string