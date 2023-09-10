package learingSecond;

import java.util.HashMap;

public class StartPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		//System.out.println("AllaK Akbar La ilaha Illah");
		
		Phone phn=new Iphone();
		phn.run();
		Phone phn1=new Androidphone();
		phn1.run();
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    //System.out.println(capitalCities);
	    for(String key:capitalCities.keySet())
	    {
	    	System.out.println(" "+capitalCities.get(key));
	    }
	    
	    StartPoint.calculate(phn1);
	    
	    Androidphone androidPhone=new Androidphone();
	    androidPhone.singSongextra();
	    
	}
     
	public static void calculate(Phone phone)
	{
		phone.singSong();
	}
}

abstract class Phone
{
	protected void run()
	{
		
	}
	protected void singSong()
	{
		
	}
}
class Iphone extends Phone
{
	public void run()
	{
		System.out.println("This is can Run");
	}
	public void singSong()
	{
		System.out.println("This is can SingSong");
	}
}
class Androidphone extends Phone
{
	public void run()
	{
		System.out.println("This is can Run Anroid");
	}
	public void singSong()
	{
		System.out.println("This is can SingSong Anroid");
	}
	public void singSongextra()
	{
		System.out.println("This is can SingSong Anroid extra");
	}
}






