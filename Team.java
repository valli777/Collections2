import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Comparator;
class MatchComparator implements Comparator<Team>{
 @Override
public int compare(Team s1,Team s2) {
 if(s1.matches==s2.matches)
 return 0;
else if(s1.matches > s2.matches)
 return 1;
 else
return -1;
 }
 
}
 
class Team{
String name;
Long matches;
public Team(String name,Long matches){
this.name=name;
this.matches=matches;
}
public String toString()
{
return name+" - "+matches;
}
}
class Main
{
public static void main(String... args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of teams:");
int a=sc.nextInt();
ArrayList<Team> l=new ArrayList<>();
for(int i=1;i<=a;i++)
{
System.out.println("Enter team "+i+" details");
System.out.println("Enter Name");sc.nextLine();
String s=sc.nextLine();
System.out.println("Enter number of matches");
Long lo=sc.nextLong();
l.add(new Team(s,lo));
}
Collections.sort(l,new MatchComparator());
for(Team t:l)
System.out.println(t);
}
}