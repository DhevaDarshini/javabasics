package simpleprogramofjava;

public class Proj {
public static void main(String[]args) {
	
	int year =2000;
	if ((year%4==0)||(year%400==0)) {
		System.out.println("Modified as leap year");
		
	}
	else {
		System.out.println(" its not modified as leap year");
		
	  }
   }
}
