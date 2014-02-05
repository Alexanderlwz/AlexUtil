package local.util.tuple;

public class TupleThree<A, B, C> extends TupleTwo<A, B> {
	public final C c;

	public TupleThree(A a, B b, C c) {
		super(a, b);
		this.c = c;
	}

	@Override
	public String toString() {
		return "TupleThree [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
