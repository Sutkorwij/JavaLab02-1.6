package lab02;

//na same spacje !!

public class mainclass {

	public static void main(String[] args) {
		//String
		String a = "Strings are constant their values cannot be changed after they are created";
		//Konstruktor
		lancuch lancuch1 = new lancuch(a);
		
		if(a==null || a=="")
		{
			System.out.println("Nieprawidlowy string");
		}
		else
		{
		//D³ugoœæ stringa
		System.out.println("Dlugosc stringa to: "+ lancuch1.dajDlugoscLanchucha());
		//Iloœæ liter
		System.out.println("Ilosc liter to: " + lancuch1.dajIloscLiter());
		//Iloœæ wielkich liter
		System.out.println("Ilosc wielkich liter to: " + lancuch1.dajIloscWielkichLiter());
		//Iloœæ ma³ych liter
		System.out.println("Ilosc malych liter to: " + lancuch1.dajIloscMalychLiter());
		//Iloœæ samog³osek
		System.out.println("Ilosc samoglosek to: " + lancuch1.dajIloscSamoglosek());
		//Iloœæ wyrazów
		System.out.println("Ilosc wyrazow to: " + lancuch1.dajIloscWyrazow());
		//Najkrótszy wyraz
		System.out.println("Najkrotszy wyraz to: " + lancuch1.dajNajkrotszyWyraz());
		//Najdluzszy wyraz
		System.out.println("Najdluzszy wyraz to: " + lancuch1.dajNajdluzszyWyraz());
		//D³ugoœæ najkrótszego wyrazu
		System.out.println("Dlugosc najkrotszego wyrazu to: " + lancuch1.dajDlugoscNajkrotszegoWyrazu());
		//D³ugoœæ najd³u¿szego wyrazu
		System.out.println("Dlugosc najkrotszego wyrazu to: " + lancuch1.dajDlugoscNajdluzszegoWyrazu());
		}
	}

}
