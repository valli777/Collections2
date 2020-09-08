import java.util.TreeMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
class Player{
private String name;
private String team;
private String skill;
public Player(String name,String team,String skill)
{
this.name=name;
this.team=team;
this.skill=skill;
}
public String toString()
{
	return name+"--"+team+"--"+skill;
}
}
class Tree{
public static void main(String... args)
{
Scanner sc=new Scanner(System.in);
TreeMap<String,Player> t=new TreeMap<>();
System.out.println("Enter the number of players");
int a=sc.nextInt();
for(int i=1;i<=a;i++)
{
System.out.println("Enter the details of the player "+i);if(i==1)sc.nextLine();
String key=sc.nextLine();
String l=sc.nextLine();
String m=sc.nextLine();
String n=sc.nextLine();
t.put(key,new Player(l,m,n));
}
Iterator itr=t.entrySet().iterator();
while(itr.hasNext())
{
	Map.Entry me=(Map.Entry)itr.next();
	System.out.println(me.getKey()+"--"+me.getValue());
     
}
}
}