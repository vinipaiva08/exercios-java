import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Digite quantos valores voce deseja ler: ");
		int n = valores.nextInt();
		int cont=1, dentro=0, fora=0;
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite o " + cont + ".o valor");
			int x = valores.nextInt();
			cont++;
			if(x>=10 && x<=20) {
				dentro++;
			}else {
				fora++;
			}
		}
		System.out.println("De todos os valors digitados " + dentro + " ficaram dentro do parametro");
		System.out.println("Enquanto " + fora + " ficaram fora");
		valores.close();
	}

}
