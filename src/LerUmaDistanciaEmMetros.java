import java.util.Scanner;

public class LerUmaDistanciaEmMetros {

	public static void main(String[] args) {
		/*
		 * 8) Desenvolva um programa que leia uma distância em metros e mostre os valores
			  relativos em outras medidas.
			  Ex:
		   	  Digite uma distância em metros: 185.72
			  A distância de 85.7m corresponde a:
			  0.18572Km
			  1.8572Hm
			  18.572Dam
			  1857.2dm
			  18572.0cm
			  185720.0mm
		 * */
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma distância em metros: ");
		double distancia = Double.parseDouble(scan.next());
		
		System.out.println(distancia*0.001 +" km");
		System.out.println(distancia*0.01 +" hn");
		System.out.println(distancia*0.1 +" dam");
		System.out.println(distancia*100 +" cm");
		System.out.println(distancia*1000 +" mm");
	}

}