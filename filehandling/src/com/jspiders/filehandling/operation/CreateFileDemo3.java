package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo3 {
	public static void main(String[]args) {
		File file=new File("D:/WEJA2/filehandling/Demo1.txt");
		if(file.exists()) {
			System.out.println("file already exists");
		}else {
			try {
				file.createNewFile();
				System.out.println("file is created");
				
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("file is not created");
			}
		}
	}
}
