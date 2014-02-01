/**
 * 
 */
package local.util;

/**
 * @author AlexanderLWZ
 *
 */
public class Print {
	/**
	 * Terminates the current line by writing the line separator string. The
	 * line separator string is defined by the system property line.separator,
	 * and is not necessarily a single newline character ('\n').
	 */
	public static void print() {
		System.out.println();
	}

	/**
	 * Prints a String and then terminate the line. This method behaves as
	 * though it invokes print(String) and then println().
	 * 
	 * @param str
	 *            The String to be printed.
	 */
	public static void print(String str) {
		System.out.println(str);
	}

	/**
	 * Prints an Object and then terminate the line. This method calls at first
	 * String.valueOf(x) to get the printed object's string value, then behaves
	 * as though it invokes print(String) and then println().
	 * 
	 * @param obj
	 *            The Object to be printed.
	 */
	public static void print(Object obj) {
		System.out.println(obj);
	}

	/**
	 * Prints an object. The string produced by the
	 * java.lang.String.valueOf(Object) method is translated into bytes
	 * according to the platform's default character encoding, and these bytes
	 * are written in exactly the manner of the write(int) method.
	 * 
	 * @param obj
	 *            The Object to be printed.
	 */
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
}
