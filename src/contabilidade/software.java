package contabilidade;
import java.util.*;

public class software {
	Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<moto> motolista = new ArrayList();
		ArrayList<passeio> passeiolista = new ArrayList();
		ArrayList<suv> suvlista = new ArrayList();
	
		//gera os arrays
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
			while(true) {
				espaco();
				System.out.println("1: Adicionar veiculo");
				System.out.println("2: Remover veiculo");
				System.out.println("3: valor anual dos impostos");
				System.out.println("4: Lista de veiculos com seus valores");
				int escolha = input.nextInt();
				espaco();
				if(escolha ==1) {
					//adicionar veiculo
					System.out.println("Selecione o veiculo");
					System.out.println("1: Moto");
					System.out.println("2: Passeio");
					System.out.println("3: SUV");
					int x = input.nextInt();
					if(x == 1) {
						moto moto = new moto();
						//adiciona uma moto
						
						System.out.println("Digite a placa");
						moto.placa=input.next();
						System.out.println("Digite o ano");
						moto.ano=input.nextInt();
						System.out.println("Digite a marca");
						moto.marca=input.next();
						System.out.println("Digite o modelo");
						moto.modelo=input.next();
						System.out.println("Digite o valor");
						moto.valor=input.nextDouble();
						System.out.println("Digite a Quilometragem");
						moto.km=input.nextDouble();
						
						//adiciona na lista:
						motolista.add(moto);
						
					} else if(x==2) {
						//adiciona um passeio
						passeio passeio = new passeio();

						System.out.println("Digite a placa");
						passeio.placa=input.next();
						System.out.println("Digite o ano");
						passeio.ano=input.nextInt();
						System.out.println("Digite a marca");
						passeio.marca=input.next();
						System.out.println("Digite o modelo");
						passeio.modelo=input.next();
						System.out.println("Digite o valor");
						passeio.valor=input.nextDouble();
						System.out.println("Digite a Quilometragem");
						passeio.km=input.nextDouble();
						System.out.println("Digite a quantidade de assentos");
						passeio.assentos=input.nextInt();
						passeio.seguro = passeio.valor*0.01;
						
						//adiciona na lista:
						passeiolista.add(passeio);
					} else if(x==3) {
						//adiciona um suv
						suv suv = new suv();
					
						System.out.println("Digite a placa");
						suv.placa=input.next();
						System.out.println("Digite o ano");
						suv.ano=input.nextInt();
						System.out.println("Digite a marca");
						suv.marca=input.next();
						System.out.println("Digite o modelo");
						suv.modelo=input.next();
						System.out.println("Digite o valor");
						suv.valor=input.nextDouble();
						System.out.println("Digite a Quilometragem");
						suv.km=input.nextDouble();
						System.out.println("Digite a quantidade de assentos");
						suv.assentos=input.nextInt();
						suv.seguro = suv.valor*0.01;
						
						//adiciona na lista:
						suvlista.add(suv);
					}
					
				} else if(escolha ==2) {
					//remover veiculo
					System.out.println("Que tipo de veiculo voce deseja remover?");
					System.out.println("1: Moto");
					System.out.println("2: Passeio");
					System.out.println("3: SUV");
					int x  = input.nextInt();
					espaco();
					if (x == 1){
						//remover uma moto
					if(motolista.size() !=0) {
						 for(int i = 0; i < motolista.size(); i++) {
						        moto cc = motolista.get(i); //printar todo o array
						        System.out.println("Moto numero = "+i+", placa = "+cc.placa);
						    }
						System.out.println("Qual moto voce deseja remover?");
						int m =input.nextInt();
						if (m<motolista.size()&&m>=0) {
							motolista.remove(m);
						}
					}
					} else if(x ==2) {
						//remover um passeio
						if(passeiolista.size() !=0) {
							 for(int i = 0; i < passeiolista.size(); i++) {
							        passeio cc = passeiolista.get(i); //printar todo o array
							        System.out.println("Passeio numero = "+i+", placa = "+cc.placa);
							    }
							System.out.println("Qual Passeio voce deseja remover?");
							int m =input.nextInt();
							if (m<passeiolista.size()&&m>=0) {
								passeiolista.remove(m);
							}
						}
					} else if (x==3) {
						//remover um suv
						if(suvlista.size() !=0) {
							 for(int i = 0; i < suvlista.size(); i++) {
							        suv cc = suvlista.get(i); //printar todo o array
							        System.out.println("SUV numero = "+i+", placa = "+cc.placa);
							    }
							System.out.println("Qual SUV voce deseja remover?");
							int m =input.nextInt();
							if (m<suvlista.size()&&m>=0) {
								suvlista.remove(m);
							}
						}
					}
					
				} else if(escolha ==3) {
					//valor de impostos
					System.out.println("Valor dos impostos!");
					//Pega o imposto total do array de motos
					double imposto =0;
					double impmoto =0;
					double imppasseio = 0;
					double impsuv = 0;
					
					 for(int i = 0; i < motolista.size(); i++) {
					        moto cc = motolista.get(i); //printar todo o array 
					        imposto += cc.valor*0.025;
					        impmoto += cc.valor*0.025;
					    }
					 //pega o imposto dos passeios
					 for(int i = 0; i < passeiolista.size(); i++) {
					        passeio cc = passeiolista.get(i); //printar todo o array 
					        imposto += cc.valor*0.05;
					        imppasseio += cc.valor*0.05;
					    }
					 //pega o imposto das SUV
					 for(int i = 0; i < suvlista.size(); i++) {
					        suv cc = suvlista.get(i); //printar todo o array 
					        imposto += cc.valor*0.08;
					        impsuv += cc.valor*0.08;
					    }
					 System.out.println("Valor total de imposto = "+imposto);
					 System.out.println("Valor de imposto das motos = "+ impmoto);
					 System.out.println("Valor de imposto dos passeios = "+ imppasseio);
					 System.out.println("Valor de imposto dos SUV = "+ impsuv);
					 
					 
				} else if(escolha ==4) {
					//lista
					System.out.println("que tipo de veiculo voce quer visualizar uma lista?");
					System.out.println("1: Moto");
					System.out.println("2: Passeio");
					System.out.println("3: SUV");
					int x = input.nextInt();
					espaco();
					if (x==1) {
						//criar array de precos
						int[] za = new int[motolista.size()];
						for(int i = 0; i < motolista.size(); i++) {
					        moto cc = motolista.get(i); //printar todo o array 
					        za[i] = (int) cc.valor;
					    }
						int aux=0;
						 for(int i = 0; i<za.length; i++){
						        for(int j = 0; j<za.length-1; j++){
						            if(za[j] > za[j + 1]){
						                aux = za[j];
						                za[j] = za[j+1];
						                za[j+1] = aux;
						            }
						        }
						    }
						 int k =za.length;
						 for(int i = 0; i<za.length; i++){
							 System.out.println("Preco do veiculo = "+za[k-1]);
							 k--;
						 }
						 
					} else if(x ==2) {
						
						//criar array de precos
						int[] za = new int[passeiolista.size()];
						for(int i = 0; i < passeiolista.size(); i++) {
					        passeio cc = passeiolista.get(i); //printar todo o array 
					        za[i] = (int) cc.valor;
					    }
						int aux=0;
						 for(int i = 0; i<za.length; i++){
						        for(int j = 0; j<za.length-1; j++){
						            if(za[j] > za[j + 1]){
						                aux = za[j];
						                za[j] = za[j+1];
						                za[j+1] = aux;
						            }
						        }
						    }
						 int k =za.length;
						 for(int i = 0; i<za.length; i++){
							 System.out.println("Preco do veiculo = "+za[k-1]);
							 k--;
						 }
					    
					} else if (x == 3) {
						
						//criar array de precos
						int[] za = new int[suvlista.size()];
						for(int i = 0; i < suvlista.size(); i++) {
					        suv cc = suvlista.get(i); //printar todo o array 
					        za[i] = (int) cc.valor;
					    }
						int aux=0;
						 for(int i = 0; i<za.length; i++){
						        for(int j = 0; j<za.length-1; j++){
						            if(za[j] > za[j + 1]){
						                aux = za[j];
						                za[j] = za[j+1];
						                za[j+1] = aux;
						            }
						        }
						    }
						 int k =za.length;
						 for(int i = 0; i<za.length; i++){
							 System.out.println("Preco do veiculo = "+za[k-1]);
							 k--;
						 }
			
					    }
					}
				}
			}
	
	//funcao para espacamento no console
	public static void espaco() {
		for(int x =0;x<10;x++) {
			System.out.println("");
		}
	}
	}

	

