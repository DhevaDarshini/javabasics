package simpleprogramofjava;

public class son extends Father {
public void education() {
	System.out.println("IT");
	
}
public static void main (String[]args) {
	son obj = new son();
	obj.business();
	obj.education();
	obj.vehicle();
	obj.properties();
	
	}
}
