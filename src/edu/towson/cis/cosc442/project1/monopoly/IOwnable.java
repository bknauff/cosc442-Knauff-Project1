package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	Boolean playAction(String msg);

	void setTheOwner(Player owner);

	String toString();

	boolean isAvailable();

	void setAvailable(boolean available);

}