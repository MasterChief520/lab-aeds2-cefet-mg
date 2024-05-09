/*
 * Thales Henrique Bastos Neves
 * 
 */
import java.util.Random;
import java.util.Arrays;
public class Main {
	
	public static void main(String[] args) {
		ArvoreBinaria arvoreBin = new ArvoreBinaria(); // Cria a arvore binaria
		
		Random NumeroAleatorio = new Random(); // Numero aleatorio
		
		
		int n,x,numero;
		
		// n = 1000; n = 2000; n = 3000; n = 4000; n = 5000;  n = 6000; n = 7000; n = 8000; n = 9000;
        n = 9000;
        x = 99999999; // Numero para comparar se o numero comparado esta na arvore
        
        int Vetor [] = new int [n]; // Instancia o Array = Vetor de n posicoes
		
		for(int i = 0; i< n;i++) {   // inserindo as posições no vetor com numeros positivos 
			
			// Geramos um numero aleatorio e verificamos se eh positivo
			numero = positivo (NumeroAleatorio.nextInt()); 
            if ( numero != x) { // verifica se o elemento não existe na árvore.
                Vetor[i] = numero;}
            	i++;
		}
		
		// Para fazer n elementos aleatorios comentamos o codigo abaixo
		Arrays.sort(Vetor); // Ordenamos o vetor 
		
		
		// Insercao na arvore
		for (int i = 0; i< n;i++) {
			Item novoItem = new Item (Vetor[i]); // Pega o item dentro do vetor e insere na árvore
			arvoreBin.insere(novoItem);
		}
	
		//Agora vamos pesquisar		
		Item novoItem = new Item(x); // criamos um item que vai ate o final do vetor,x = 99999999
		
		
        double tempoAntes = System.nanoTime(); // Começamos contando o cronometro antes da pesquisa
        Item.contador = 0;
        arvoreBin.pesquisa(novoItem);
        System.out.print(Item.contador + "<-- Comparacoes ");
        double tempoDepois= System.nanoTime();  // Terminamos de contar depois da pesquisa
        
        double tempoTotal = tempoDepois-tempoAntes; // Tempo total gasto para a pesquisa
        
        System.out.println(tempoTotal);  // Printa o tempo total
	
		
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
