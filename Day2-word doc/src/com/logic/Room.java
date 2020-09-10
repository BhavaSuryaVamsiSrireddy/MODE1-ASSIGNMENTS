package com.logic;

public class Room {

	private int roomno;
	private String roomType;
	private int roomArea;
	private String acMachine;
	
	public void setData(int roomno,String roomType,int roomArea,String acMachine) {
		this.roomno = roomno;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}
	
	public void displayData() {
		System.out.println("room no = "+roomno);
		System.out.println("room type = "+roomType);
		System.out.println("room area = "+roomArea);
		System.out.println("ac machine = "+acMachine);
	}
}
