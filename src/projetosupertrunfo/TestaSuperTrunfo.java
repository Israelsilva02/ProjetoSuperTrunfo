package projetosupertrunfo;

import projetosupertrunfo.card.Carta;
import projetosupertrunfo.card.JogadorSingleton;
import projetosupertrunfo.dto.CartaComparacaoEstrategia;
import projetosupertrunfo.dto.Jogador;

public class TestaSuperTrunfo {
	public static void main(String[] args) {
		Carta carta1 = new Carta("Charizard", 100, 80, 150);
		Carta carta2 = new Carta("Feraligator", 90, 100, 120);
		Carta carta3 = new Carta("Giratina", 110, 70, 130);
		Carta carta4 = new Carta("Pikachu", 500, 180, 10);
		Carta carta5 = new Carta("Stelix", 90, 1, 20);
		Carta carta6 = new Carta("Dialga", 10, 270, 40);

		// Crie uma instância da estratégia de comparação
		CartaComparacaoEstrategia estrategia = new CartaComparacaoEstrategia();

		// Compare as cartas
		Carta vencedora = estrategia.compararCartas(carta1, carta2);
		Carta vencedora1 = estrategia.compararCartas(carta3, carta4);
		Carta vencedora2 = estrategia.compararCartas(carta5, carta6);

		if (vencedora != null) {
			System.out.println("A carta vencedora é: " + vencedora.getName());
		} else {
			System.out.println("Empate entre as cartas!");
		}

		// Teste com outra combinação
		vencedora = estrategia.compararCartas(carta2, carta3);
		vencedora1 = estrategia.compararCartas(carta3, carta4);
		vencedora2 = estrategia.compararCartas(carta5, carta6);
		if (vencedora != null) {
			System.out.println("A carta vencedora é: " + vencedora.getName());
			System.out.println("A carta vencedora1 é: " + vencedora1.getName());
			System.out.println("A carta vencedora2 é: " + vencedora2.getName());
		} else {
			System.out.println("Empate entre as cartas!");

		}
	}
}
