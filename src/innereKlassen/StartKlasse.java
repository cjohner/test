package innereKlassen;

public class StartKlasse {
	public static void main(String[] args) {
		AuessereKlasse auessere = new AuessereKlasse();
		auessere.machEbbis();
		
		AuessereKlasse.InnereKlasse innere = auessere.new InnereKlasse();
		innere.machEbbis();
		
		AuessereKlasse.InnereKlasse.GanzInnereKlasse ganzinnen = innere.new GanzInnereKlasse();
		ganzinnen.machEbbis();
		
		//In einer Zeile  instanzieren und aufrufen der innersten machEbbis()-Methode
		new AuessereKlasse().new InnereKlasse().new GanzInnereKlasse().machEbbis();
		
	}
}
