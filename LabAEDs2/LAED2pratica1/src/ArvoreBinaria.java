/*
 * Thales Henrique Bastos Neves
 * 
 */
public class ArvoreBinaria {
	private static class No {
		Item reg;
		No esq, dir ;
		}
		//int contador = 0;
		private No raiz ;
		
		// Métodos Pesquisa e Insere
		public Item pesquisa (Item reg) {
			//contador ++; // adiciona 1 no contador para a primeira comparacao
			    return this.pesquisa (reg, this.raiz);
	    }
		public void insere (Item reg){
		        this.raiz = this.insere(reg, this.raiz);
		    }
		    
		// Metodo No insere para inserir uma folha ou outros nós
		private No insere(Item reg, No p){
	        if (p == null){ 				//Insere numa folha
	            p = new No(); p.reg = reg;  //Instância um nó novo
	            p.esq = null; p.dir = null; //Filhos = null
	        }
	        //eh pesquisado na sub-árvore até null
	        else if (reg.compara(p.reg) < 0)
	            p.esq = insere(reg, p.esq);
	        else if (reg.compara(p.reg) > 0)
	            p.dir = insere(reg, p.dir);
	        //else System.out.println("Erro: Registro já existe"); // Ja existe 

	        return p;
	    }
		//Pesquisa nos nós
		private Item pesquisa (Item reg, No p){
	        //contador++; //conta antes de fazer cada comparação
	        if (p == null){ //Não encotrado - folha
	           // System.out.print(contador + "<-- Comparacoes ");
	            return null;
	        }
	        //contador++;
	        if (reg.compara(p.reg) < 0) 
	        	return pesquisa (reg, p.esq);//Se for Menor, busca na esquerda
	        //contador++;
	        if (reg.compara(p.reg) > 0) 
	        	return pesquisa (reg, p.dir);//Se for Maior, busca na direita
	        
	        return p.reg; //Achamos 
	    }
		
		// Construtor da Arvore Binaria : Inicia
		public ArvoreBinaria () {
		    this.raiz = null;
		}
}

