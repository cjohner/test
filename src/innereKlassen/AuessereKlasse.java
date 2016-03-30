package innereKlassen;

public class AuessereKlasse {
	public void machEbbis () {
		System.out.println("Hallo von Startklasse");
	}
	
	public class InnereKlasse {
		public class GanzInnereKlasse {
			public void machEbbis(){
				System.out.println("Hallo von ganz innerer Klasse");
			}
		}
		
		public void machEbbis () {
			System.out.println("Hallo von innerer Klasse");
		}
	}

}
