import java.util.Scanner;
public class ZombieGame {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter player symbol >>> ");
		String playerSym = input.nextLine();

		Map map1;
		Player player1;
		Zombie zombie1;
		Zombie zombie2;
		Goal goal1;

		boolean done = false;
		int difficulty = 0;
		int floor = 0;
		int hp = 50;
		String upgrades = "";
		int mapL = 12;
		String mapSym = " .";
		String obsSym = " 0";
		int score = -10;

		System.out.println("\n**************************\nYou are Mr/Mrs " + playerSym + " left in a world of terror. Avoid the zombies (Z), and get to the goal (G), though sometimes your enemy, your only friends are the obstacles (0). \n****************************\n\n");
		
		while(hp > 0) {
			if (mapL > 6) {
				mapL = 12 - floor;
			}
			if (floor < 2) {
				System.out.println("\n*******************\nThese zombies are asleep. They will wake up when you reach the Goal.\n****************************\n\n");
			}
			if (floor >= 3) {
				obsSym = " 0";
			}
			if (floor >= 5 && floor < 8) {
				obsSym = " Z";
				System.out.println("\n**************************\nInside the Zombie Graveyard.\n***********************\n\n");
			}
			map1 = new Map(mapL, mapL, mapSym, obsSym);
		
			player1 = new Player(map1.getWidth() / 2, map1.getHeight() / 2, 50," " + playerSym);
			zombie1 = new Zombie((int) (Math.random() * map1.getWidth()), (int) (Math.random() * map1.getHeight())," " + "Z");
			zombie2 = new Zombie((int) (Math.random() * map1.getWidth()), (int) (Math.random() * map1.getHeight())," " + "Z");
			goal1 = new Goal(map1);
			
			while(!done) {

				map1.draw(player1, zombie1, zombie2, goal1);
				System.out.printf("""
				_____________________________________________________________
				|
				|   Floor: %d    Difficulty: %d    HP: %d    Upgrades: %s    
				|    [ Player: %s    Score: %d ]
				|____________________________________________________________
								 """, floor, difficulty, hp, upgrades, playerSym, score);
				System.out.print("Next Move >>> ");
				String message = input.nextLine();
	
				player1.move(message, map1);

				if (difficulty > 0) {
					zombie1.move(player1, map1);
					zombie2.move(player1, map1);
				}
				
				if ((player1.getX() == goal1.getX()) && (player1.getY() == goal1.getY())) {
					done = true;
					System.out.println("You fought your way through!");
					hp = hp + 2;
					score = score + 10;
					floor = floor + 1;
					difficulty = difficulty + 10;
				}
				if ((player1.getX() == zombie1.getX()) && (player1.getY() == zombie1.getY()) || player1.getX() == zombie2.getX() && player1.getY() == zombie2.getY()) {
					done = true;
					System.out.println("The zombie got you little one.");
					hp = hp - 10;
				}	
			}
	
			done = false;
		}
		System.out.printf("""
						  
			
			**********
						  
			[ Player: %s    Score: %d    Floor: %d ]

			**********

						  
						  
						  """, playerSym, score, floor);
		
	}

}