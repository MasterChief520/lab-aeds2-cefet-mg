
public class pratica6_Main {
	private static XGrafo grafoA, grafoB;
    public static void main(String args[]) throws Exception{
        // instancia grafos
        grafoA = new XGrafo(9);	//Grafo com 9 vértices
        grafoB = new XGrafo(8);	//Grafo com 8 vértices

        // cria o grafo A
        System.out.println("----------Grafo A----------\n");
        criaGrafoA();
        grafoA.imprime();
        // cria AGM
        XAGM AGM0 = new XAGM(grafoA);
        AGM0.obterAgm(A);
        AGM0.imprime();
        System.out.println();
        // cria o grafo B
        System.out.println("----------Grafo B----------\n");
        criaGrafoB();
        grafoB.imprime();
        // cria AGM
        XAGM AGM1 = new XAGM(grafoB);
        AGM1.obterAgm(1 - 1);
        AGM1.imprime();
        System.out.println();
    }
    public static final byte A  = 0;
    public static final byte B  = 1;
    public static final byte C  = 2;
    public static final byte D  = 3;
    public static final byte E  = 4;
    public static final byte F  = 5;
    public static final byte G  = 6;
    public static final byte H  = 7;
    public static final byte K  = 8;
    
    private static void criaGrafoA(){
        // vertice A
        grafoA.insereAresta(A,B,5);   grafoA.insereAresta(A,D,10);
        grafoA.insereAresta(A,B,10);  grafoA.insereAresta(A,G,10);
        grafoA.insereAresta(A,B,10);
        // vertice B
        grafoA.insereAresta(B,A,5);   grafoA.insereAresta(B,F,5);
        grafoA.insereAresta(B,H,5);   grafoA.insereAresta(B,K,10);
        // vertice C
        grafoA.insereAresta(C,D,5);   grafoA.insereAresta(C,E,10);
        grafoA.insereAresta(C,G,5);
        // vertice D
        grafoA.insereAresta(D,A,10);  grafoA.insereAresta(D,C,5);
        grafoA.insereAresta(D,E,5);   grafoA.insereAresta(D,G,10);
        // vertice E
        grafoA.insereAresta(E,A,5);   grafoA.insereAresta(E,C,10);
        grafoA.insereAresta(E,D,5);   grafoA.insereAresta(E,K,10);
        // vertice F
        grafoA.insereAresta(F,B,5);   grafoA.insereAresta(F,G,15);
        // vertice G
        grafoA.insereAresta(G,A,10);  grafoA.insereAresta(G,C,5);
        grafoA.insereAresta(G,D,10);  grafoA.insereAresta(G,F,15);
        // vertice H
        grafoA.insereAresta(H,A,10);  grafoA.insereAresta(H,B,5);  
        grafoA.insereAresta(H,K,20);
        // vertice K
        grafoA.insereAresta(K,B,10);  grafoA.insereAresta(K,E,10); 
        grafoA.insereAresta(K,H,20);
    
    }

    private static void criaGrafoB(){
        // vertice 1
        grafoB.insereAresta(1-1, 2-1, 8);       grafoB.insereAresta(1-1, 3-1, 2);       grafoB.insereAresta(1-1, 7-1, 9);
        // vertice 2
        grafoB.insereAresta(2-1, 1-1, 8);       grafoB.insereAresta(2-1, 3-1, 3);       grafoB.insereAresta(2-1, 4-1, 2);       
        grafoB.insereAresta(2-1, 5-1, 7);       grafoB.insereAresta(2-1, 6-1, 5);       grafoB.insereAresta(2-1, 8-1, 6);
        // vertice 3
        grafoB.insereAresta(3-1, 1-1, 2);       grafoB.insereAresta(3-1, 2-1, 3);       grafoB.insereAresta(3-1, 4-1, 9);
        grafoB.insereAresta(3-1, 7-1, 6);
        // vertice 4
        grafoB.insereAresta(4-1, 2-1, 2);       grafoB.insereAresta(4-1, 3-1, 9);
        grafoB.insereAresta(4-1, 5-1, 6);       grafoB.insereAresta(4-1, 7-1, 2);
        // vertice 5
        grafoB.insereAresta(5-1, 2-1, 7);       grafoB.insereAresta(5-1, 3-1, 6);
        grafoB.insereAresta(5-1, 5-1, 5);       grafoB.insereAresta(5-1, 7-1, 4);
        // vertice 6
        grafoB.insereAresta(6-1, 2-1, 5);       grafoB.insereAresta(6-1, 5-1, 5);
        grafoB.insereAresta(6-1, 7-1, 6);       grafoB.insereAresta(6-1, 8-1, 4);
        // vertice 7
        grafoB.insereAresta(7-1, 1-1, 9);       grafoB.insereAresta(7-1, 3-1, 6);       grafoB.insereAresta(7-1, 4-1, 2);
        grafoB.insereAresta(7-1, 5-1, 4);       grafoB.insereAresta(7-1, 6-1, 6);       grafoB.insereAresta(7-1, 8-1, 3);
        // vertice 8
        grafoB.insereAresta(8-1, 2-1, 6);       grafoB.insereAresta(8-1, 6-1, 4);       grafoB.insereAresta(8-1, 7-1, 3);
    }
   
}

