package com.jspiders.practice.file;

import java.io.File;

public class MyFolder {

	public static void main(String[] args) {
		
		File file = new File("C:\\jspiders\\J2ee Software\\Softwares/MyFolder");
		boolean bool = file.mkdir();
		System.out.println(bool);
	}

}
