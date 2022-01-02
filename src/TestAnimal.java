import java.util.*;
public class TestAnimal {
	public static void main(String[] args) {
		Animal animal;
		String name = getAnimalName();
		int animalChoice = getUserChoice();
		if(animalChoice == 1) {
			animal = new Cat("Tommy");
		} else {
			animal = new Dog("Heidy");
		}
		int animalPortion = getAnimalPortion();
		animal.eat(animalPortion);
	}
	
	private static String getAnimalName() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int getAnimalPortion() {
		Scanner scan = new Scanner(System.in);
		System.out.print("먹이를 얼마나 줄까요? : ");
		return scan.nextInt();
	}
	private static int getUserChoice() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 동물을 입력하세요 1. 고양이 토미, 2. 강아지 하이디 : ");
		return scan.nextInt();
	}
}
