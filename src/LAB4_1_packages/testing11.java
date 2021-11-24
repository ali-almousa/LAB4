package LAB4_1_packages;
import java.time.*; 
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

// this schedule doesn't take into consideration the minutes
// only the hours to simplify the presentation of idea 
public class testing11 {
	
	  public static void main(String[] args) {
		  
		  // Name
		  System.out.println("###################################################"); 
		  System.out.println("#                                                 #"); 
		  wait(200);
		  System.out.print("#       Student Name: ");
		    wait(200);
		    System.out.print("K");
		    wait(200);
		    System.out.print("h");
		    wait(200);
			System.out.print("a");
			wait(200);
			System.out.print("d");
			wait(200);
			System.out.print("i");
			wait(200);
		    System.out.print("j");
		    wait(200);
		    System.out.print("a");
		    wait(200);
			System.out.print("h ");
			wait(200);
			System.out.print("A");
			wait(200);
			System.out.print("l ");
		    wait(200);
		    System.out.print("R");
		    wait(200);
			System.out.print("i");
			wait(200);
			System.out.print("f");
			wait(200);
			System.out.print("a");
			wait(200);
			System.out.println("i           #");
			wait(200);
		  System.out.println("#                                                 #"); 
		  System.out.println("###################################################\n\n");

		  
		  
		  
		  
		  
		  //get the current time and format it
		    LocalDateTime myDateObj = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		    Scanner input = new Scanner(System.in);
		    
		    
		    //two lists to hold info about time and activities 
		    ArrayList<String> activities = new ArrayList();
		    ArrayList<Integer> appointments = new ArrayList();
		    
		    
		    //Receive all user's activities and times
		    while(true) {
		    	System.out.print("Enter the activity to register or 0 to exit and show your schedule: ");
		    	String choice = input.nextLine();
		    	System.out.print("\n");
		    	
		    	if("0".equals(choice)) {
		    		break;
		    	}
		    	
		    	else {
		    		activities.add(choice);
		    		System.out.print("Enter the hour you want me to notify you about " + choice + " ");
		    		Integer time = input.nextInt();
		    		appointments.add(time);
		    		input.nextLine();
		    		System.out.print("\n\n\n");
		    	}
		    	
		    }
		    
		    
		    
		    System.out.println("*********************************");
		    System.out.println("*********************************");
		    wait(500);
		    System.out.print("*SHOWING ");
		    wait(500);
		    System.out.print("YOUR ");
		    wait(500);
    		System.out.print("SCHEDULE ");
    		wait(500);
    		System.out.print("FOR ");
    		wait(500);
    		System.out.println("TODAY* ");
    		wait(500);
    		System.out.println("*********************************");
		    System.out.println("*********************************\n\n");

		    System.out.println("Current Time: " + myDateObj.format(myFormatObj));
		    System.out.println("Simulating as the time passing by\n");
		    
		    int counter = 24;
		    while(counter != 0) {
		    	
		    	
		    	wait(800);
		    	myDateObj = myDateObj.plusHours(1);
		    	System.out.println("Time: " + myDateObj.format(myFormatObj));
		    	System.out.println("######################");
		    	
		    	for(int i = 0; i < appointments.size(); i++) {
		    		if (myDateObj.getHour() == appointments.get(i)) {
					    wait(500);
					    System.out.print("-> ");
					    wait(500);
					    System.out.print("-> ");
					    wait(500);
			    		System.out.print("-> ");
			    		wait(500);
			    		System.out.print("-> ");
			    		wait(500);
			    		System.out.print("-> ");
			    		wait(500);
			    		System.out.print("-> ");
			    		wait(500);
			    		System.out.print("-> ");
			    		wait(500);
		    			System.out.println(activities.get(i));
		    			System.out.print("\n");
		    			
		    			appointments.remove(i);
		    			activities.remove(i);
		    		}//end if
		    		
		    	}//end for
		    	
		    	counter--;	    	
		    }//end while

	  }//end main
	  
	  // this method to create a simple delay
	  public static void wait(int ms)
	  {
	      try
	      {
	          Thread.sleep(ms);
	      }
	      catch(InterruptedException ex)
	      {
	          Thread.currentThread().interrupt();
	      }
	  }
	  
}
