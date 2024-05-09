/*
 * Thales Henrique Bastos Neves
 * 
 */
public class ArvoreSBB {
	// Inicializações abaixo do livro
	private static class No {
        Item reg;
        No esq, dir;
        byte incE, incD;
    }
	int contador = 0;
	private static final byte Horizontal = 0; 
	private static final byte Vertical = 1; 
	private No raiz;
	private boolean propSBB;
	
	
	// Inicialização do construtor da arvore
	public ArvoreSBB(){
        this.raiz = null;
        this.propSBB = true;
    } 
	
	
	//Pesquisa nos nós
	private Item pesquisa (Item reg, No p){
		//contador++; //Começa a contar antes das comparacoes
		if (p == null){ //Se nao encontrou 
		    System.out.print( "Comparacoes --> "+ contador + "| Tempo -->");
		    return null;
		}
		if (reg.compara(p.reg) < 0) {
			contador++;
		    return pesquisa (reg, p.esq);//Se for Menor, busca na esquerda
		}
		if (reg.compara(p.reg) > 0) {
			contador++;
		    return pesquisa (reg, p.dir);//Se for Maior, busca na direita
		}
		return p.reg; //Achamos 
	}
	
	
	//Metodos Pesquisa e insere
	public Item pesquisa (Item reg) {
	    return this.pesquisa (reg, this.raiz);
	}

	public void insere (Item reg) {
	    this.raiz = insere (reg, null, this.raiz, true);
	}
	  
	
	private No ee (No ap) {			// esquerda-esquerda
		  No ap1 = ap.esq; ap.esq = ap1.dir; ap1.dir = ap;
		  ap1.incE = Vertical; ap.incE = Vertical; ap = ap1;
		  return ap; 
		}
		  
		private No ed (No ap) {		// esquerda-direita
		  No ap1 = ap.esq; No ap2 = ap1.dir; ap1.incD = Vertical;
		  ap.incE = Vertical; ap1.dir = ap2.esq; ap2.esq = ap1;
		  ap.esq = ap2.dir; ap2.dir = ap; ap = ap2;    
		  return ap; 
		}

		private No dd (No ap) {	   // direita-direita
		  No ap1 = ap.dir; ap.dir = ap1.esq; ap1.esq = ap;
		  ap1.incD = Vertical; ap.incD = Vertical; ap = ap1;
		  return ap; 
		}

		private No de (No ap) { 		// direita-esquerda
		  No ap1 = ap.dir; No ap2 = ap1.esq; ap1.incE = Vertical;
		  ap.incD = Vertical; ap1.esq = ap2.dir; ap2.dir = ap1;
		  ap.dir = ap2.esq; ap2.esq = ap; ap = ap2;    
		  return ap; 
		}
		   
		  
		// Metodo Insere da Arvore SBB
		  private No insere (Item reg, No pai, No filho, boolean filhoEsq) {
			    if (filho == null) {
			      filho = new No (); filho.reg = reg; 
			      filho.incE = Vertical; filho.incD = Vertical;
			      filho.esq = null; filho.dir = null;
			      if (pai != null)
			        if (filhoEsq) pai.incE = Horizontal; else pai.incD = Horizontal;
			      this.propSBB = false;
			    }
			    else if (reg.compara (filho.reg) < 0) {
			      filho.esq = insere (reg, filho, filho.esq, true);
			      if (!this.propSBB) 
			        if (filho.incE == Horizontal) { 
			          if (filho.esq.incE == Horizontal) {
			            filho = this.ee (filho); // transformacao esquerda-esquerda
			            if (pai != null)
			              if (filhoEsq) pai.incE=Horizontal; else pai.incD=Horizontal;
			          }
			          else if (filho.esq.incD == Horizontal) {
			            filho = this.ed (filho); //transformacao esqueda-direita
			            if (pai != null) 
			              if (filhoEsq) pai.incE=Horizontal; else pai.incD=Horizontal;            
			          }
			        }
			        else this.propSBB = true;
			    }
			    else if (reg.compara (filho.reg) > 0) {
			      filho.dir = insere (reg, filho, filho.dir, false);
			      if (!this.propSBB) 
			        if (filho.incD == Horizontal) {
			          if (filho.dir.incD == Horizontal) {
			            filho = this.dd (filho); // transformacao direita-direita
			            if (pai != null)
			              if (filhoEsq) pai.incE=Horizontal; else pai.incD=Horizontal;
			          }
			          else if (filho.dir.incE == Horizontal) {
			            filho = this.de (filho); // transformacao direita-esquerda
			            if (pai != null)
			              if (filhoEsq) pai.incE=Horizontal; else pai.incD=Horizontal;            
			          }
			        }
			        else this.propSBB = true;
			    }
			    else {      
			      //System.out.println ("Erro: Registro ja existente"); 
			      this.propSBB = true;
			    }
			    return filho; 
			  }
		  

}
