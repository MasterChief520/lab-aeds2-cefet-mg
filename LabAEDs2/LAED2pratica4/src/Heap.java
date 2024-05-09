/*
 * Thales Henrique Bastos Neves
 * 
 */
public class Heap {
	  private Item v[];
	  private int  n;
	  private int contadorComparacoes = 0;
	  
	  public int getContadorComparacoes() {
		  return this.contadorComparacoes;
	  }
	  public Heap (int maxTam) { //  Cria uma fila de prioridades vazia}
	    this.v = new Item[maxTam + 1]; 
	    this.n = 0; //this.contadorComparacoes++;
	  }
	  public Heap (Item v[]) { //  Cria uma fila de prioridades vazia}
	    this.v = v; 
	    this.n = this.v.length - 1;
	  }
	  
	  public void refaz (int esq, int dir) {	// Refaz a heap reordenando, de forma que o pai seja maior que os filhos 
	    int j = esq * 2; 
	    Item x = this.v[esq];
	    while (j <= dir) {
	    	this.contadorComparacoes++;
	      if ((j < dir) && (this.v[j].compara (this.v[j + 1]) < 0)) {
	    	  j++;}
	      if (x.compara (this.v[j]) >= 0) { 
	    	  break;}
	      this.v[esq] = this.v[j];
	      esq = j; 
	      j = esq * 2;
	      //this.contadorComparacoes++;			// Soma no contador de comparações quando usa o metodo compara no metodo refaz
	    }
	    this.v[esq] = x;
	  }
	  
	  public void constroi () {		//Constroi a Heap definindo a esquerda chamando o metodo refaz
	    int esq = n / 2 + 1;
	    while (esq > 1) {
	      esq--; 
	      this.refaz (esq, this.n);
	      //this.contadorComparacoes++;		// Soma no contador de comparações quando usa o metodo compara no metodo constroi
	    }
	  }
	//Item Max
	  public Item max () { return this.v[1];  }
	  public Item retiraMax () throws Exception {		//Retira o item Max
	    Item maximo;
	    if (this.n < 1) throw new Exception ("Erro: heap vazio");	// Erro se o heap estiver vazio
	    else {
	      maximo = this.v[1]; this.v[1] = this.v[this.n--];
	      refaz (1, this.n);
	    }
	    return maximo;
	  }
	}