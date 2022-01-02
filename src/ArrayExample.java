import java.util.Random;

public class ArrayExample {

	private static final int RANDOM_MAX = 100;

	public static void main(String[] args) {
		int[] array = makeArray(6);
		printArray(array);
	}

	private static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static int[] makeArray(int size) {
		int[] array = new int[size];
		Random ran = new Random();
		for(int i =0; i < array.length; i++) {
			array[i] = ran.nextInt(RANDOM_MAX);
		}
		return array;
	}

}
