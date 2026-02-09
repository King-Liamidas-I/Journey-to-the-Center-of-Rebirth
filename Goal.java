public class Goal {
	private int x;
	private int y;
	
	public Goal(Map map) {
		int rand = (int) (Math.random() * 4 + 1);
		if (rand == 1) {
			x = 0;
			y = 0;
		} else if (rand == 2) {
			x = map.getWidth();
			y = 0;
		} else if (rand == 3) {
			x = 0;
			y = map.getHeight();
		} else if (rand == 4){
			x = map.getWidth();
			y = map.getHeight();
		} else {
			x = 2;
			y = 2;
		}
	}

	public Goal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getSym() {
		return " G";
	}
}