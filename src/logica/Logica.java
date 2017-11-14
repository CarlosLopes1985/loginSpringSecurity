package logica;

import java.util.ArrayList;
import java.util.List;

public class Logica {

	
	private List<Correntista> lista;
	

	public   List<Correntista> getLista() {
		  lista = new ArrayList<Correntista>();
		  lista.add(new Correntista(1,"jose",330.));
		  lista.add(new Correntista(2,"carlos",15000.));
		  lista.add(new Correntista(3,"marcelo",11000.));
		return lista;
	}

	public   void setLista(List<Correntista> lista) {
		 this.lista = lista;
	}
	
	
	
	
	public List<Correntista> getDesconto(){
		int pos=0;
		 for(Correntista c : getLista()){
			 if (c.getSaldo()>=10000.){
				 c.setSaldo(c.getSaldo() - 4.5);
			 }
			 
			 lista.set(pos++, c); //Atualizando a Lista
		 }
		return lista; //Retornando a Lista Atualizada ...
	}
	
	
}
