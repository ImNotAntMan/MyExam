
public class MyWashingMachine implements WashingMachine, DryCouse {
	public void startButtonPressed() {
		System.out.println("세탁기가 빨래를 시작하였습니다.");
	}

	public void pauseButtonPressed() {
		System.out.println("세탁기가 빨래를 잠시 중지하였습니다.");
	}
	
	public void stopButtonPressed() {
		System.out.println("세탁기가 빨래를 중지하였습니다.");
	}
	
	public void dry() {
		stopButtonPressed();
		System.out.println("세탁이 완료되어 건조하기 시작하였습니다.");
	}
	
	public int changeSpeed(int speed) {
		int rtnSpeed = 0;
		switch (speed) {
		case 1:
			rtnSpeed = 20;
			break;

		case 2:
			rtnSpeed = 44;
			break;

		case 3:
			rtnSpeed = 99;
			break;
		}
		return rtnSpeed;
	}

}
