package prj_loc;


//Associa os dados de cada locadora com os carros que tem dispon�vel, bem como a capacidade de cada carro que cada locadora 
//fornece.

import prj_loc.Carros;
public class Locadora {


	Carros carro = new Carros();
	
	public int SouthCar(){ // Retorna a quantidade de passageiros poss�veis com carro que a locadora trabalha
		return carro.Compacto();
		
	}
	
	public int WestCar(){
		return carro.Esportivo();
	}
	
	public int NorthCar(){
		return carro.Suv();
		
	}
	
	

}
