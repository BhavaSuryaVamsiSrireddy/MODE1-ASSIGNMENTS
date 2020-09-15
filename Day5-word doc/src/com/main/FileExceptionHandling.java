package com.main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("sample");
			int readingCharacters = 0;
			while((readingCharacters=fileInputStream.read())!=-1) {
				System.out.print((char)readingCharacters);
			}
		}
		catch(FileNotFoundException exception) {
			System.out.println("The file you tried to open was not found");
		}
		catch(IOException exception) {
			System.out.println("File you trying to read was not found");
		}
		finally {
			if(fileInputStream!=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
