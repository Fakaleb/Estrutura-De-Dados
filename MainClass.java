import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) throws EPilhaVazia {
		
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		int menu;
		
		Pilha p = new Pilha();
		int in;
		
				
		while(loop) {
			System.out.println("\n Push  -  [1] \n Pop   -  [2] \n Vazia? - [3] \n Cheia? - [4]"
					+ " \n Topo  -  [5] \n Sair - [0] ");
			menu = input.nextInt();
			switch(menu) {
			
			case 1://push
				System.out.println("\n Digite o n�mero a ir pra pilha \n");
				in = input.nextInt();
				p.push(in);
				break;	
			
			case 2://pop
				try{
					System.out.printf("O n�mero %d foi descartado da pilha", p.pop());
				}
				catch(EPilhaVazia e){
					System.out.println(e.getMessage());
				}	
				break;
								
			case 3://isEmpty
				if(p.isEmpty()) {
					System.out.println("A pilha ta vazia.");
				}
				else {
					System.out.println("Tem algo na pilha.");
				}
				break;
				
			case 4://isFull	
				if(p.isFull()) {
					System.out.println("A pilha t� cheia");
				}
				else {
					System.out.println("A pilha n�o ta cheia.");
				}
				break;
				
			case 5://top
				try {
					System.out.printf("O topo da pilha �: %d ", p.top());	
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 0:
				loop = false;
				
				break;
			}
				
		}//end of loop
		
	}
}