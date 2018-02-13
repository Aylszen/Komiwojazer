import java.util.ArrayList;

public class Utilities {
	public static City deepCopy(City input) {
		City copy = new City(input.getX(), input.getY());
		return copy;
	}

	public static ArrayList<City> copyList(ArrayList<City> input) {
		ArrayList<City> tempList = new ArrayList<City>();
		for (City t : input) {
			City copy = deepCopy(t);
			tempList.add(copy);
		}
		return tempList;
	}
}
