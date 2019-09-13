package Classes;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		int menu, place;
		
		TADV vector = new TADV();
		Object value;
		
		
		while(loop) {
			System.out.println("1 - Replace \n2 - Insert\n3 - Get \n4 - Remove \n8 - Verificar Array");
			menu = input.nextInt();
			switch(menu) {
			
			case 1: //Set
				System.out.println("O que voc� quer inserir?");
				value = input.next();
				System.out.println("Em qual posi��o? \n");
				place = input.nextInt();
				vector.set(value, place-1);
				break;
			
			case 2://Insert
				System.out.println("O que voc� quer inserir?");
				value = input.next();
				System.out.println("Em qual posi��o? \n");
				place = input.nextInt();
				vector.insert(value, place-1);
				break;
							
			case 3://get
				System.out.println("Qual posi��o vc quer conferir? ");
				place = input.nextInt();
				System.out.println("Objeto na posi��o " + place+": " + vector.get(place));
				break;
				
			case 4: //Remove
				System.out.println("Quer apagar qual posi��o? \n");
				place = input.nextInt();
				System.out.println("Objeto removido: "+ vector.remove(place-1));
				break;
				
			case 8://Verificar Vetor
				System.out.println(vector);
				break;
			}//fim do switch/case
			
		}//fim do la�o
		
	}//fim daquele tro�o
}//fim da main
