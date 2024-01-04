package simpleprogramofjava;
import java.util.Arrays;
public class loop {
public static void main (String[]args) {
	
int i=0;
while (i<=15) {
	System.out.println(i);
	i++;
	
do  {
	System.out.println(i);
	i++;
} while (i<=20);

for (i=0;i<=15; i++) {
	System.out.println(i);
	
String[] color= {"pink","yellow","blue"};
System.out.println(Arrays.toString(color));
System.out.println(color[1]);


for (int j=0;j<=10;j++) {
	if (j==4) {
		continue;
	}
 System.out.println(j);
}
}
}
}

}