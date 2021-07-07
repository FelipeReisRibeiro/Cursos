import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		double x = 23;
		int y = 10;
		int idade = 32;
		double renda = 1035.0;
		
		String product1 = "Cumputer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which price is $%.2f %n",product1, price1);
		System.out.printf("%s, which price is $%.2f %n",product2, price2);
		System.out.printf("Record: %n %n %d yers old, code %d and gender:"+ gender, age, code);
		System.out.printf("%n %nMesaure with eight decimal places: %.8f %n",measure);
		System.out.printf("Rouded (three decimal places): %.3f %n",measure);
		Locale.setDefault(Locale.US);// configurar a localização muda de , para .
		System.out.printf("US decimal point: %.3f %n",measure);

		
		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(x + y + " Ola Mundo!!!");
//		
//		System.out.printf("%.2f%n", x);//printf para delimitar
//		System.out.printf("%.4f%n", x);//printf para delimitar
//		Locale.setDefault(Locale.US);// configurar a localização
	//	System.out.printf("%.2f%n", x);//printf para delimitar
		
	//	System.out.printf("Resultado =  %.2f metros", x);//printf concatenando
		//System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // exemplo utilizando %s String %d doble
	}

}
