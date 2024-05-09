
public class XCiclo {
	
		  public static final byte branco = 0;
		  public static final byte cinza  = 1;
		  public static final byte preto  = 2;
		  private int d[], t[], antecessor[];
		  private XGrafo grafo;
		  private boolean xciclo1;
		  
		  public XCiclo (XGrafo grafo) {
		    this.grafo = grafo; int n = this.grafo.numVertices();
		    d = new int[n]; t = new int[n]; antecessor = new int[n]; xciclo1 = false;
		  }
		  private int visitaDfs (int u, int tempo, int cor[]) {
		    cor[u] = cinza; 
		    this.d[u] = ++tempo; // Fica cinza quando eh visitado e nao verificou todas as incidencias, aumentando o tempo de descoberta
		    
//		    System.out.println ("Visita "+u+" Descoberta:"+this.d[u]+" cinza");
		    if (!this.grafo.listaAdjVazia (u)) {
		      XGrafo.Aresta a = this.grafo.primeiroListaAdj (u);
		      while (a != null) {
		        int v = a.v2 ();		// v = aresta adjacente
		        if (cor[v] == branco) {  // se a cor for branca continua a busca
		          this.antecessor[v] = u;
		          tempo = this.visitaDfs (v, tempo, cor);
		        }else if(cor[v] == cinza){
		            // Aresta de Retorno
		            xciclo1 = true;
		          }
		        a = this.grafo.proxAdj (u);
		      }
		    }
		    cor[u] = preto; this.t[u] = ++tempo;
//		    System.out.println ("Visita " +u+ " Termino:" +this.t[u]+ " preto");
		    return tempo;
		  }
		  // metodo de busca em profundidade
		  public boolean buscaEmProfundidade () {
		    int tempo = 0; int cor[] = new int[this.grafo.numVertices ()]; 
		    
		    for (int u = 0; u < grafo.numVertices (); u++) {	// faz com que todos os vertices sejam branco e seus antecessores = null
		      cor[u] = branco; this.antecessor[u] = -1;
		    }     
		    for (int u = 0; u < grafo.numVertices (); u++)		// procura os vertices adjacentes
		      if (cor[u] == branco) tempo = this.visitaDfs (u, tempo, cor);
		  return xciclo1;
		  }
		  public int d (int v) { return this.d[v]; }	// metodo q retorna o tempo de descoberta
		  public int t (int v) { return this.t[v]; }	// metodo q retorna o tempo de termino
		  public int antecessor (int v) { return this.antecessor[v]; }	// metodo q retorna o vertice antecessor
		
}
