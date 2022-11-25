import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o ano que deseja saber se é bissexto");
		int ano = Integer.parseInt(scanner.next());
		
		if(ano%4==0) {
			System.out.println("Opa, ano bissexto");
		}else {
			System.out.println("Não é um ano bissexto");
		}
	}

}
