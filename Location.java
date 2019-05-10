  public class Location extends absClass{
	String name;
	 String[] houses = new String[11];
	
	    boolean allclues=false;
		boolean boat=false; //boat
		boolean dragon1=false; //winterfellBanner
		boolean tyrion=false;
		boolean army=false; //army
		boolean drogo=false; 
		boolean end=false;
		
		int currentlocation=0;
	 
public String[] getLocations(){
	return houses;
}

public void populatelands() {
	houses[0] ="Pentos";
	 houses[1] ="Water";
	 houses[2]= "Vaas Dothrak";
	 houses[3]= "Mereen";
	 houses[4]= "Slaver's Bay";
	 houses[5]= "Qohor";
	 houses[6]= "Astapoor";
	 houses[7]= "Winterfell";
	 houses[8]= "The Wall";
	 houses[9]= "King's Landing";
}

// 1 is north
// 2 is south
// 3 is West
//4 is East

public void gameOfThrones()
{
	System.out.println("In the game of thrones, you win or you die!");
}

public void printHouses()
{
	for(int i=0; i<10; i++)
	{
		System.out.println(houses[i]);
	}
	System.out.println("___________________________________________________________________________________________________");
}

public void location(int map)
{
	if (currentlocation==0)
	{
		if(map==1) {
			boat= false;
			System.out.println("AHHH you tried to cross the Narrow Sea without a boat and drowned!!");
			end= true;
			
		}
		else if(map==2) {
			currentlocation=3;
			army = true;
		System.out.println("Welcome to Mereen! Khaleesi has freed the slaves and gain the loyalty of the Unsullied Army.");
			}

		else if(map==4) {
			if(boat==false) {
			currentlocation=1;
			drogo=true;
			System.out.println("You have entered Vaas Dothrak. You have won over the Dothraki horde and Danaerys has become Khaleesi. You have picked up Drogo.");
			}
					
		}
		
		else if(map==3) {
			
			System.out.println("AHHHH you tried to cross the Narrow Sea without a boat and drowned!!");
			end= true;
			
		
			}
					}
	
	
	else if (currentlocation==3) //North
		{
			if(map==1) {
				System.out.println("You're back in Pentos. There's nothing for you here.");
				currentlocation=0;
			}
			else if(map==2) {	
				System.out.println("AHHHH you tried to cross the Narrow Sea without a boat and drowned!!");
				end= true;
			}
			else if(map==4) {
				
				System.out.println("You are in Slaver's Bay. You've gotten the help of Tyrion Lannister.");
				tyrion=true;
			}
			
			else if(map==3) {
				
				System.out.println("You've arrived in Qohor. Khaleesi's dragon's have hatched and can breath fire. Dracarys!!");
				dragon1=true;
			}
	}
}}
	