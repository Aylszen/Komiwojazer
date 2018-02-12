import java.util.List;

public class GreedyAlgorithm {
	double heuristic;

	public GreedyAlgorithm(int numberOfCities) {
		this.heuristic = 0;
	}

	public void execute(List<City> cityArray, int cityNumber) {
		double tempHeuristic = 99999999;
		int at = 0;
		cityArray.get(cityNumber).visited = true;
		System.out.println("DISTANCES:");
		for (City city : cityArray) {
			if (!city.visited) {
				city.distance = CompleteGraph.calculateDistance(cityArray.get(cityNumber), city);
				System.out.println(CompleteGraph.calculateDistance(cityArray.get(cityNumber), city));
			} else {
				city.distance = 0;
			}
		}
		cityArray.remove(cityNumber);
		for (int i = 0; i < cityArray.size(); i++) {
			if (!cityArray.get(i).visited && cityArray.size() >= 1 && tempHeuristic > cityArray.get(i).distance) {
				tempHeuristic = cityArray.get(i).distance;
				at = i;
			}
		}

		if (!cityArray.isEmpty()) {
			System.out.println("HEURISTIC:");
			System.out.println(heuristic += tempHeuristic);
			System.out.println("********");
			execute(cityArray, at);
		}

	}
}
