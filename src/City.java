public class City {

	private int x;
	private int y;
	public boolean visited;
	public double distance;
	public City(int x, int y) {
		this.x = x;
		this.y = y;
		this.visited = false;
		this.distance = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
