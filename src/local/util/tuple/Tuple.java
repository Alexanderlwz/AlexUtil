/**
 * CopyRight (C) 1989-2989 <Alexander>
 * Copy Right Author     : Alexander_LWZ
 * Package Space         : local.util.tuple
 * JDK Version Used      : jdk1.7.0_45
 * Comments              : Tuple library using type argument inference
 * Version               : 1.0.0
 * Create Date           : 2014.2.5
 * Modification History  
 * Sr Date       Why & What is modified
 */

package local.util.tuple;

public class Tuple {
	public static <A, B> TupleTwo<A, B> tuple(A a, B b) {
		return new TupleTwo<A, B>(a, b);
	}

	public static <A, B, C> TupleThree<A, B, C> tuple(A a, B b, C c) {
		return new TupleThree<A, B, C>(a, b, c);
	}

	public static <A, B, C, D> TupleFour<A, B, C, D> tuple(A a, B b, C c, D d) {
		return new TupleFour<A, B, C, D>(a, b, c, d);
	}

	public static <A, B, C, D, E> TupleFive<A, B, C, D, E> tuple(A a, B b, C c,
			D d, E e) {
		return new TupleFive<A, B, C, D, E>(a, b, c, d, e);
	}
}
