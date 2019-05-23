package contabilidade;
import java.util.Scanner;

public class software {
	Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
			while(true) {
				System.out.println("1: Adicionar veiculo");
				System.out.println("2: Remover veiculo");
				System.out.println("3: valor anual dos impostos");
				System.out.println("4: Lista de veiculos com seus valores");
				int escolha = input.nextInt();
				
				if(escolha ==1) {
					System.out.println("Selecione o veiculo");
					System.out.println("1: Moto");
					System.out.println("2: Passeio");
					System.out.println("3: SUV");
					int x = input.nextInt();
					if(x == 1) {
						
					} else if(x==2) {
						
					} else if(x==3) {
						
					}
					
				} else if(escolha ==2) {
					
				} else if(escolha ==3) {
					
				} else if(escolha ==4) {
					
				}
			}
	}

}
