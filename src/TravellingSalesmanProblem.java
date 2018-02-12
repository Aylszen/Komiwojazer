
public class TravellingSalesmanProblem {

	public static void main(String[] args) {
		CompleteGraph completeGraph = new CompleteGraph();
		completeGraph.addCityToGraph(new City(6, 4));
		completeGraph.addCityToGraph(new City(6, -4));
		completeGraph.addCityToGraph(new City(2, 1));
		completeGraph.addCityToGraph(new City(7, -2));
		completeGraph.addCityToGraph(new City(30, -6));
		GreedyAlgorithm greedy = new GreedyAlgorithm(completeGraph.getCityListSize());
		greedy.execute(completeGraph.cityArray, 0);
	}

}
