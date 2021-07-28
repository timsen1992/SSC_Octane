package my.Main;

import java.io.FileReader;


public class EightBall {
	public static void main(String args[]) throws Exception {
		char[] buffer = new char[1024];
		String filename = args[0];
		try {
			filename = "" + (Integer.parseInt(filename) % 3);
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}
		if(filename.contains("..\\")) {
			filename = filename.replace("..\\", "");
		}
		
		/*
		FileReader fr = new FileReader(filename);
		int out = fr.read(buffer);
		System.out.println(buffer);
		
		FileReader fra = new FileReader(filename);
		int outa = fra.read(buffer);
		System.out.println(buffer);
		
		FileReader frb = new FileReader(filename);
		int outb = frb.read(buffer);
		System.out.println(buffer);
		
		FileReader frc = new FileReader(filename);
		int outc = frc.read(buffer);
		System.out.println(buffer);
		
		FileReader frd = new FileReader(filename);
		int outd = frd.read(buffer);
		System.out.println(buffer);
		
		FileReader fre = new FileReader(filename);
		int oute = fre.read(buffer);
		System.out.println(buffer);
		
		FileReader frf = new FileReader(filename);
		int outf = frf.read(buffer);
		System.out.println(buffer);

		 */
	}
}
