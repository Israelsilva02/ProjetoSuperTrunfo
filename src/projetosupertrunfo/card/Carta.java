package projetosupertrunfo.card;

import java.util.Objects;

public class Carta {
	private String name;
	private int ataque;
	private int defesa;
	private int vida;

	public Carta(String name, int ataque, int defesa, int vida) {
		super();
		this.name = name;
		this.ataque = ataque;
		this.defesa = defesa;
		this.vida = vida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ataque, defesa, name, vida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return ataque == other.ataque && defesa == other.defesa && Objects.equals(name, other.name)
				&& vida == other.vida;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "Carta [name=" + name + ", ataque=" + ataque + ", defesa=" + defesa + ", vida=" + vida + "]";
	}

}
