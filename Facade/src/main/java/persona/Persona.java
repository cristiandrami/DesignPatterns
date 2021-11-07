
package persona;

public class Persona {
	private Mani mani;
	private Viso viso;
	private Gambe gambe;
	public Persona(Mani mani, Viso viso, Gambe gambe) {
		super();
		this.mani = mani;
		this.viso = viso;
		this.gambe = gambe;
	}
	public Mani getMani() {
		return mani;
	}
	public void setMani(Mani mani) {
		this.mani = mani;
	}
	public Viso getViso() {
		return viso;
	}
	public void setViso(Viso viso) {
		this.viso = viso;
	}
	public Gambe getGambe() {
		return gambe;
	}
	public void setGambe(Gambe gambe) {
		this.gambe = gambe;
	}
	
	public void getPersona()
	{
		System.out.println("dita delle mani: "+ mani.getNumeroDita());
		System.out.println("colore occhi: "+ viso.getColoreOcchi());
		System.out.println("colore capelli: "+ viso.getColoreCapelli());
		System.out.println("dita piedi: "+ gambe.getNumeroDita());
	}
	
	
}
