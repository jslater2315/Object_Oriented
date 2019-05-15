public class Location extends absClass{
	String name;
	String[] houses = new String[14];

	boolean allclues=false;
	boolean boat=false; 
	boolean dragon1=false; 
	boolean tyrion=false;
	boolean army=false; 
	boolean drogo=false; 
	boolean gold=false;
	boolean greyjoyBanner= false;
	boolean winterfellBanner= false;
	boolean lanisterBanner= false;
	boolean dragonStoneBanner= false;
	boolean food= false;
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
		houses[11]= "Casterly Rock";
		houses[12]= "Dragon Stone";
		houses[13]= "Iron Islands";
		
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
		for(int i=0; i<14; i++)
		{
			System.out.println(houses[i]);
		}
		System.out.println("___________________________________________________________________________________________________");
	}

	public void location(int map)
	{
		if (currentlocation==0) //Pentos
		{
			if(map==1) {
				boat= false;
				System.out.println("AHHH you tried to cross the Narrow Sea without a boat and drowned!!");
				end= true;

			}
			else if(map==2) {
				currentlocation=3;
				army = true;
				gold = true;
				System.out.println("Welcome to Mereen! Khaleesi has freed the slaves and gain the loyalty of the Unsullied Army. You have also gotten gold.");
			}

			else if(map==4) {
				if(boat==false) {
					currentlocation=2;
					drogo=true;
					System.out.println("You have entered Vaas Dothrak. You have won over the Dothraki horde and Danaerys has become Khaleesi. You have picked up Drogo.");
				}

			}

			else if(map==3) {

				System.out.println("AHHHH you tried to cross the Narrow Sea without a boat and drowned!!");
				end= true;


			}
		}
		else if (currentlocation==2) //Vaas Dothrak
		{
			if(map==1) {
				System.out.println("There is nothing to the North. You are still in Vaas Dothrak.");
			}
			else if(map==2) {
				System.out.println("You are in Slaver's Bay. You've gotten the help of Tyrion Lannister. He drinks, he knows things, and he's a Lannister so he's paid you double whatever anyone else offers. You put his gold with your items.");
				gold = true;
				currentlocation= 4;
			}
			else if(map==3) {
				System.out.println("You're back in Pentos. There's nothing for you here.");
				currentlocation= 0;
			}
			else if (map == 4){
				System.out.println("There is nothing to the West but a wasteland. You have been sent back to Vaas Dothrak.");
				currentlocation= 2;
			}
		}
		else if (currentlocation==3) //Mereen
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

				System.out.println("You are in Slaver's Bay. You've gotten the help of Tyrion Lannister. He drinks and he knows things.");
				tyrion=true;
				currentlocation= 4;
			}

			else if(map==3) {

				System.out.println("You've arrived in Qohor. Khaleesi's dragon's have hatched and can breath fire. Dracarys!!");
				dragon1=true;
				currentlocation = 5;
			}
		}
		else if (currentlocation==5) { //Qohor
			if (map==1) {
				if(boat==true) {
					System.out.println("You are sailing across the Narrow Sea to Dragon Stone!");
					dragonStoneBanner= true;
					currentlocation= 12;
				}
				else {
				System.out.println("AHHH you tried to cross the Narrow Sea without a boat and drowned!!");
				end=true;
			}}
			else if(map==2){
				if (gold==true) {
					System.out.println("You have arrived in Astapor.");
					boat=true;
					currentlocation=6;
					
				}else { System.out.println("You tried to enter the city of Astapor without paying the tax. You must get a gold loan from the Iron Bank first. You have been sent back to Qohor.");
				currentlocation= 5;
				}
			}
			else if(map==4){
				System.out.println("You are back in Meereen. You have gotten gold and you have the loyalty of the Unsullied Army.");
				gold= true;
				army= true;
				currentlocation=3;
			}
			else if(map==3){
				System.out.println("AHHH you tried to cross the Narrow Sea without a boat and drowned!!");
				end=true;
			}
		}
		else if (currentlocation==6) { //Astapor
			if (map==1) {
				System.out.println("You are back in Qohor.Your dragons hatched in Qohor.");
				boat= true;
				dragon1= true;
				currentlocation= 5;
			}
			else if(map==2){
				System.out.println("There is nothing to see.");
			}
			else if(map==4){
				System.out.println("AHHH you tried to cross the Narrow Sea without a boat and drowned!!");
				end=true;
			}
			else if(map==3){
				System.out.println("AHHH you tried to cross the Narrow Sea without a boat and drowned!!");
				end=true;
			}
		}
			
		else if (currentlocation==7) //Winterfell
		{
			if(map==1) {
				if (gold== true) {
				System.out.println("You've arrived at the Iron Islands and must pay the Iron price....Since you have gold to give, the Greyjoys welcome you and give you their loyalty.");
				currentlocation= 13;
				greyjoyBanner= true;

			}else {
				System.out.println("You've arrived at the Iron Islands and must pay the Iron price...You don't have the gold and are chased backed to Winterell");
				currentlocation= 7;
				}
			}
			else if(map==2) {
				System.out.println("Welcome to Casterly Rock");
				if(gold== true) {
					System.out.println("You have paid your debt to the Lanisters and gained their loyalty!");
					currentlocation= 11;
					lanisterBanner= true;
					
				}else {System.out.println("Without an offering of food, the Lanisters will not welcome you to Casterly Rock. You have been sent back to Winterfell.");
					currentlocation= 7;
				}
			}

			else if(map==4) {
				System.out.println("You are entering Dragon Stone!");
				if(dragon1==true) {
					dragonStoneBanner=true;
					System.out.println("You've returned to Khaleesi's' birthplace and because you brought the dragons, you are free to take the town. You've gotten the Dragon Stone Banner!");
					currentlocation=12;
				}else {System.out.println("Without dragons, you are not welcome here. You are sent back to Winterfell!");
				currentlocation= 7;
				}

			}

			else if(map==3) {

				System.out.println("There is nothing to the West. Choose again.");


			}
		}	
		else if (currentlocation==12) { //Dragonstone
		if(map==1) {
			
			System.out.println("Ahhh! You tried to go back across the Narrow Sea and drowned!");
			end= true;

		}
		else if(map==2) {
			System.out.println("Ahhh! You tried to go back across the Narrow Sea and drowned!");
			end= true;
				
			}
		

		else if(map==4) {
			System.out.println("Ahhh! You tried to go back across the Narrow Sea and drowned!");
			end= true;

		}

		else if(map==3) {

			System.out.println("Welcome to Winterfell!");
			if(drogo==true) {
				System.out.println("The people of Winterfell are impressed by your army and have given you loyalty. You got the Winterfell banner!");
				winterfellBanner=true;
				currentlocation= 7;
			}else {System.out.println("The people of Winterfell do not trust you. You must first win over the Dothraki and bring Drogo with you. You have been sent back to Dragon Stone!");
				currentlocation= 12;
			}


		}
	}
		else if (currentlocation==4) { //Slaver's Bay
			if(map==1) {
				
				System.out.println("You have entered Vaas Dothrak. You have won over the Dothraki horde and Danaerys has become Khaleesi. You have picked up Drogo.");
				drogo=true;
				currentlocation=2;

			}
			else if(map==2) {
				System.out.println("Ahhh! You tried to go across the Narrow Sea and drowned!");
				end= true;
					
				}
			

			else if(map==4) {
				System.out.println("There is nothing to the East. You are still in Slaver's Bay.");
				

			}

			else if(map==3) {
				System.out.println("Welcome to Mereen! Khaleesi has freed the slaves and gain the loyalty of the Unsullied Army.");
				army = true;
				gold = true;
				currentlocation=3;	

			}
			
	}
		else if (currentlocation==11) { //Casterly Rock
			if(map==1) {
				if(drogo==true) {
					System.out.println("The people of Winterfell are impressed by your army and have given you loyalty. You got the Winterfell banner!");
					winterfellBanner=true;
					currentlocation= 7;
				}else {System.out.println("The people of Winterfell do not trust you. You must first win over the Dothraki and bring Drogo with you. You have been sent back to Casterly Rock!");
					currentlocation= 11;
				}
			}
			else if(map==2) {
				if(drogo==true && gold==true && dragon1==true && army== true && winterfellBanner==true && lanisterBanner==true && greyjoyBanner==true && dragonStoneBanner== true) {
				System.out.println("Congratulations! You have gained the loyalty of the realm and reclaimed Khaleesi's right to the throne! She rules in peace with you as her hand.");
				end= true;
					
				}else {
					System.out.println("You do not have all the items necessary to reclaim the throne. Please come back when you're prepared to rule. You've been sent back to Casterly Rock.");
					currentlocation=11;
				}
			}

			else if(map==4) {
				if(boat==true) {
				System.out.println("You are sailing back across the Narrow Sea. You are in Qohor.");
				currentlocation=5;
			}else{System.out.println("Ahhh! You tried to go across the Narrow Sea and drowned!");
			end= true;
			}}
			else if(map==3) {
				System.out.println("There is nothing to the West. You remain in Casterly Rock.");
					currentlocation = 11;

			}
			
	}	
		else if (currentlocation==13) { //Iron Islands
			if(map==1) {
				System.out.println("The Wall blocks you from going further north! You remain in the Iron Islands.");
				currentlocation=13;
			}
			else if(map==2) {
				if(drogo==true) {
					System.out.println("The people of Winterfell are impressed by your army and have given you loyalty. You got the Winterfell banner!");
					winterfellBanner=true;
					currentlocation= 7;
				}else {System.out.println("The people of Winterfell do not trust you. You must first win over the Dothraki and bring Drogo with you. You have been sent back to the Iron Islands!");
					currentlocation= 13;
				}
			}

			else if(map==4) {
				if(boat==true) {
				System.out.println("You are sailing back across the Narrow Sea. You are in Pentos.");
				currentlocation=0;
			}else{System.out.println("Ahhh! You tried to go across the Narrow Sea and drowned!");
			end= true;
			}}
			else if(map==3) {
				System.out.println("There is nothing to the West. You remain in the Iron Islands.");
					currentlocation = 13;

			}
			
	}	
	}}
