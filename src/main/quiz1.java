package main;

public class quiz1 {

	public static void main(String[] args) {
		Calc calc = new Calculator();
		
		if (calc instanceof Calculator) {
			Calculator calculator = (Calculator) calc; // 오른쪽 주소값을 왼쪽에 카피
			calculator.showInfo();
		}
	}

}
