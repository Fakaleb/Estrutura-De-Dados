package Classes;

import java.util.Scanner;

public class MainClass {	
	public static void main(String args[]) throws EPilhaVazia {
		int menu;
		boolean loop = true;
		Object in;
		Scanner input = new Scanner(System.in);
		Pilha p = new Pilha();
		
		while(loop) {
			System.out.println("Sair ----- [0] \nPush  ------  [1] \nPop   ------  [2] \nTop --------- [3] \nSize -------- [4]");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("Digite o que vai pra pilha: ");
				in = input.next();
				p.queue(in);
				break;
				
			case 2:
				try{
					System.out.print("Objeto removido: " + p.enqueue() + "\n");
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				try{
					System.out.print("O topo da pilha �: " + p.topo() + "\n");
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 4:
				System.out.print("O tamanho da pilha � de: " + p.tamanho() + "\n");
				break;
				
			case 0:
				loop = false;
				break;
				
			}//end switch
			
			
			
		}//end while
		
		
		
		
	}//END OF DAQUELE ROL� L�

}//EOC
