package pojo;

import java.util.ArrayList;

public class SpecificLineClass {
	
//	Since the dataset for Specific lines has two lists called journeypatterns, 
//	we differentiate between them by referring to routes, and journeypatterns for a specific route
	
	public String specificLineId;
	public String routeId;
	public String routeName;
	ArrayList<String> stopPlaces = new ArrayList<>();
	ArrayList<ArrayList<String>> journeyPatterns = new ArrayList<>();
	
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
	public ArrayList<String> getStopPlaces() {
		return stopPlaces;
	}
	public void setStopPlaces(ArrayList<String> stopPlaces) {
		this.stopPlaces = stopPlaces;
	}
	public ArrayList<ArrayList<String>> getJourneyPatterns() {
		return journeyPatterns;
	}
	public void setJourneyPatterns(ArrayList<ArrayList<String>> routes) {
		this.journeyPatterns = routes;
	}



	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("***** Route *****\n");
		sb.append("ID of line = "+getSpecificLineId()+"\n");
		sb.append("ID of route = "+getRouteId()+"\n");
		sb.append("Name of route = "+getRouteName()+"\n");
		sb.append("Stopplaces = "+getStopPlaces()+"\n");
		sb.append("Journeypatterns = "+getJourneyPatterns()+"\n");
		return sb.toString();
	}
	
}
