
package prj_loc;


//classe principal, respons�vel por rodar o programa


import javax.swing.JOptionPane;
import prj_loc.CalculaCusto;


public class LocadoraPrincipal {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dataIn;
		String dataFim;
		int codFid;
		int numPas;
		boolean fid;
		
		String carro;
		String locad;
		float valor;
		String plano;
		
		
		dataIn = JOptionPane.showInputDialog("Digite a data de in�cio da loca��o: ");
		dataIn = JOptionPane.showInputDialog("Digite a data de fim da loca��o: ");
			
		
		while (codFid!=1 || codFid!=2){
			JOptionPane.showMessageDialog(null,"Erro! N�o existe este c�digo de fideliza��o");	
			codFid = JOptionPane.showInputDialog("Digite o c�digo de cliente: 1-Fideliza��o e 2-Regular: ");	
			}
		
		while (numPas>7 || numPas < 1){
			JOptionPane.showMessageDialog(null,"Erro! N�o temos carros dispon�veis para a quantidade de passageiros desejada:");	
			numPas = JOptionPane.showInputDialog("Digite a quantidade de passageiros desejada:");	
			}
		
		if (codFid == 1){
			fid = true;
		}else if (codFid == 2){
			fid = false;
		}
		
		CalculaCusto custo = new CalculaCusto(dataIn, dataFim, fid, numPas);
		carro = custo.getVeiculo();
		locad = custo.getLoca();
		valor = custo.getValor();
		plano = custo.getPlano();
		
		JOptionPane.showMessageDialog("Menor valor", "Ve�culo:" + carro, "/n Locadora: " + locad, "/n Valor: " + valor, "/n Plano:" + plano);
		
	}
		
}
