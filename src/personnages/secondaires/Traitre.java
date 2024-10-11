package personnages.secondaires;
import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samurai;

public class Traitre extends Samurai{
	private int traitrise;
	
	public Traitre(String nom, int argent, String boisson, String nomS) {
		super(nom,argent,boisson,nomS);
		this.traitrise = 0;
	}
	
	public void extorquer(Commercant c) {
		if(this.traitrise < 3) {
			int argentC = c.getArgent();
			super.gagnerArgent(argentC);
			c.perdreArgent(argentC);
			this.traitrise += 1;
			super.parler("J'ai extorqué " + c.getNom() + "et ma traitrise est de" + this.traitrise);
		}
	}
	
	public void faireLeGentil(Humain h, int n) {
		if(super.getArgent() >= n) {
			h.gagnerArgent(n);
			super.perdreArgent(n);
			super.parler("J'ai fait ami ami avec un" + h.getClass());
			this.traitrise -= n/10;	
			if(this.traitrise < 0) {
				this.traitrise -= 0;	
			}
		}
		
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Niveau de traitrise:" + this.traitrise);
	}
}
