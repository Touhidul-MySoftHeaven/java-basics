package firstJavaProject;

public class StartPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Allah Akbar");
		Cow cow=new Cow();
		
		System.out.println(cow.makeFirstNamae("touhidul", "islam"));
		cow.run();
	}

}

class Cow implements Animal {
	
	  
	  public void run() {
	    // The body of sleep() is provided here
	    System.out.println("Zzz");
	  }
	@Override
	public String makeFirstNamae(String firstname,String lastname) {
		
		return firstname+' '+lastname;
	}
	
}


interface Animal {
	  public String makeFirstNamae(String firstname,String lastname); // interface method (does not have a body)
	  public void run(); // interface method (does not have a body)
	}