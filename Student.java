import java.util.ArrayList;
import java.util.Scanner;
public class Student {
	int id;
	String name;
	double cgpa;
	
	public Student(int id, String name,double cgpa){
		this.id= id;
		this.name=name;
		this.cgpa=cgpa;
	}
public static void main (String[] args) {
	Student s1= new Student(101,"John",2.5);
	ArrayList<Integer> s = new ArrayList<Integer>();
	s.add(10);
	System.out.println(s);
	s.add(20);
	System.out.println(s);
	s.add(30);
	System.out.println(s);
	s.add(40);
	System.out.println(s);
	
	//Getting element
	System.out.println(s.get(2));
	int S =s.get(1);
	System.out.println(S);
	
	//size of arraylist
	
	
	
	
	
	
	//deletion
	
	
	
	
	
	//itr
	
for(int i=0;i<s.size();i++)
{
	System.out.print(s.get (i));
}
}
}
