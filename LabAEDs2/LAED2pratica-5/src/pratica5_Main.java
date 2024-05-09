
public class pratica5_Main {
	private static XGrafo grafoA, grafoB;
	public static void main (String args[]){
		// criando o primeiro grafo
        grafoA = new XGrafo(8,12);
        criaGrafoA();

        // criando o segundo grafo
        grafoB = new XGrafo(10,14);
        criaGrafoB();

        // olha se tem ciclos no grafo
        XCiclo cicloA = new XCiclo(grafoA);
        
        if(cicloA.buscaEmProfundidade()) {
            System.out.println("Grafo A tem Ciclo");}
        else {
            System.out.println("Grafo A nao tem Ciclo");}
        
        System.out.println();

        // olha se tem ciclos no grafo
        XCiclo cicloB = new XCiclo(grafoB);
        
        if(cicloB.buscaEmProfundidade()) {
            System.out.println("Grafo B tem Ciclo");}
        else {
            System.out.println("Grafo B nao tem Ciclo");}
    }
    private static void criaGrafoA(){
        // vertice 0
        grafoA.insereAresta(0,1,1);		 grafoA.insereAresta(0,3,1);	   grafoA.insereAresta(0,4,1);
        
        // vertice 1
        grafoA.insereAresta(1,0,1);      grafoA.insereAresta(1,2,1);       grafoA.insereAresta(1,5,1);
        
        // vertice 2
        grafoA.insereAresta(2,1,1);      grafoA.insereAresta(2,3,1);       grafoA.insereAresta(2,6,1);
        
        // vertice 3
        grafoA.insereAresta(3,0,1);      grafoA.insereAresta(3,2,1);       grafoA.insereAresta(3,7,1);
        
        // vertice 4
        grafoA.insereAresta(4,0,1);      grafoA.insereAresta(4,5,1);       grafoA.insereAresta(4,7,1);
        
        // vertice 5
        grafoA.insereAresta(5,1,1);      grafoA.insereAresta(5,4,1);       grafoA.insereAresta(5,6,1);
        
        // vertice 6
        grafoA.insereAresta(6,2,1);      grafoA.insereAresta(6,5,1);       grafoA.insereAresta(6,7,1);
        
        // vertice 7
        grafoA.insereAresta(7,3,1);      grafoA.insereAresta(7,4,1);       grafoA.insereAresta(7,6,1);
    }

    private static void criaGrafoB(){
        // vertice 0
        grafoB.insereAresta(0,1,1);        grafoB.insereAresta(0,2,1);        grafoB.insereAresta(0,3,1);        grafoB.insereAresta(0,5,1);
        // vertice 1
        grafoB.insereAresta(1,2,1);
        // vertice2
        grafoB.insereAresta(2,3,1);        grafoB.insereAresta(2,4,1);
        // vertice 4
        grafoB.insereAresta(4,6,1);
        // vertice 5
        grafoB.insereAresta(5,4,1);        grafoB.insereAresta(5,6,1);
        // vertice 6
        grafoB.insereAresta(6,7,1);        grafoB.insereAresta(6,8,1);
        // vertice 7
        grafoB.insereAresta(7,8,1);
        // vertice 8 Nao tem conexao
        // vertice 9
        grafoB.insereAresta(9,6,1);
    }
}



