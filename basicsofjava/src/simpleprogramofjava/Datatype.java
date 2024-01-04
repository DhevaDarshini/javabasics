package simpleprogramofjava;
import java.util.Scanner;

public class Datatype {
public static void main(String[]args) {
	Scanner obj = new Scanner (System.in);
	System.out.println("enter the details");
	String name = obj.nextLine();
	System.out.println("user name is :"+name);
	int age=obj.nextInt();
	System.out.println("user age is : "+21);
	
	
	short salary=21000;
	int myid=56789763;
	long myaadhar=36888484933738l;
	char initial = 'p';
	float height = 5.3f;
	double heightscm = 164.09878;
	boolean position = true;
	System.out.println(age);
	System.out.println(salary);
	System.out.println(myid);
	System.out.println(myaadhar);
	System.out.println(initial);
	System.out.println(height);
	System.out.println(heightscm);
	System.out.println(position);
	
	
	
	
}



}
