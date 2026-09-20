public class ex07 {
public static void main(String [] args) {
	int ano_Atual = 2026;
	boolean bissexto;
	for(int i=0;i<10;i++) {
		if(ano_Atual%400==0 || ano_Atual%4==0 && ano_Atual%100!=0) {
			bissexto = true;
			System.out.println("O ano " + ano_Atual + " e bissexto ");

	}else {
		bissexto = false;
		System.out.println("O ano " + ano_Atual + " nao e bissexto ");
	}
		ano_Atual++;
	}
}
}
