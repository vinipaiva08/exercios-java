import java.util.Scanner;
public class ex13 {
public static void main(String [] args) {
	Scanner pecas = new Scanner(System.in);
	
	System.out.println("CALCULA VALOR DE PECAS ");
	System.out.println("------------------------ ");
	
	System.out.println("Digite o codigo da peca 1: ");
	int cod_P1 = pecas.nextInt();
	System.out.println("Digite a quantidade de pecas 1: ");
	int quant_P1 = pecas.nextInt();
	System.out.println("Digite o valor unitario da peca 1: ");
	float valor_P1 = pecas.nextFloat();
	
	System.out.println("Digite o codigo da peca 2: ");
	int cod_P2 = pecas.nextInt();
	System.out.println("Digite a quantidade de pecas 2: ");
	int quant_P2 = pecas.nextInt();
	System.out.println("Digite o valor unitario da peca 2: ");
	float valor_P2 = pecas.nextFloat();
	
	float valor_Final = quant_P1 * valor_P1 + quant_P2 * valor_P2;
	System.out.println("VALOR A PAGAR: R$" + valor_Final);
	
	pecas.close();
}
}
