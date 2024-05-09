/*
 * Thales Henrique Bastos Neves

 * 
 */
import java.util.Random;

public class Main {
	public static void main(String[] args) {
	HeapSort newHeapSort;			// Cria o Heap
	Item []I;		
	
	int[] VetorV={10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};//Vetor com todos os tamanhos para os testes
	int[] VetorIntermediario;
	
	// Vetor Ordenado de forma crescente
	System.out.println("\n-------------------------Ordem Crescente-------------------------\n");
	for(int i = 0; i< 10;i++) {
		newHeapSort = new HeapSort(); I = new Item[VetorV[i]+1];
        I[0] = new Item(0);
        for(int j=1;j<=VetorV[i];j++){	//Insercao do vetor a ser ordenado
            I[j] = new Item(j);
        }
        System.out.println(" Numero total de elementos inseridos na Heap = "+VetorV[i]);
        newHeapSort.heapSort(I, VetorV[i]);	// chamada do metodo de heapSort
	}
				
	// Vetor Ordenado de forma decrescente
	System.out.println("\n-------------------------Ordem Decrescente-------------------------\n");
	for(int i = 0; i< 10;i++) {
		newHeapSort = new HeapSort(); I = new Item[VetorV[i]+1];
	    I[0] = new Item(0);
	    for(int j=0;j<=VetorV[i];j++){	//Insercao do vetor a ser ordenado
	       I[j] = new Item(VetorV[i]-j); // Insere o valor Total do vetorV e vai diminuindo transformando ele em decrescente
	    }
		System.out.println(" Numero total de elementos inseridos na Heap = "+VetorV[i]);
	    newHeapSort.heapSort(I,VetorV[i]);	// chamada do metodo de heapSort	
		}
	
	// Vetor Ordenado de forma aleatoria
	
	System.out.println("\n-------------------------Ordem Aleatoria-------------------------\n");
	for(int i = 0; i< 10;i++) {
		newHeapSort = new HeapSort(); 
		VetorIntermediario = new int[VetorV[i]];
		
		for(int k=0;k<VetorV[i];k++){		// Preenche o vetor intermediario de 1 a VetorV[i], das posicoes 0 a VetorV[i-1]
            VetorIntermediario[k]=k+1;
        }
		shuffle(VetorIntermediario);
		I = new Item[VetorV[i]+1];
	    I[0] = new Item(0);
	    
	    for(int j=1;j<=VetorV[i];j++){	//Insercao do vetor a ser ordenado
	        I[j] = new Item(VetorIntermediario[j-1]);
	    }
	    System.out.println(" Numero total de elementos inseridos na Heap = "+VetorV[i]);	
	    newHeapSort.heapSort(I,VetorIntermediario[i]);				// chamada do metodo de heapSort
		}
	}
	
	//método estático que embaralha os elementos de um vetor de inteiros
		public static void shuffle(int [] v) {
			Random random = new Random();
			for (int i=0; i < (v.length - 1); i++) {

				//sorteia um índice
				int j = random.nextInt(v.length-i+1);

				//troca o conteúdo dos índices i e j do vetor
				int temp = v[i];
				v[i] = v[j];
				v[j] = temp;
			}
		}
}
