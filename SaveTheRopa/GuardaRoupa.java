package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

	private Map<Integer, List<Vestuario>> vestuarios;

	public Map<Integer, List<Vestuario>> getVestuarios() {
		return vestuarios;
	}

	 public GuardaRoupa() {
	        this.vestuarios = new HashMap<>();
	    }
	
	public void setVestuarios(Map<Integer, List<Vestuario>> vestuarios) {
		this.vestuarios = vestuarios;
	}

	public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {

		Integer idGuardaRoupa = (int) (Math.random() * 1000);

		this.vestuarios.put(idGuardaRoupa, listaDeVestuario);

		return idGuardaRoupa;

	}

	public void mostrarVestuarios() {
		this.vestuarios.forEach((idGuardaRoupa, vestuarios) -> {
			vestuarios.forEach(
					vestuario ->  
					System.out.println(" guarda-roupa/chave " + idGuardaRoupa + " - vestuario guardado -> { " + vestuario.getMarca()+" "+vestuario.getModelo() +"}"));
		});
	}
	 public List<Vestuario> devolverVestuarios(Integer idGuardaRoupa) {
	        return this.vestuarios.get(idGuardaRoupa);
	    }
}
