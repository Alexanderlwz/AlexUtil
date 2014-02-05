package local.util.tuple;

public class TupleTwo<A, B> {
	public final A a;
	public final B b;

	public TupleTwo(A a, B b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "TupleTwo [a=" + a + ", b=" + b + "]";
	}
}
