package com.main;

import java.util.Scanner;

import com.logic.Room;

public class RoomMain {

	public static void main(String[] args) {
		
		Room room = new Room();
		Scanner input = new Scanner(System.in);
		int roomno;
		String roomType;
		int roomArea;
		String acMachine;
		
		System.out.println("enter room number ");
		roomno = input.nextInt();
		System.out.println("enter room type ");
		roomType = input.next();
		System.out.println("enter room area ");
		roomArea = input.nextInt();
		System.out.println("enter ac machine ");
		acMachine = input.next();
		room.setData(roomno, roomType, roomArea, acMachine);
		room.displayData();
		
	}

}
