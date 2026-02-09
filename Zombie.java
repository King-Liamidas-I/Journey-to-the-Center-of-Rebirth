public class Zombie {
	private int x;
	private int y;
	private String sym;
	private int hp = 50;
	
	public Zombie(int x, int y, String sym) {
		this.x = x;
		this.y = y;
		this.sym = sym;
	}

	public void move(Player player1, Map map1) {
		int playerX = player1.getX();
		int playerY = player1.getY();
		int diffX = Math.abs(x - playerX);
		int diffY = Math.abs(y - playerY);
		if (diffX >= diffY && x > playerX && !map1.isObs(x-1, y)) {
			x--;
		} else if (diffX >= diffY && x < playerX && !map1.isObs(x+1, y)) {
			x++;
		} else if (diffX <= diffY && y > playerY && !map1.isObs(x, y-1)) {
			y--;
		} else if (diffX <= diffY && y < playerY && !map1.isObs(x, y+1)) {
			y++;
		}
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

	public int getHp() {
		return hp;
	}

	public String getSym() {
		return sym;
	}
	
}