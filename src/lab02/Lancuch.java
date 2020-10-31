package lab02;

public class Lancuch {

	private String str;
	public Lancuch (String b)
	{
		str=b;
	}
	
	public String stringgetter()
	{
		return str;
	}
	
	
	private String part(String a) {
		String replaced = a;
		
		replaced = replaced.replaceAll("[^A-Za-z ]", "");
		
		for(int i=0; i<2; i++)
		{
		replaced = replaced.replaceAll("   ", " ");
		}
		replaced = replaced.replaceAll("  ", " ");
		
		return(replaced);
	}
	
	public int dajDlugoscLanchucha()
	{
		return str.length();
	}
	public int dajIloscLiter()
	{
		String temp = part(str);
		String parts[] = temp.split(" ");
		int dlugosc = 0;
		for(int i = 0; i<parts.length; i++)
		{
			dlugosc = dlugosc + parts[i].length();
		}
		return dlugosc;	
	}
	public int dajIloscWielkichLiter()
	{
		char parts[] = str.toCharArray();
		int ilosc = 0;
		for(int i = 0; i<parts.length; i++)
		{
		boolean a = Character.isUpperCase(parts[i]);
		if(a == true)
		{
			ilosc++;
		}
		}
		return ilosc;
	}
	public int dajIloscMalychLiter()
	{
		return(dajIloscLiter() - dajIloscWielkichLiter());
	}
	public int dajIloscSamoglosek()
	{
		char parts[] = str.toCharArray();
		int ilosc = 0;
		for(int i =0; i < parts.length; i++)
		{
			if(parts[i] == 'a' || parts[i] == 'e' || parts[i] == 'i' || parts[i] == 'o' || parts[i] == 'y' || parts[i] == 'u')
			{
				ilosc++;
			}
		}
		return ilosc;
	}
	public int dajIloscWyrazow()
	{
		String temp = part(str);
		String parts[] = temp.split(" ");
		int ilosc = 0;
		for (int i=0; i<parts.length;i++)
		{
			ilosc++;
		}
		return ilosc;
	}
	public String dajNajkrotszyWyraz()
	{
		String temp = part(str);
		String parts[] = temp.split(" ");
		String shortest = parts[0];
		for (int i=1; i <parts.length;i++)
		{
			if(shortest.length() > parts[i].length())
			{
				shortest = parts[i];
			}
		}
		return shortest;
	}
	public String dajNajdluzszyWyraz()
	{
		String temp = part(str);
		String parts[] = temp.split(" ");
		String longest = parts[0];
		for (int i=1; i <parts.length;i++)
		{
			if(longest.length() < parts[i].length())
			{
				longest = parts[i];
			}
		}
		return longest;
	}
	public int dajDlugoscNajkrotszegoWyrazu()
	{
		int dlugosc = dajNajkrotszyWyraz().length();
		return dlugosc;
	}
	public int dajDlugoscNajdluzszegoWyrazu()
	{
		int dlugosc = dajNajdluzszyWyraz().length();
		return dlugosc;
	}
}
