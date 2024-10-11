package histoires;
import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Yakusa;
import personnages.principaux.Ronin;

public class MonHistoire {
	public static void main(String[] args) {
		Humain humain = new Humain("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();
		Yakusa yakusa = new Yakusa("Yaku␣le␣noir", 42,"biere","WarSong");
		yakusa.direBonjour();
		yakusa.extorquer(commercant);
		Ronin ronin = new Ronin("Roro", 61,"sake");
		ronin.donner(commercant,10);
		ronin.provoquer(yakusa);
		ronin.direBonjour();
	}
}
