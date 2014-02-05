package local.util.tuple;

public class TupleFour<A, B, C, D> extends TupleThree<A, B, C> {
	public final D d;

	public TupleFour(A a, B b, C c, D d) {
		super(a, b, c);
		this.d = d;
	}

	@Override
	public String toString() {
		return "TupleFour [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
