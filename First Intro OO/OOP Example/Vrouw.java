public class Vrouw {
	
	public String naam;
	
	public Vrouw() {
		this("hey");
	}
	public Vrouw(String naam)
	{
		this.naam = naam;
	}
	
	public void printNaam()
	{
		System.out.println(naam);
	}
}
