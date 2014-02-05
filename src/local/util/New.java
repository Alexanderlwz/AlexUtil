/**
 * CopyRight (C) 1989-2989 <Alexander>
 * Copy Right Author     : Alexander_LWZ
 * Package Space         : local.util
 * JDK Version Used      : jdk1.7.0_45
 * Comments              : Utilities to simplify creation by using type argument inference.
 * Version               : 1.0.0
 * Create Date           : 2014.1.10
 * Modification History  
 * Sr Date       Why & What is modified
 */

package local.util;

import java.util.*;

public class New {
	public static <K, V> Map<K, V> map() {
		return new HashMap<K, V>();
	}

	public static <T> List<T> list() {
		return new ArrayList<T>();
	}

	public static <T> LinkedList<T> lList() {
		return new LinkedList<T>();
	}

	public static <T> Set<T> set() {
		return new HashSet<T>();
	}

	public static <T> Queue<T> queue() {
		return new LinkedList<T>();
	}
}
