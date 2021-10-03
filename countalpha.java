import java.util.*;
public class countalpha
{
public static void main(String args[])
{
String s1; int a=0; char n;
Scanner sc = new Scanner (System.in);
System.out.println("Enter The Sentence : ");
s1 = sc.nextLine();
System.out.print("Enter The Letter, You Want To Search : ");
n = sc.next().charAt(0);
for(int i=0; i<s1.length(); i++)
{
if(s1.charAt(i)==n)
a=a+1;
}
System.out.println("The Number Of Times, Your Searched Letter Arrived is : " +a);
}
} 
