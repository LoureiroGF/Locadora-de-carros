
package prj_loc;


//classe principal, responsável por rodar o programa


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
		
		
		dataIn = JOptionPane.showInputDialog("Digite a data de início da locação: ");
		dataIn = JOptionPane.showInputDialog("Digite a data de fim da locação: ");
			
		
		while (codFid!=1 || codFid!=2){
			JOptionPane.showMessageDialog(null,"Erro! Não existe este código de fidelização");	
			codFid = JOptionPane.showInputDialog("Digite o código de cliente: 1-Fidelização e 2-Regular: ");	
			}
		
		while (numPas>7 || numPas < 1){
			JOptionPane.showMessageDialog(null,"Erro! Não temos carros disponíveis para a quantidade de passageiros desejada:");	
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
		
		JOptionPane.showMessageDialog("Menor valor", "Veículo:" + carro, "/n Locadora: " + locad, "/n Valor: " + valor, "/n Plano:" + plano);
		
	}
		
}
