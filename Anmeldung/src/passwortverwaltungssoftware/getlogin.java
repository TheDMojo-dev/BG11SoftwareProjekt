
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getlogin{

	static List<String> kundenv = new ArrayList<>();
	static List<String> kundenN = new ArrayList<>();
	static List<Kunde> kunden = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		int finishreader = 0;

		FileReader fr = new FileReader(
				"Mitarbeiterspeicher.txt");
		BufferedReader br = new BufferedReader(fr);

		while (finishreader == 0) {

			String Kundennachname = br.readLine();
			String Kundenvorname = br.readLine();
			
			Kunde kunde = new Kunde();
			kunde.Kundennachname = Kundennachname;
			kunde.Kundenvorname  = Kundenvorname;
			

			if (Kundennachname == null) {
				finishreader = 1;

			} else {

				kundenv.add(Kundenvorname);
				kundenN.add(Kundennachname);
				kunden.add(kunde);
			}

		}
		System.out.println(kunden);
		br.close();
		int Kundennummer = kundenN.size();
		System.out.println("Found " + Kundennummer + " clients!");
		int Schleife = 2, i = 0;
		while (Schleife == 2) {
			Scanner eingabewert = new Scanner(System.in);
			System.out.println("Stammkunde suchen(1) / Stammkundenkonto eröffnen (2) / Stammkundenkonto löschen (3)");
			System.out.println("Aufgabe: ");
			int Aufgabe = eingabewert.nextInt();

			if (Aufgabe > 0 && Aufgabe < 4) {
				if (Aufgabe == 1) {
					System.out.println("Nachname des Kunden: ");
					String Kundennachname = eingabewert.next();
					System.out.println("Vorname des Kunden: ");
					String Kundenvorname = eingabewert.next();
					i = 0;
					int searchengine = 0;
					while (searchengine == 0) {
						if (Kundennachname.equals(kunden.get(i).Kundennachname) && Kundenvorname.equals(kunden.get(i).Kundenvorname)) {
							System.out.println("Stammkunde Gefunden No." + i);
							searchengine = 1;
						} else {
							i++;
							if (i >= Kundennummer) {
								searchengine = 1;
							}
						}
					}
				}
			}

			
			System.out.println(i);
			System.out.println(kunden.get(i).Kundennachname);
			System.out.println(kunden.get(i).Kundenvorname);

		}

	}
}
