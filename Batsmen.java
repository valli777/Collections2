import java.util.ArrayList;
import java.util.Scanner;
public class Batsmen{
public static void main(String... args)
{
int sum=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
ArrayList<Integer> l=new ArrayList<>();
for(int i=0;i<a;i++)
l.add(sc.nextInt());
for(int i=1;i<a;i=i+2)
sum=sum+l.get(i);
System.out.println(sum);
}
}