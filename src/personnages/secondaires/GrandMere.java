package personnages.secondaires;
import personnages.Humain;
import java.util.Random;

public class GrandMere extends Humain{
	private Humain[] memoire = new Humain[30];
	
	public GrandMere(String nom, int argent, String boisson) {
		super(nom,argent,boisson);
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		for(int i = 0; i < memoire.length; i++) {
			if(this.memoire[i] != null) {
				this.memoire[i] = humain;
				super.parler("J'ai fait connaissance de" + humain.getNom());
				return;
			}
			else {
				super.parler("Le tableau est rempli");
			}
		}
	}
	
	public void ragoter() {
		for(Humain humain: memoire) {
			if(humain != null) {
				if(humain instanceof Traitre) {
					super.parler("Je sais que " + humain + "est un traitre");
				}
				else {
					super.parler("Je crois que " + humain + "est un" + humain.getClass());
				}
			}
		}
		
	}
	
	private String humainHasard() {
		Random random = new Random();
		int choix = random.nextInt(4);
		switch(choix) {
			case 0: 
				return "Commercant";
			case 1:
				return "Ronin";
			case 2:
				return "Yakusa";
			case 3:
				return "Samurai";
			default:
				return "Inconnu";
		}
	}
}
