package projetosupertrunfo.service;

import projetosupertrunfo.card.Carta;
import projetosupertrunfo.repository.CartaRepository;

public class CartaRepositoryImpl implements CartaRepository {
	@Override
    public int compare(Carta carta1, Carta carta2) {
        return Integer.compare(carta1.getAtaque(), carta2.getAtaque());
    }
}
