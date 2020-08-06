package com.jspiders.practice.file;

import java.io.File;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\jspiders\\J2ee Software\\Softwares\\MyFolder/MyProp.properties");
		boolean bool= file.createNewFile();
		System.out.println(bool);
	}

}
