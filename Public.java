import java.util.Scanner;
import java.util.ArrayList;
class Public{
public static void main(String[] args)
{
int sum=0;
int sum1=0;
ArrayList<Integer> l=new ArrayList<>();
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=0;i<a;i++)
l.add(sc.nextInt());
for(int i=0;i<a;i=i+2)
{
if(l.get(i)%2!=0)
sum=sum+l.get(i);
}
for(int i=1;i<a;i=i+2)
{
if(l.get(i)%2==0)
sum1=sum1+l.get(i);
}
System.out.println(sum);
System.out.println(sum1);
}
}