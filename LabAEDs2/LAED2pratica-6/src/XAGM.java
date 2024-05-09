public class XAGM {
							//Arvore Geradora Minima
  private int antecessor[];
  private double p[];
  private XGrafo grafo;

  public XAGM (XGrafo grafo) { this.grafo = grafo; }  

  public void obterAgm (int raiz) throws Exception {
      
    int n = this.grafo.numVertices();
    this.p = new double[n]; 	// peso dos vertices
    int vs[] = new int[n+1]; 	// vertices
    boolean itensHeap[] = new boolean[n];
    this.antecessor = new int[n];
    
    // inicializacao antecessores, pesos e vertices
    for (int u = 0; u < n; u ++) {
      this.antecessor[u] = -1;
      p[u] = Double.MAX_VALUE; 	// infinito
      vs[u+1] = u; 				// Heap indireto a ser construido
      itensHeap[u] = true;
    }

    p[raiz] = 0;
    // Constroi o objeto heapIndireto
    HeapIndireto heap = new HeapIndireto (p, vs); 
    heap.constroi ();
    // While para enquanto houver elementos dentro da heap
    while (!heap.vazio ()) {
      int u = heap.retiraMin (); 
      itensHeap[u] = false;
      
      if (!this.grafo.listaAdjVazia (u)) { // se tiver adjacencias
        XGrafo.Aresta adj = grafo.primeiroListaAdj (u);
        while (adj != null) {
          int v = adj.v2 ();
          if (itensHeap[v] && (adj.peso () < this.peso (v))) {
            antecessor[v] = u; 		// antecessor novo com peso de aresta menor
            heap.diminuiChave (v, adj.peso ());		// o heap deve ser refeito
          }
          adj = grafo.proxAdj (u);
        }
      }
    }
  }
  public int antecessor (int u) { return this.antecessor[u]; }
  public double peso (int u) { return this.p[u]; }
  public void imprime () {
    for (int u = 0; u < this.p.length; u++)
      if (this.antecessor[u] != -1) 
        System.out.println ("Antecessor: (" +antecessor[u]+ "," +u+ ") -- peso: " + peso (u));
  }
}