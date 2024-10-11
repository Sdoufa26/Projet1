package personnages.principaux;
import personnages.Humain;

public class Ronin extends Humain{
	private int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom,argent,boisson);
		this.honneur = 1;
	}
	
	public void donner(Commercant c, int n) {
		if (super.getArgent() >= n) {
			super.perdreArgent(n);
			c.recevoir(n);
			super.parler("Tiens" + c.getNom() + "voilà " + n + "sous");
			c.parler("Je te remercie généreux donateur");
		}
		
	}
	
	public void provoquer(Yakusa y) {
		if ((this.honneur * 2) > y.getReputation()) {
			int argentY = y.perdreDuel();
			this.gagnerArgent(argentY);
			this.honneur += 1;
			super.parler("Je t'ai eu petit yakusa");
		}
		else {
			this.honneur -= 1;
			y.gagnerDuel();
			super.parler("J'ai perdu face au Yakusa");
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
	}
}
