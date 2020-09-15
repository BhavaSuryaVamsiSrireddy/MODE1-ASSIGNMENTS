package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.exceptionprograms.CalculateRunrate;

public class CalculateRunrateMain {

	public static void main(String[] args) {
		
		BufferedReader bufferedReader = null;
		int totalRunsScored=0,totalOversFaced=0;
		CalculateRunrate calculateRunrate = new CalculateRunrate();
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter total runs scored by the player ");
			totalRunsScored = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter the number of overs faced by the player ");
			totalOversFaced = Integer.parseInt(bufferedReader.readLine());
			calculateRunrate.getRunrate(totalRunsScored,totalOversFaced);
		}
		catch(NumberFormatException|IOException e) {
			System.out.println(e);
		}
		finally {
			if(bufferedReader!=null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
