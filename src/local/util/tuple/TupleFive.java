package local.util.tuple;

public class TupleFive<A, B, C, D, E> extends TupleFour<A, B, C, D> {
	public final E e;

	public TupleFive(A a, B b, C c, D d, E e) {
		super(a, b, c, d);
		this.e = e;
	}

	@Override
	public String toString() {
		return "TupleFive [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d
				+ ", e=" + e + "]";
	}

}
