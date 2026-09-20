import java.util.Scanner;

public class ex10 {
public static void main(String [] args) {
	Scanner raio = new Scanner(System.in);
	
	System.out.println("Informe o valor do raio: ");
	double r = raio.nextDouble();
	double pi = 3.14159;
	double area = pi*(r*r);

	System.out.printf("O valor do raio e: %.4f%n", area);
	raio.close();
}
}
