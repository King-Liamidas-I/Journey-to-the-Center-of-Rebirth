public class Map {
	private int height;
	private int width;
	private String mapSym;
	private String obsSym;
	private int obs1X;
	private int obs1Y;
	private int obs2X;
	private int obs2Y;
	private int obs3X;
	private int obs3Y;
	private int obs4X;
	private int obs4Y;

	public Map(int height, int width, String mapSym, String obsSym) {
		this.height = height;
		this.width = width;
		this.mapSym = mapSym;
		this.obsSym = obsSym;


		obs1X = (int) (Math.random() * width);
		obs1Y = (int) (Math.random() * height);

		obs2X = (int) (Math.random() * width);
		obs2Y = (int) (Math.random() * height);

		obs3X = (int) (Math.random() * width);
		obs3Y = (int) (Math.random() * height);

		obs4X = (int) (Math.random() * width);
		obs4Y = (int) (Math.random() * height);
	}

	public boolean isObs(int x, int y) {
		
		
		if (x == obs1X && y == obs1Y) {
			return true;
		} else if (x == obs1X + 1 && y == obs1Y) {
			return true;
		} else if (x == obs1X && y == obs1Y + 1) {
			return true;
		} else if (x == obs2X && y == obs2Y) {
			return true;
		} else if (x == obs3X && y == obs3Y) {
			return true;
		} else if (x == obs3X - 1 && y == obs3Y) {
			return true;
		} else if (x == obs4X && y == obs4Y) {
			return true;
		}
		return false;
	}

	public void draw(Player player1, Zombie zombie1, Zombie zombie2, Goal goal1) {
		int playerX = player1.getX();
		int playerY = player1.getY();
		String playerSym = player1.getSym();
		int zombie1X = zombie1.getX();
		int zombie1Y = zombie1.getY();
		String zombie1Sym = zombie1.getSym();
		int zombie2X = zombie2.getX();
		int zombie2Y = zombie2.getY();
		String zombie2Sym = zombie2.getSym();
		int goalX = goal1.getX();
		int goalY = goal1.getY();
		String goalSym = goal1.getSym();
		
		int a = 0;
		int b = 0;
		while (b <= height) {
			while (a <= width) {
				if ((a == goalX) && (b == goalY)) {
					System.out.print(goalSym);
				}
				else if ((a == zombie1X) && (b == zombie1Y)) {
					System.out.print(zombie1Sym);
				} else if ((a == zombie2X) && (b == zombie2Y)) {
					System.out.print(zombie2Sym);
				} else if ((a == playerX) && (b == playerY)) {
					System.out.print(playerSym);
				} else if (a == obs1X && b == obs1Y) {
					System.out.print(obsSym);
				} else if (a == obs1X + 1 && b == obs1Y) {
					System.out.print(obsSym);
				} else if (a == obs1X && b == obs1Y + 1) {
					System.out.print(obsSym);
				} else if (a == obs2X && b == obs2Y) {
					System.out.print(obsSym);
				} else if (a == obs3X && b == obs3Y) {
					System.out.print(obsSym);
				} else if (a == obs3X - 1 && b == obs3Y) {
					System.out.print(obsSym);
				} else if (a == obs4X && b == obs4Y) {
					System.out.print(obsSym);
				} else {
					System.out.print(mapSym);
				}
				a++;
			}
			System.out.println();
			a = 0;
			b++;
		}
	}

	public int getHeight() {
		return height;
	} 

	public int getWidth() {
		return width;
	} 
	
	public String getMapSym() {
		return mapSym;
	}

	public void setObsChar(String x) {
		obsSym = x;
	}

	public int getObs1X() {
		return obs1X;
	}
	
	public int getObs1Y() {
		return obs1Y;
	}

	public int getObs2X() {
		return obs2X;
	}

	public int getObs2Y() {
		return obs2Y;
	}

	public int getObs3X() {
		return obs3X;
	}

	public int getObs3Y() {
		return obs3Y;
	}

	public int getObs4X() {
		return obs4X;
	}

	public int getObs4Y() {
		return obs4Y;
	}
}