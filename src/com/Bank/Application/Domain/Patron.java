package com.Bank.Application.Domain;

public class Patron {
private int patronId;
private String patronName;
private byte[] image;
public Patron(int patronId, String patronName, byte[] image) {
	this.patronId = patronId;
	this.patronName = patronName;
	this.image = image;
}//patron
public int getPatronId() {
	return patronId;
}
public void setPatronId(int patronId) {
	this.patronId = patronId;
}
public String getPatronName() {
	return patronName;
}
public void setPatronName(String patronName) {
	this.patronName = patronName;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}

}//class Patron
