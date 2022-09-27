import java.io.*;

class StringX
{

 public static void main(String a[])
{
 //string literals..new keyword nhie so yancha memory milte string literal pool location vr
 String str1 = "Hello";
 String str2 = "World";

 System.out.println(str1); 
 System.out.println(str1.length()); 

 String str3 = str1 + str2; //ithe java valyani + overload krun thevlay
 System.out.println(str3); 
  String str4 = "Hello";

 //string objects
 String str4 = new String("Hello");
 String str5 = new String("World");
 String str6 = new String("hello");
}

}