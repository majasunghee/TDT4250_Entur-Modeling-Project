package pojo;

import java.util.ArrayList;

public class SpecificLineClass {
	
//	Since the dataset for Specific lines has two lists called journeypatterns, 
//	we differentiate between them by referring to routes, and journeypatterns for a specific route
	
	public String specificLineId;
	public String routeId;
	public String routeName;
	ArrayList<Object> routesInSpecificLine = new ArrayList<>();
	
	
	public String getSpecificLineId() {
		return specificLineId;
	}
	public void setSpecificLineId(String specificLineId) {
		this.specificLineId = specificLineId;
	}
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public ArrayList<Object> getRoutesInSpecificLine() {
		return routesInSpecificLine;
	}
	public void setRoutesInSpecificLine(ArrayList<Object> routesInSpecificLine) {
		this.routesInSpecificLine = routesInSpecificLine;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("***** Route *****\n");
		sb.append("ID of line = "+getSpecificLineId()+"\n");
		sb.append("ID of route = "+getRoutesInSpecificLine().get(0)+"\n");
		sb.append("Name of route = "+getRoutesInSpecificLine().get(1)+"\n");
		sb.append("Stopplaces in route = "+getRoutesInSpecificLine().get(2)+"\n");
		sb.append("Journeypatterns in route = "+getRoutesInSpecificLine().get(3)+"\n");
		sb.append("\n");
		return sb.toString();
	}
	
}
