import java.util.Calendar;

import javax.swing.JOptionPane;

public class CalcAnoVerSePodeVotar {

	public static void main(String[] args) {
		/*18) Fa�a um programa que leia o ano de nascimento de uma pessoa, calcule a idade
		dela e depois mostre se ela pode ou n�o votar.
		
		*DATA 
		*Calendar.getInstance().getTime());

		//ANO
		Calendar.getInstance().get(Calendar.YEAR);

		//M�S
		Calendar.getInstance().get(Calendar.MONTH);
		*/
		
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe ano de nascimento"));
		int verificarSePodeVotar = Calendar.getInstance().get(Calendar.YEAR)-ano;
		if(verificarSePodeVotar>16) {
			System.out.println("Voc� j� poder� votar, mas ainda n�o obrigat�rio.");
		}else {
			System.out.println("Ainda n�o pode votar");
		}		
	}
}