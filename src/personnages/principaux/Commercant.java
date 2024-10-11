package personnages.principaux;
import personnages.Humain;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom,argent,"");
	}
	
	public int seFaireExtorquer() {
		int nouvargent = super.getArgent();
		nouvargent = 0;
		super.parler("Le monde est trop injuste");
		return nouvargent;
	}
	
	public void recevoir(int n) {
		super.gagnerArgent(n);
	}
	
}
