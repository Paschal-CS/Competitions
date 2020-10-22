import java.util.*;
import java.io.*;

public class prob02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int orig = in.nextInt();
			if(orig==0){
				return;
			}
			int ans = 10000/orig;
			// This is a comment
			System.out.println(orig+" gallons per week will last " + ans+ " weeks");
		}
	}
}
