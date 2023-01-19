import java.io.*;
import java.util.*;
import java.nio.charset.*;
import java.awt.*;


// distancia entre os elementos

public class Solution {
	
	static String getShortestUniqueSubstring(char[] arr, String str) {
		
		int arrSize = arr != null ? arr.length : 0;
		int strSize = str != null ? str.length() : 0;
		String resp = "";
		
		if (arrSize < 0 || arrSize > 30 || strSize <1 || strSize > 500 || arrSize > strSize)
			return "";
		
		String strt = str;
		while (strt.length() > 0) {
			for (char c : arr) {
				Integer pos = strt.indexOf(c);
				strt = strt.substring(pos-1);
			}
			//System.out.println(strt);
		}
		
		
		return resp;
	}
	
	public static void main(String[] args) {
		char[] chr = {'x','y','z'};
		String str = "xyyzyzyx";
		String resp = getShortestUniqueSubstring(chr,str);
		System.out.println(resp);
	}
}
