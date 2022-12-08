package pojo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RoutesInLine {
	
	public String lineId;
	Map<String, Set<String>> routesInLine = new HashMap<>();
	
	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}
	
	public Map<String, Set<String>> getRoutesInLine() {
		return routesInLine;
	}

	public void setRoutesInLine(Map<String, Set<String>> routesInLine) {
		this.routesInLine = routesInLine;
	}

//  Remove comment to see formatted data in console when running ModelMapper.java.
//	@Override
//	public String toString(){
//		StringBuilder sb = new StringBuilder();
//		sb.append("***** Routes *****\n");
//		sb.append("\n");
//		sb.append("ID of line = "+getLineId()+"\n");
//		getRoutesInLine().keySet().forEach(routeEntry -> {
//		sb.append("ID of route = "+routeEntry+"\n");
//		sb.append("ID of Stopplaces = "+getRoutesInLine().get(routeEntry)+"\n");
//	});
//		sb.append("\n");
//		return sb.toString();
//	}
}
