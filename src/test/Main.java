package test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import algoSimba.AlgoSimba;

public class Main {

	public static void main(String [] arg) throws IOException{
		
		String input = fileToPath("huim5.txt");
		String output = ".//outputhuim.txt";

//		int min_utility = 100000;  
		Double ratioUserInput = 0.00005;
		
		// Applying the HUIMiner algorithm
		AlgoSimba huiminer = new AlgoSimba();
		huiminer.runAlgorithm(input, output, ratioUserInput);
		huiminer.printStats();

	}

	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = Main.class.getResource(filename);
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
