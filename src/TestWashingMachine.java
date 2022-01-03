
public class TestWashingMachine {

	public static void main(String[] args) {
		MyWashingMachine mywashing = new MyWashingMachine();
		mywashing.startButtonPressed();
		System.out.println(mywashing.changeSpeed(2) + "로 속도를 변했습니다.");
		mywashing.pauseButtonPressed();
		mywashing.dry();
	}
}
