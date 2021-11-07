package main;

import persona.Gambe;
import persona.Mani;
import persona.Persona;
import persona.Viso;

public class PersonaFacade {
	
	private Persona persona=null; 
	
	public void createPersona(int numeroDitaMani, int numeroDitaPiedi, String coloreOcchi, String coloreCapelli)
	{
		Mani m= new Mani(numeroDitaMani);
		Gambe g= new Gambe(numeroDitaPiedi);
		Viso v= new Viso(coloreOcchi, coloreCapelli);
		
		persona= new Persona(m, v, g);
	}
	
	public void printInfo()
	{
		if(persona!=null)
			persona.getPersona();
		else
			System.out.println("inizializza persona");
	}

}
