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
		FileReader fr = new FileReader(filename);
		int out = fr.read(buffer);
		fr.close();
		System.out.println(out);
		System.out.println(out); //douple code
	}
}
