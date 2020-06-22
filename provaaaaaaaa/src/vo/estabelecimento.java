package vo;

import java.util.ArrayList;

public abstract class estabelecimento {
	
	protected abstract cardapio addCardapio(cardapio cardapio);
	
	
	public estabelecimento(estabelecimento nome) {
		this.nome = nome;
	}


	private estabelecimento nome;
	private ArrayList<cardapio> cardapio;

	public estabelecimento(String nome2) {
		// TODO Auto-generated constructor stub
	}


	public estabelecimento getNome() {
		return nome;
	}


	public void setNome(estabelecimento nome2) {
		this.nome = nome2;
	}

	public ArrayList<cardapio> getCardapio() {
		return cardapio;
	}

	public void setCardapio(ArrayList<cardapio> cardapio) {
		this.cardapio = cardapio;
	}

	public cardapio addcardapio(cardapio cardapio) {
		return cardapio;
	}


	public void setNome(String next) {
		// TODO Auto-generated method stub
		
	}





}
