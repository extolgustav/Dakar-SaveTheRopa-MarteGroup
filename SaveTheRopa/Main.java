package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	
	    public static void main(String[] args) {

	        Vestuario vestuario1 = new Vestuario("Marca A", " Modelo A");
	        Vestuario vestuario2 = new Vestuario("Marca B", " Modelo B");
	        Vestuario vestuario3 = new Vestuario("Marca C", " Modelo C");
	        Vestuario vestuario4 = new Vestuario("Marca D", " Modelo D");
	        Vestuario vestuario5 = new Vestuario("Marca E", " Modelo E");
	        
	        List<Vestuario> listaDeVestuarios1 = new ArrayList<>();
	        listaDeVestuarios1.add(vestuario1);
	        listaDeVestuarios1.add(vestuario2);
	        listaDeVestuarios1.add(vestuario3);

	        List<Vestuario> listaDeVestuarios2 = new ArrayList<>();
	        listaDeVestuarios2.add(vestuario4);
	        listaDeVestuarios2.add(vestuario5);

	        GuardaRoupa guardaRoupa = new GuardaRoupa();
	        Integer chaveGuardaRoupa1 = guardaRoupa.guardarVestuarios(listaDeVestuarios1);
	        System.out.println("chave 1: " + chaveGuardaRoupa1);
	        
	        Integer chaveGuardaRoupa2 = guardaRoupa.guardarVestuarios(listaDeVestuarios2);
	        System.out.println("chave 2: " + chaveGuardaRoupa2);
	        guardaRoupa.mostrarVestuarios();
	        
	        
	        
	        System.out.println("--- RETIRADA 1 - chave "+chaveGuardaRoupa1+" - "+new Date()+" ---");
	        for(Vestuario s : guardaRoupa.devolverVestuarios(chaveGuardaRoupa1)) {
	        	System.out.println(s.getMarca()+" "+s.getModelo());
	        }
	        System.out.println("--- RETIRADA 2 - chave "+chaveGuardaRoupa2+" - "+new Date()+" ---");
	        for(Vestuario s : guardaRoupa.devolverVestuarios(chaveGuardaRoupa2)) {
	        	System.out.println(s.getMarca()+" "+s.getModelo());
	        }

	    }
	}


