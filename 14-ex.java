import java.util.Scanner;
public class ex14 {
public static void main (String [] args) {
	Scanner val = new Scanner(System.in);
	
	System.out.println("CALCULADORA DE AREAS ");
	System.out.println("--------------------- ");
	
	System.out.println("Digite o valor A: ");
	double A = val.nextDouble();
	System.out.println("Digite o valor B: ");
	double B = val.nextDouble();
	System.out.println("Digite o valor C: ");
	double C = val.nextDouble();
	
	double area_Tri = (A * C)/2;
	double pi = 3.14159;
	double area_Circ = pi * (C*C);
	double area_Trap = ((A+B)*C)/2;
	double area_Quad = B*B;
	double area_Ret = A*B;
	
	System.out.printf("TRIANGULO: %.2f%n", area_Tri);
	System.out.printf("CIRCULO : %.2f%n", area_Circ);
	System.out.printf("TRAPEZIO: %.2f%n", area_Trap);
	System.out.printf("QUADRADO: %.2f%n", area_Quad);
	System.out.printf("RETANGULO: %.2f%n", area_Ret);
	
	
	val.close();
}
}
