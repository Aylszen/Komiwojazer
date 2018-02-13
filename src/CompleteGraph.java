import java.util.ArrayList;
import java.lang.Math;

public class CompleteGraph {

	protected ArrayList<City> cityList;
	public CompleteGraph() {
		this.cityList = new ArrayList<City>();
	}

	public void addCityToGraph(City city) {
		cityList.add(city);
	}

	public static double calculateDistance(City first, City second) {
		return Math.sqrt(Math.pow((double) (second.getX() - first.getX()), 2)
				+ Math.pow((double) (second.getY() - first.getY()), 2));
	}
	
	public int getCityListSize()
	{
		return cityList.size();
	}
}
