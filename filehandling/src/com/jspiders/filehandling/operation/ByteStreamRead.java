package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamRead {
	public static void main(String[]args) {
		File file=new File("Demo.txt");
		if(file.exists()) {
			try {
				FileInputStream fileInputStream= new FileInputStream(file);
				System.out.println(fileInputStream.read());
				System.out.println("Data is fetched from file");
				fileInputStream.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("file does not exist");
		}
	}
}
