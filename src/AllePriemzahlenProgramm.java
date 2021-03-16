public class AllePriemzahlenProgramm {
	public static void main(String[] args) {
		//Betrachte alle Zahlen i von 1 bis 100
		for(int i=1; i<=100; i++) {
// hier zahl eingeben    ^
			//Annahme: i ist Priemzahl
			boolean istPriemzahl = true;
			//Betrachte alle Zahlen j 2 bis i-1
			for(int j=2; j<i; j++) {
				//Wenn i durch j geteilt werden kann
				if(i%j == 0) {
					// i ist doch keine Priemzahl
					istPriemzahl = false;
					//und die Teilersuche kann abgebrochen werden
					break;
				}
			}
			if(istPriemzahl) {
				System.out.println(i);
			}
		}

	}

}
