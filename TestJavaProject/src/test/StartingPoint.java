package test;

import java.util.ArrayList;
import java.util.List;

public class StartingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	   Student khalid=new Student();
	   khalid.setFirstname("khalid");
	   khalid.setLastname("Hosen");
	   khalid.setEmail("aziz.balpakna@mail.com");
	   
	   Address khalidAddress=new Address();
	   khalidAddress.setDivision("Rajshahii");
	   khalidAddress.setDistrict("Pabna");
	   khalidAddress.setUpzilla("Ishurdi");
	   khalid.setstAddress(khalidAddress);
	   
	   List<Course> courselist=new ArrayList<Course>();
	   courselist.add(new Course("CSE basic coding","CSE141",3));
	   courselist.add(new Course("CSE basic coding1","CSE142",3));
	   courselist.add(new Course("CSE basic coding2","CSE143",3));
	   
	   for (Course integer : courselist) {
	         System.out.print(integer + " ");
	      }
	   
	   System.out.println(khalid.getstAddress().getDivision());
	 
	}

}
