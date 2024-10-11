package personnages.principaux;

public class Samurai extends Ronin{
	private String nomS;
	
	public Samurai(String nom, int argent, String boisson, String nomS) {
		super(nom,argent,boisson);
		this.nomS = nomS;
	}
	
	public void boire(String boisson) {
		super.parler("Je bois du" + boisson);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Mon nom de samurai est" + this.nomS);
	}

}
