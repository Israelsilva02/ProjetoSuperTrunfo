package projetosupertrunfo.dto;

import java.util.ArrayList;
import java.util.List;

import projetosupertrunfo.card.Carta;

public class Jogador {
	private List<Carta> cartas = new ArrayList<>();
	private CartaComparacaoEstrategia cartaComparacaoEstrategia;

	public void addCard(Carta carta) {
		cartas.add(carta);
	}

	public void CartaParaComparar(CartaComparacaoEstrategia estrategia) {
		this.cartaComparacaoEstrategia= estrategia;
	}

	public Carta getVencedorCarta(Carta carta) {
		
		return carta;
	}

}
