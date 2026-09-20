import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite um valor X(de 1 ate 1000): ");
		int x = valor.nextInt();
		
		if(x < 1 || x > 1000) {
			System.out.println("Valor invalido");
		}
		for(int i = 0; i<=x; i++) {
			if(i<x && i%2 == 1) {
				
				System.out.println(i);
			}
		}
		valor.close();
	}

}
