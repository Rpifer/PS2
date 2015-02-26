package MainPackage;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return (this.value % 2 == 0);
	}

	public boolean isOdd() {
		return (this.value % 2 == 1);
	}

	public boolean isPrime() {
		double max = Math.sqrt(this.value);
		for (int factor = 2; factor <= max; factor++) {
			if ((this.value % factor) == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	public static boolean isOdd(int value) {
		return (value % 2 == 1);
	}

	public static boolean isPrime(int value) {
		double max = Math.sqrt(value);
		for (int factor = 2; factor <= max; factor++) {
			if ((value % factor) == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger value) {
		return (value.getValue() % 2 == 0);
	}

	public static boolean isOdd(MyInteger value) {
		return (value.getValue() % 2 == 1);
	}

	public static boolean isPrime(MyInteger value) {
		double max = Math.sqrt(value.getValue());
		for (int factor = 2; factor <= max; factor++) {
			if ((value.getValue() % factor) == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int number) {
		return (this.value == number);
	}

	public boolean equals(MyInteger number) {
		return (this.value == number.getValue());
	}
	
	public static int parseChar(char[] array){
		int integer = Integer.parseInt(new String(array));
		return integer;
	}
	public static int parseInt(String string){
		int integer = Integer.parseInt(string);
		return integer;
	}
}
