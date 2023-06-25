package Fenyuk_2;

public class Methods {
	
	public static int a;
	public static int b;
	
	public Methods(int a1, int b1) {
		super();
	    a = a1;
		b = b1;
	}

	static void check() throws MyException {
		if ((a < 0) && (b < 0)) {
			throw new IllegalArgumentException();
		}
		if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
			throw new ArithmeticException();
		}
		if ((a == 0) && (b == 0)) {
			throw new IllegalArgumentException();
		}
		if ((a > 0) && (b > 0)) {
			throw new MyException("This is just a non-working calculator!");
		}
	}
	
	public int plus() throws MyException {
		Methods.check();
		return a + b;
	}

	public int minus() throws MyException {
		Methods.check();
		return a - b;
	}

	public double multiply() throws MyException {
		Methods.check();
		return a * b;
	}
	
	public double devide() throws MyException {
		Methods.check();
		return a / b;
	}

	static void viewCalcResult(double result) {
		System.out.println("Результат операції рівний " + result);
	}

}
