package personnages.secondaires;
import personnages.principaux.Yakusa;

public class Ninja extends Yakusa{
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	public Ninja(String nom, int argent, String boisson, String clan){
		super(nom,argent,boisson,clan);
	}
	
	public String[] getClans() {
		return clansNinja;
	}
	
	@Override
	public String getClan() {
		return super.getClan();
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Mon clan secret est" + super.getClan() + this.clansNinja + "et maintenant que tu le sais, je vais devoir te tuer");
	}
}
