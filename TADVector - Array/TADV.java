package Classes;

import java.util.Arrays;

public class TADV {
	Object elements[];
	int size = 0;
	
	public TADV() {
		elements = new Object[10];
	}
	public Object enqueue() throws EFilaVazia{
		if(tamanho == 0) {
			throw new EFilaVazia("Tá vazia!");
		}
		else {
			Object lul = start.getValor();
			start = start.getProximo();
			tamanho--;
			return lul;	
		}				
	}public Object enqueue() throws EFilaVazia{
		if(tamanho == 0) {
			throw new EFilaVazia("Tá vazia!");
		}
		else {
			Object lul = start.getValor();
			start = start.getProximo();
			tamanho--;
			return lul;	
		}				
	}public Object enqueue() throws EFilaVazia{
		if(tamanho == 0) {
			throw new EFilaVazia("Tá vazia!");
		}
		else {
			Object lul = start.getValor();
			start = start.getProximo();
			tamanho--;
			return lul;	
		}				
	}
	public void insert(Object value, int place) {
		if(this.size == elements.length) {
			Object [] temp_elements = new Object[elements.length * 2];
			for(int i = 0; i <= elements.length; i++) {
				temp_elements[i] = elements[i];
				this.elements = temp_elements;
			}			
		}	   
       if(elements[place] != null) { 
    	   for (int i = (this.elements.length-1); i < place; i--){
    		   this.elements[i] = this.elements[i-1];
    		   i--;
        	}
        }        
        this.elements[place] = value;
        size++;
	}//Fim do insert
	
	public Object set(Object value, int place) {
		if(elements[place] != null) {
			Object v_temp = elements[place];
			elements[place] = value;
			return v_temp;
		}
		else {
			elements[place] = value;
			size++;
			return true;
			}	
	}//Fim do Set
	
	public Object remove(int place) {
		Object v_temp = elements[place];
		elements[place] = null;
		size--;
		for(int i = place; i < (this.elements.length - 1); i++)
	       {
	            this.elements[i] = this.elements[i+1];
	            this.elements[i+1] = null;
	       }
		return v_temp;
	}
	
	public Object get(int place) {
		return elements[place];
	}
		
	public String toString() {
		return Arrays.toString(elements);
	}
	
}//eoc
