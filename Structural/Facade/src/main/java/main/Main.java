package main;

public class Main {
	public static void main(String[] args) {
		PersonaFacade persona= new PersonaFacade();
		persona.createPersona(10, 10, "Verdi", "Castano");
		persona.printInfo();
	}

}
