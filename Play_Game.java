import java.util.Scanner;
	

	public class Play_Game extends Location{

		public static void main(String[] args) {
			
			System.out.println("WELCOME TO KHALEESI'S CONQUEST!");
			System.out.println("___________________________________________________________________________________________________");
			System.out.println("An usurper, Robert Baratheon, has killed the Mad King and taken the Iron throne. The last surviving Targaryen, Danaerys, has escaped death and fled to Essos!");
			System.out.println("She is now the Khaleesi of the Dothraki and has asked you to be her Hand and help her take back her throne.");
	System.out.println("Please enter your first name.");
	Scanner input = new Scanner(System.in);
	String firstName = input.nextLine(); 

	
	
	System.out.println("Please enter your last name.");
	
	String lastName= input.nextLine();
	
	Character player=new Character();
	player.setName(firstName);
	player.setlName(lastName);
	
	System.out.println("___________________________________________________________________________________________________");	
	
	System.out.println("Congratulations "+ player + ", Khaleesi trusts you to guide her on her quest!");
	System.out.println("In order to take the Iron Throne, you must gain the loyalty of the realm and invade King's Landing.");
	System.out.println("To complete your journey you need to acquire the following items: \n1.Boat \n2.4 Banners \n3.Army \n4.Gold \n5.Dragons \n6.Drogo");
	
	System.out.println("___________________________________________________________________________________________________");
			
	
	Location game= new Location();
	game.populatelands();
	String direction;
	int x;
	
	
	
	while(game.end==false)
	{
		direction="";
	x=0;
	System.out.println("Where would you like to go? North, south, east, or west?");
	direction= input.nextLine();
	if (direction.equalsIgnoreCase("north"))
		x = 1;	
	else if (direction.equalsIgnoreCase("south"))
		x = 2;	
	else if (direction.equalsIgnoreCase("west"))
		x = 3;	
	else if (direction.equalsIgnoreCase("east"))
		x = 4;
	
	game.location(x);
	direction="";
	System.out.println("___________________________________________________________________________________________________");
	}
	input.close();
	
	System.out.println("Thanks for playing Khaleesi's Conquest!");
	
		}
	}
	
