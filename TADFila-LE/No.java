package Classes;

public class No {
	private Object valor;
	private No proximo;
	
	public No(Object valor, No proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
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
	}
}//eoc
