package main;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {

		System.out.println("드라이버를 선택하세요");
		System.out.println("1 : mysql");
		System.out.println("2 : oracle");
		System.out.println("3 : postgres");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		DBDriver dbdriver = null;
		
		if (num == 1) {
			dbdriver = new MysqlDBDriver();
		} else if ( num == 2 ) {
			dbdriver = new OracleDBDriver();
		} else if ( num == 3) {
			dbdriver = new PostgressDBDriver();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
			if (dbdriver != null) {
			
				dbdriver.dbConnect()
;		}
		
	}

}

class MysqlDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("MySql DB에 연결합니다.");
	}
	
}

class OracleDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("Oracle DB에 연결합니다.");
	}
	
}

class PostgressDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("PostGress DB에 연결합니다.");
	}
	
}