package pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.JsonNode;

public class OperatorClass {
	
	public String id;
	public String name;
	public String number;
	public String url; 
	public JsonNode lines;
	
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public JsonNode getLines() {
		return lines;
	}
	public void setLines(JsonNode jsonNode) {
		this.lines = jsonNode;
	}

//  Remove comment to see formatted data in console when running Mapping.data.
//	@Override
//	public String toString(){
//		StringBuilder sb = new StringBuilder();
//		sb.append("***** Operator *****\n");
//		sb.append("ID = "+getId()+"\n");
//		sb.append("Name = "+getName()+"\n");
//		sb.append("Phone = "+getNumber()+"\n");
//		sb.append("Url = "+getUrl()+"\n");
//		sb.append("Lines = "+getLines()+"\n");
//		return sb.toString();
//	}
}