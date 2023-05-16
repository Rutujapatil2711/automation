package loopProgram;
import java.util.*;
public class table {

	public static void printTable(int num) {
		System.out.println("Write table of "+num);
for(int i = 1;i<=10;i++) {
	System.out.println(num*i);
}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number which table want to print: ");
		int number = sc.nextInt();
		sc.close();
		printTable(number);
	}

}
