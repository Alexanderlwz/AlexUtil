/**
 * CopyRight (C) 1989-2989 <Alexander>
 * Copy Right Author     : Alexander_LWZ
 * Package Space         : local.util.file
 * JDK Version Used      : jdk1.7.0_45
 * Comments              : Read a binary file and output as a hex file
 * Version               : 1.0.0
 * Create Date           : 2014.2.5
 * Modification History  
 * Sr Date       Why & What is modified
 */

package local.util.file;

public class Hex {
	public static String format(byte[] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if (n % 16 == 0) {
				result.append(String.format("%05X: ", n));
			}
			result.append(String.format("%02X ", b));
			n++;
			if (n % 16 == 0) {
				result.append("\n");
			}
		}
		result.append("\n");
		return result.toString();
	}
}
