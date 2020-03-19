package lab;

import java.util.ArrayList;
import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		System.out.println("Arrays with duplicates are: " +Arrays.toString(args));
		removeDulpicated(args);
	}

	private static void removeDulpicated(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<args.length;i++) {
			if(!list.contains(args[i])) {
				list.add(args[i]);
			}
			
	}
		
		System.out.println("Value are: "+ list);
	}
}
