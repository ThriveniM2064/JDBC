package com.xworkz.politicianparty.dto;

public class PoliticalPartyDTO {
private int id;
private String name;
private String presidentName;
private String nationalParty;
private int noOfMps;
public PoliticalPartyDTO(){
	System.out.println("default Constructor");
}
public PoliticalPartyDTO(int id, String name, String presidentName, String nationalParty, int noOfMps) {
	super();
	this.id = id;
	this.name = name;
	this.presidentName = presidentName;
	this.nationalParty = nationalParty;
	this.noOfMps = noOfMps;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPresidentName() {
	return presidentName;
}
public void setPresidentName(String presidentName) {
	this.presidentName = presidentName;
}
public String getNationalParty() {
	return nationalParty;
}
public void setNationalParty(String nationalParty) {
	this.nationalParty = nationalParty;
}
public int getNoOfMps() {
	return noOfMps;
}
public void setNoOfMps(int noOfMps) {
	this.noOfMps = noOfMps;
}

}
