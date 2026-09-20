import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner quadrante = new Scanner(System.in);
		
		System.out.println("Digite o ponto X: ");
		int x = quadrante.nextInt();
		
		System.out.println("Digite o ponto Y: ");
		int y = quadrante.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("Primeiro quadrante");
		}else if(x>0 && y<0) {
			System.out.println("Quarto quadrante");
		}else if(x<0 && y<0) {
			System.out.println("Terceiro quadrante");
		}else if(x<0 && y>0) {
			System.out.println("Segundo quadrante");
		}else if(x == 0 && y == 0) {
			System.out.println("Origem");
		}else if(x == 0 || y == 0) {
			System.out.println("Um dos valores e zero");
		}
		quadrante.close();
	}

}
