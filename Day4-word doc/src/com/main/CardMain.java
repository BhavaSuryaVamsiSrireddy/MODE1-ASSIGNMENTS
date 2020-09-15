package com.main;

import java.util.Scanner;

import com.logic.MembershipCard;
import com.logic.PaybackCard;

public class CardMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select the Card\n1.Payback Card\n2.Membership Card");
		int choice;
		String[] cardDetails;
		choice = input.nextInt();
		switch(choice) {
		case 1:
			int pointsEarned;
			double totalAmount;
			System.out.println("Enter the card details ");
			cardDetails = (input.next()).split("\\|");
			System.out.println("Enter points in card ");
			pointsEarned = input.nextInt();
			System.out.println("Enter Amount ");
			totalAmount = input.nextDouble();
			PaybackCard paybackCard = new PaybackCard(cardDetails[0], cardDetails[1], cardDetails[2], pointsEarned, totalAmount);
			System.out.println(paybackCard.getHolderName()+" Payback Card Details:");
			System.out.println("Card Number "+paybackCard.getCardNumber());
			System.out.println("Points Earned "+paybackCard.getPointsEarned());
			System.out.println("Total Amount "+paybackCard.getTotalAmount());
			break;
		case 2:
			int rating;
			System.out.println("Enter the card details ");
			cardDetails = (input.next()).split("\\|");
			System.out.println("Enter rating ");
			rating = input.nextInt();
			MembershipCard membershipCard = new MembershipCard(cardDetails[0], cardDetails[1], cardDetails[2], rating);
			System.out.println(membershipCard.getHolderName()+" Payback Card Details:");
			System.out.println("Card Number "+membershipCard.getCardNumber());
			System.out.println("rating "+membershipCard.getRating());
			break;
		default:
			System.out.println("please enter a valid choice");
		}
	}

}
