/*
 * Thales Henrique Bastos Neves
 * 
 */
public class Item {
	private int chave;
	public Item (int chave) {
		this.chave = chave;
	}
	//Comparacao do item com a chave
	public static int contador;
	public int compara(Item it) {
		contador++;
		Item item = (Item) it;
		if (this.chave < item.chave) {
			return -1;
		}else if (this.chave > item.chave) {
			return 1;
		}
		return 0;
	}
	public int getChave() {
		return chave;
	}
	
}
