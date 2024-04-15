package main;

public interface Calc {

	int ERROR = -9999; // 계산 오류 시 사용할 에러코드
	
	int add(int num1, int num2);
	
	int substract(int num1, int num2);
	
	int times(int num1, int num2);
	
	int divide(int num1, int num2);
}
