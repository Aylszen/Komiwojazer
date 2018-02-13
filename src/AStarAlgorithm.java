import java.util.ArrayList;
import java.util.List;

public class AStarAlgorithm {
	double cost;
	double heuristic;
	double totalCost;
	final int BIG_NUMBER = 99999999;
	double distanceToStartingPoint;

	public AStarAlgorithm(int numberOfCities) {
		this.cost = 0;
		this.distanceToStartingPoint = 0;
	}

	public void execute(ArrayList<City> cityList, int cityNumber, int startingPoint) {
		double tempCost = BIG_NUMBER;
		int at = 0;
		cityList.get(cityNumber).visited = true;
		System.out.println("A STAR DISTANCES:");
		for (City city : cityList) {
			if (!city.visited && cityList.size() == 2) {
				distanceToStartingPoint = CompleteGraph.calculateDistance(cityList.get(startingPoint), city);
			}
			if (!city.visited) {
				city.distance = CompleteGraph.calculateDistance(cityList.get(cityNumber), city);
				System.out.println(cityList.size());
				System.out.println(CompleteGraph.calculateDistance(cityList.get(cityNumber), city));
			} else {
				city.distance = 0;
			}
		}
		cityList.remove(cityNumber);
		for (int i = 0; i < cityList.size(); i++) {
			if (!cityList.get(i).visited && cityList.size() >= 1 && tempCost > cityList.get(i).distance) {
				tempCost = cityList.get(i).distance;
				at = i;
			}
		}

		if (!cityList.isEmpty()) {
			System.out.println("A STAR TOTAL COST:");
			System.out.println(cost = cost + tempCost + distanceToStartingPoint);
			System.out.println("********");
			execute(cityList, at, startingPoint);
		}
	}
}