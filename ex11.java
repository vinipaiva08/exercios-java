import java.util.Scanner;
public class ex11 {
public static void main(String [] args) {
	Scanner valores = new Scanner(System.in);
	
	System.out.println("SOMADOR QUATERNARIO: ");
	System.out.println("---------------------");
	System.out.println("Digite o primeiro valor: ");
	int A = valores.nextInt();
	System.out.println("Digite o segundo valor: ");
	int B = valores.nextInt();
	System.out.println("Digite o terceiro valor: ");
	int C = valores.nextInt();
	System.out.println("Digite o quarto valor: ");
	int D = valores.nextInt();
	
	int produto = (A * B - C * D);
	System.out.println("A diferença do produto entre os quatro valores e: " + produto);
	valores.close();
}
}
