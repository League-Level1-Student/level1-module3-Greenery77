package _01_intro_to_static;


public class Athlete {
    static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";
    
    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        this.bibNumber = nextBibNumber++;
        
    }

    public static void main(String[] args) {
    	
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    
    	Athlete athone = new Athlete("", 1);
    	
    	System.out.println(athone.bibNumber);
    	
    	Athlete athtwo = new Athlete("", 2);
    	
    	System.out.println(athtwo.bibNumber);
    
    }
}

