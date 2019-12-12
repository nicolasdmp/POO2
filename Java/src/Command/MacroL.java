package Command;
import java.util.*;
import Personagens.*;

public class MacroL implements Command {
	Personagem p;
	
	public MacroL(Personagem personagem) {
		this.p=personagem;
	}
	
	private ArrayList<Command> macro= new ArrayList<Command>();
	
	public void add(Command c){macro.add(c);}
	
	public void execute(){
        for (Command c : macro){
            c.execute();
        }     
    }
}
