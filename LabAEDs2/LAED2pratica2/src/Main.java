/*
 * Thales Henrique Bastos Neves
 * 
 */
import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		ArvoreSBB arvoreSBB = new ArvoreSBB(); // Cria a arvore SBB
		
		Random NumeroAleatorio = new Random(); // Numero aleatorio
		
		int n,x,numero;
		
		// n = 10000; n = 20000; n = 30000; n = 40000; n = 50000;  n = 60000; n = 70000; n = 80000; n = 90000; n = 100000;
        n = 50000;
        x = 999999999; // Numero para comparar se o numero comparado esta na arvore
        
        int Vetor [] = new int [n]; // Instancia o Array = Vetor de n posicoes
		
		for(int i = 0; i< n;i++) {   // inserindo as posições no vetor com numeros positivos 
			
			// Geramos um numero aleatorio e verificamos se eh positivo
			numero = positivo (NumeroAleatorio.nextInt()); 
            if ( numero != x) { // verifica se o elemento não existe na árvore.
                Vetor[i] = numero;}
		}
		
		// Para fazer n elementos aleatorios comentamos o codigo abaixo
		
		Arrays.sort(Vetor); // Ordenamos o vetor W
		
		// Insercao na arvore
		for (int i = 0; i< n;i++) {
			Item novoItem = new Item (Vetor[i]); // Pega o item dentro do vetor e insere na árvore
			arvoreSBB.insere(novoItem);
		}
	
		//Agora vamos pesquisar		
		Item novoItem = new Item(x); // criamos um item que vai ate o final do vetor,x = 999999999
		
        long tempoAntes = System.nanoTime(); // Começamos contando o cronometro antes da pesquisa
        
        arvoreSBB.pesquisa(novoItem);
        
        long tempoDepois= System.nanoTime();  // Terminamos de contar depois da pesquisa
        
        long tempoTotal = tempoDepois-tempoAntes; // Tempo total gasto para a pesquisa
        
        System.out.println(" Tempo total :"+tempoTotal);  // Printa o tempo total
	
		
	}
	// Metodo para selecionar apenas numeros positivos
	public static int positivo(int y){
		if(y < 0) {
		   return (y*(-1));
		} // Transforma o numero pra positivo
		else {
		   return y;
		}		// Se nao for negativo manda direto
	}
}
