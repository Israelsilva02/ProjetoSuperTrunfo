package projetosupertrunfo.card;

import projetosupertrunfo.dto.Jogador;

public class JogadorSingleton {
	private static Jogador instance;

    private JogadorSingleton() {
        
    }

    public static Jogador getInstance() {
        if (instance == null) {
        }
        return instance;
    }

}
