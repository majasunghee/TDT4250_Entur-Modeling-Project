package pojo;

import transportModel.TransportModeType;

public class LinesClass<TransportMode> {

	public String id;
	public String name;
	public TransportModeType transportMode;
	public Boolean bikesAllowed; 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TransportModeType getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(TransportModeType transportMode) {
		this.transportMode = transportMode;
	}

	public Boolean getBikesAllowed() {
		return bikesAllowed;
	}

	public void setBikesAllowed(Boolean bikesAllowed) {
		this.bikesAllowed = bikesAllowed;
	}
	

//  Remove comment to see formatted data in console when running ModelMapper.java.
//	@Override
//	public String toString(){
//		StringBuilder sb = new StringBuilder();
//		sb.append("***** Line *****\n");
//		sb.append("ID = "+getId()+"\n");
//		sb.append("Name = "+getName()+"\n");
//		sb.append("Transportmode = "+getTransportMode()+"\n");
//		sb.append("Bikes allowed = "+getBikesAllowed()+"\n");
//		return sb.toString();
//	}

}
