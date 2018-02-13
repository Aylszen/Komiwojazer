
public class TravellingSalesmanProblem {

	public static void main(String[] args) {
		CompleteGraph completeGraph = new CompleteGraph();
		completeGraph.addCityToGraph(new City(6, 4));
		completeGraph.addCityToGraph(new City(6, -4));
		completeGraph.addCityToGraph(new City(2, 1));
		completeGraph.addCityToGraph(new City(7, -2));
		completeGraph.addCityToGraph(new City(30, -6));
		GreedyAlgorithm greedy = new GreedyAlgorithm(completeGraph.getCityListSize());
		AStarAlgorithm aStar = new AStarAlgorithm(completeGraph.getCityListSize());

		greedy.execute(Utilities.copyList(completeGraph.cityList), 0, 0); // przekazywanie
																			// kopii
																			// tablicy
		aStar.execute(Utilities.copyList(completeGraph.cityList), 0, 0); // przekazywanie
																			// kopii
																			// tablicy
	}

}
