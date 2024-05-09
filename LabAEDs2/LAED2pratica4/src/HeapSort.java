/*
 * Thales Henrique Bastos Neves
 * 
 */
public class HeapSort { // Ordenação do vetor utilizando o heap em um vetor de n itens
	
	 public void heapSort (Item v[], int n) {	
		Heap fpHeap = new Heap (v);
		int dir = n;
		fpHeap.constroi (); // Constroi a Heap
		while (dir > 1) { 	// Ordena o Vetor de forma crescente
		  Item x = v[1]; 
		  v[1] = v[dir];
		  v[dir] = x;
		  dir--; 
		  fpHeap.refaz (1, dir);
		}
		System.out.println(" Comparacoes: "+fpHeap.getContadorComparacoes()+"\n");
	}
}


