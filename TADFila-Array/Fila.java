public class Fila {

	Object elementos[];
	int endOfDLine = -1;
	
	public Fila() {
		elementos = new Object[4];
	}
	
	public void queue(Object in) {
		this.elementos[endOfDLine] = in;
		this.endOfDLine++;
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
	
	public Object dequeue() {
		this.endOfDLine--;
		return elementos[endOfDLine + 1];
		
	}
}
