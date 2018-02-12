import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class CompleteGraph {

	protected List<City> cityArray;
	public CompleteGraph() {
		this.cityArray = new ArrayList<City>();
	}

	public void addCityToGraph(City city) {
		cityArray.add(city);
	}

	public static double calculateDistance(City first, City second) {
		return Math.sqrt(Math.pow((double) (second.getX() - first.getX()), 2)
				+ Math.pow((double) (second.getY() - first.getY()), 2));
	}
	
	public int getCityListSize()
	{
		return cityArray.size();
	}
}
