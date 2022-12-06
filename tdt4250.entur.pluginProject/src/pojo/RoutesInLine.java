package pojo;

import java.util.ArrayList;

public class RoutesInLine {
	
//	Since the dataset for Specific lines has two lists called journeypatterns, 
//	we differentiate between them by referring to routes, and journeypatterns for a specific route
	
	public String lineId;
	public String routeId;
	public String routeName;
	ArrayList<Object> routesInLine = new ArrayList<>();
	
	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
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

	public ArrayList<Object> getRoutesInLine() {
		return routesInLine;
	}

	public void setRoutesInLine(ArrayList<Object> routesInLine) {
		this.routesInLine = routesInLine;
	}
	
	
//  Remove comment to see formatted data in console when running ModelMapper.java.
//	@Override
//	public String toString(){
//		StringBuilder sb = new StringBuilder();
//		sb.append("***** Routes *****\n");
//		sb.append("\n");
//		sb.append("ID of line = "+getLineId()+"\n");
//		getRoutesInLine().forEach(line -> {
//			sb.append("ID of route = "+((ArrayList<Object>) line).get(0)+"\n");
//			sb.append("Name of route = "+((ArrayList<Object>) line).get(1)+"\n");
//			sb.append("Stopplaces in route = "+((ArrayList<Object>) line).get(2)+"\n");
//			sb.append("Journeypatterns in route "+((ArrayList<Object>) line).get(3)+"\n");
//			sb.append("\n");
//		});
//		return sb.toString();
//	}
	
}
