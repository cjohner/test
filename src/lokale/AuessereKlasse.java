package lokale;

public class AuessereKlasse {
	public void machEbbis(){
		System.out.println("Hallo von auesserer Klasse");
		final int i = 3;
		class InnereKlasse{
			
			public void machEbbis(){
				System.out.println("hallo von innerer Klasse" + i);
			}
		}
		InnereKlasse innere = new InnereKlasse();
		innere.machEbbis();
	}
}
