package cadastro;
import java.util.*;

public class Validador {
	private List<Controle> valida = new ArrayList<>();

	public List<Controle> getValida() {
		return valida;
	}

	public void setValida(Controle valida) {
		this.valida.add(valida);
	}

	@Override
	public String toString() {
		return "Validador [valida=" + valida + "]";
	} 
	
}