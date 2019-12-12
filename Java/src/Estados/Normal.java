package Estados;

import Personagens.Personagem;
import TiposAtaque.Medio;
import TiposCorrida.MovMedio;

public class Normal extends Estado {
	public Normal(Personagem personagem) {
		super(personagem);
		super.getPersonagem().setAtaque(new Medio());
		super.getPersonagem().setMovimento(new MovMedio());
	}

	public void verificarEstado() {
		if(this.getPersonagem().getVida() < this.getLimiteinf()) {
			this.getPersonagem().setEstado(new Perigo(this.getPersonagem()));
		}
		if(this.getPersonagem().getVida() > this.getLimitesup()) {
			this.getPersonagem().setEstado(new EstadoForte(this.getPersonagem()));
		}
		
	}

	protected void setLimites() {
		this.setLimiteinf(30);
		this.setLimitesup(70);
	}
	
	public void levarDano(int dano) {
		this.getPersonagem().setVida(this.getPersonagem().getVida() - dano);
		this.verificarEstado();
	}
	
	public void pegarRecompensa(int recompensa) {
		this.getPersonagem().setVida(this.getPersonagem().getVida() + recompensa);
		this.verificarEstado();
	}
}
