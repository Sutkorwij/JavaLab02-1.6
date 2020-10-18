package lab02;

public class lancuch {

	private String str;
	public lancuch (String b)
	{
		str=b;
	}
	
	public String stringgetter()
	{
		return str;
	}
	
	public int dajDlugoscLanchucha()
	{
		return str.length();
	}
	public int dajIloscLiter()
	{
		String parts[] = str.split(" ");
		int dlugosc = 0;
		for(int i = 0; i<parts.length; i++)
		{
			dlugosc = dlugosc + parts[i].length();
		}
		return dlugosc;	
	}
	public int dajIloscWielkichLiter()
	{
		
	}
	public int dajIloscMalychLiter()
	{
		return(dajIloscLiter() - dajIloscWielkichLiter());
	}
	public int dajIloscSamoglosek()
	{
		
	}
	public int dajIloscWyrazow()
	{
		
	}
	public String dajNajkrotszyWyraz()
	{
		
	}
	public String dajNajdluzszyWyraz()
	{
		
	}
	public int dajDlugoscNajkrotszegoWyrazu()
	{
		
	}
	public int dajDlugoscNajdluzszegoWyrazu()
	{
		
	}
}
