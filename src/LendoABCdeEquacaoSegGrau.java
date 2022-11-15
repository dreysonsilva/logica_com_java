
public class LendoABCdeEquacaoSegGrau {

	public static void main(String[] args) {
		 /*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
		   segundo grau e mostre o valor de Delta.*/
		
        double valorA = 10;
        double valorB = 35;
        double valorC = 5;
        
        double delta = Math.pow(valorB,2)- 4 * valorA * valorC;

        double Xpositivo = (valorB + Math.sqrt(delta))/2*valorA; 
        double Xnegativo = (-valorB - Math.sqrt(delta))/2*valorA;
        
	    System.out.println("Seu Deltinha e "+ delta);
	    System.out.println("Seu Xpositivo e " + Xpositivo);
        System.out.println("Seu Xnegativo e " + Xnegativo);
	}
}