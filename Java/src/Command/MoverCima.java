package Command;
import Personagens.*;

public class MoverCima implements Command {
	Personagem p;
	
	public MoverCima(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.setY(this.p.getY()+1);
	}
}
