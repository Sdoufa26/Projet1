package personnages.principaux;
import personnages.Humain;

public class Yakusa extends Humain{
	private String clan;
	private int reputation;
	
	public Yakusa(String nom, int argent, String boisson, String clan) {
		super(nom,argent,boisson);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commercant c) {
		int argentC = c.getArgent();
		super.gagnerArgent(argentC);
		argentC = 0;
		this.reputation += 1;
		c.parler("J’ai tout perdu! Le monde est trop injuste");
		super.parler("J'ai piqué le fric de" + c.getNom());
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		super.parler("J'ai gagné mon duel et mes" + super.getArgent() + "sous");
	}
	
	public int perdreDuel() {
		int argentY = super.getArgent();
		this.reputation -= 1;
		super.parler("J'ai perdu mon duel et mes" + super.getArgent() + "sous, snif...");
		super.perdreArgent(argentY);
		return argentY;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("sous en poche Mon clan est celui de" + this.clan);
	}
	
}
