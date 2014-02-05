package testPackage;

import local.util.tuple.TupleFive;
import local.util.tuple.TupleFour;
import local.util.tuple.TupleThree;
import local.util.tuple.TupleTwo;
import static local.util.tuple.Tuple.*;

public class TestTuple {
	static TupleTwo<String, Integer> f() {
		return tuple("hi", 47);
	}

	static TupleThree<Amphibian, String, Integer> g() {
		return tuple(new Amphibian(), "hi", 47);
	}

	static TupleFour<Vehicle, Amphibian, String, Integer> h() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47);
	}

	static TupleFive<Vehicle, Amphibian, String, Integer, Double> k() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.11);
	}

	public static void main(String[] args) {
		System.out.println(f());
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
	}
}

class Amphibian {
}

class Vehicle {
}