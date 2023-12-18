
public class Elain 
{
	//Attribuutit
	
	private String elainlaji;
	private String elainrotu;
	private int ika;
	private String saapunut;
	private String luovutuspaiva;
	private String muuta;
	
	//Setters
	
	public void setElainLaji(String newElainlaji)
	{
		elainlaji = newElainlaji;
	}
	
	public void setElainrotu(String newElainRotu)
	{
		elainrotu = newElainRotu;
	}
	public void setIka (int newIka)
	{
		ika = newIka;
	}
	public void setSaapunut (String newSaapunut)
	{
		saapunut = newSaapunut;
	}
	public void setLuovutusPaiva (String newLuovutusPaiva)
	{
		luovutuspaiva = newLuovutusPaiva;
	}
	public void setMuuta (String newMuuta)
	{
		muuta = newMuuta;
	}
	
	//Getters
	
	public String getElainLaji()
	{
		return elainlaji;
	}
	
	public String getElainRotu()
	{
		return elainrotu;
	}
	
	public int getIka()
	{
		return ika;
	}
	
	public String getSaapunut()
	{
		return saapunut;
	}
	
	public String getLuovutusPaiva()
	{
		return luovutuspaiva;
	}
	
	public String getMuuta()
	{
		return muuta;
	}
}
