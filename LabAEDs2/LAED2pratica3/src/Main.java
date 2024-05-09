/*
 * Thales Henrique Bastos Neves
 * 
 */

public class Main {
	public static void main(String[] args) {
		ArvoreSBB NewArvoreSBB; 	// Cria a arvore SBB
		ArvoreB NewArvoreB; 	// Cria a arvore B 
		
		int[] VetorV={10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};//Vetor com todos os tamanhos para os testes
		Item novoItem; // Numero para comparar se o numero comparado esta na arvore

       
        // Para a arvore SBB |||| Fazemos um for para todos os tamanhos
		for(int i = 0; i< 10;i++) { 
			NewArvoreSBB = new ArvoreSBB();
			// Insercao na arvore SBB
			for (int j = 1; j<=VetorV[i];j++) { 
				novoItem = new Item (j); // Pega o item dentro do vetor e insere na árvore
				NewArvoreSBB.insere(novoItem);
			}
			System.out.println("Numero total de elementos inseridos na arvore SBB = "+VetorV[i]);
			//Agora vamos pesquisar		
			novoItem = new Item(4534534); // criamos um item que vai ate o final do vetor
	        NewArvoreSBB.pesquisa(novoItem);
	        System.out.println();
		}
		
			System.out.println("--------------------------------Arvore B ordem 2-----------------------------------\n");
			
			 // Para a arvore B ordem 2 |||| Fazemos um for para todos os tamanhos
        for(int i = 0; i< 10;i++) { 
			NewArvoreB = new ArvoreB(2);
			
			for (int j = 0; j<VetorV[i];j++) { 
				novoItem = new Item (j); 
				NewArvoreB.insere(novoItem);
			}
		
			System.out.println("Numero total de elementos inseridos na arvore B de ordem 2= "+VetorV[i]);
			//Agora vamos pesquisar		
			novoItem = new Item(4534535); // criamos um item que vai ate o final do vetor
	        NewArvoreB.pesquisa(novoItem);
	        System.out.println("Comparacoes = "+NewArvoreB.getNumeroComparacoes()+"\n");
		}
        System.out.println("--------------------------------Arvore B ordem 4-----------------------------------\n");
		
		 // Para a arvore B ordem 4 |||| Fazemos um for para todos os tamanhos
        for(int i = 0; i< 10;i++) { 
			NewArvoreB = new ArvoreB(4);
			
			for (int j = 0; j<VetorV[i];j++) { 
				novoItem = new Item (j); 
				NewArvoreB.insere(novoItem);
			}
		
			System.out.println("Numero total de elementos inseridos na arvore B de ordem 4= "+VetorV[i]);
			//Agora vamos pesquisar		
			novoItem = new Item(4534535); // criamos um item que vai ate o final do vetor
	        NewArvoreB.pesquisa(novoItem);
	        System.out.println("Comparacoes = "+NewArvoreB.getNumeroComparacoes()+"\n");
		}
        	System.out.println("--------------------------------Arvore B ordem 6-----------------------------------\n");
		
        	// Para a arvore B ordem 6 |||| Fazemos um for para todos os tamanhos
        	for(int i = 0; i< 10;i++) { 
    			NewArvoreB = new ArvoreB(6);
    			
    			for (int j = 0; j<VetorV[i];j++) { 
    				novoItem = new Item (j); 
    				NewArvoreB.insere(novoItem);
    			}
    		
    			System.out.println("Numero total de elementos inseridos na arvore B de ordem 6= "+VetorV[i]);
    			//Agora vamos pesquisar		
    			novoItem = new Item(4534535); // criamos um item que vai ate o final do vetor
    	        NewArvoreB.pesquisa(novoItem);
    	        System.out.println("Comparacoes = "+NewArvoreB.getNumeroComparacoes()+"\n");
    		}
	}
}
