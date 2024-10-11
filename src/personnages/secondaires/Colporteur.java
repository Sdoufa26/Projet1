package personnages.secondaires;
import personnages.principaux.Commercant;

public class Colporteur extends Commercant{
	public Colporteur(String nom, int argent) {
		super(nom,argent);
	}
	
	@Override
	public int seFaireExtorquer() {
		int argentC = super.getArgent() / 2;
		super.perdreArgent(argentC);
		super.parler("Je n'ai perdu que la moitié de mon argent");
		return argentC;
	}
}
