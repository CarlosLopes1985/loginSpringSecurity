package logica;

import java.util.List;

 

public class CalculaCorrentista {

	
	
	
	public List<Correntista> getDesconto(List<Correntista> listas){
		int pos=0;
		 for(Correntista c : listas){
			 if (c.getSaldo()>=10000.){
				 c.setSaldo(c.getSaldo() - 4.5);
			 }
			 
			 listas.set(pos++, c); //Atualizando a Lista
		 }
		return listas; //Retornando a Lista Atualizada ...
	}
	
	
	
	
	public static void main(String[] args) {
		Logica lo = new Logica();
		
		CalculaCorrentista cc = new CalculaCorrentista();
		
		  System.out.println( cc.getDesconto(lo.getLista()));
		
		  
		
	}
	
}
