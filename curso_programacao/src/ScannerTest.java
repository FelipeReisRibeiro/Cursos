import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		x = sc.next();
		
		System.out.println("A palavra digitada foi " + x);
		
		int y;
		
		y = sc.nextInt();
		System.out.println("o numero digitado foi " + y);
		
				
		double z;
		Locale.setDefault(Locale.US); //para o sistema aceitar o .
		z = sc.nextDouble();
		System.out.println("o segundo numero digitado foi " + z);
		
		sc.close();
	}
}
