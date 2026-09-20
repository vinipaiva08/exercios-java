import java.util.Scanner;

public class ex09 {
public static void main (String [] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("SOMADOR DE NUMEROS");
	System.out.println("-------------------");
	System.out.println("Digite um numero: ");
	int n1 = entrada.nextInt();
	System.out.println("Digite outro numero: ");
	int n2 = entrada.nextInt();
	int n3 = n1 + n2;
	
	System.out.println("Os numeros digitados foram " + n1 + " e " + n2 + " e a soma deles e: " + n3);
	entrada.close();
}
}
