import java.util.Scanner;
public class ex12 {
public static void main(String [] args) {
	Scanner dados = new Scanner(System.in);
	
	System.out.println("REVELA SALARIO ");
	System.out.println("----------------");
	
	System.out.println("Digite o seu numero: ");
	int num = dados.nextInt();
	System.out.println("Digite sua carga horaria semanal: ");
	int horas = dados.nextInt();
	System.out.println("Digite quanto voce recebe por hora: ");
	float hora_Paga = dados.nextFloat();
	
	float salario = horas * hora_Paga;
	
	System.out.println("NUMERO = " + num);
	System.out.println("SALARIO = R$" + salario);
	
	dados.close();
}
}
