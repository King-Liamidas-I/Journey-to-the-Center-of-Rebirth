public class Player {
	private int x;
	private int y;
	private int hp;
	private String sym;

	public Player() {
		x = 2;
		y = 2;
		hp = 50;
		sym = "P";
		
	}

	public void move(String message, Map map1) {
		int newX = x;
		int newY = y;
		if (message.equals("w")) {
			newX = x;
			newY = y - 1;
		} else if (message.equals("a")) {
			newX = x - 1;
			newY = y;
		} else if (message.equals("s")) {
			newX = x;
			newY = y + 1;
		} else if (message.equals("d")) {
			newX = x + 1;
			newY = y;
		}
		int width = map1.getWidth();
		int height = map1.getHeight();
		if (newX <= width && newX >= 0 && newY <= height && newY >= 0 && !map1.isObs(newX,newY)) {
			x = newX;
			y = newY;
		}
	}
	

	public Player(int x, int y, int hp, String sym) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.sym = sym;

	}

	public int getX() {
		return x;
	}

	public void setX(int newX) {
		x = newX;
	}


	public int getY() {
		return y;
	}
	
	public void setY(int newY) {
		y = newY;
	}

	public int getHP() {
		return hp;
	}

	public String getSym() {
		return sym;
	}

	public String toString() {
		String out = "";
		out += "\n__________\n";
		out += "X:  " + x + "\n";
		out += "Y:  " + y + "\n";
		out += "HP: " + hp + "\n";
		out += "Sym:" + sym + "\n";
		out += "__________\n";
		return out;
	}
}