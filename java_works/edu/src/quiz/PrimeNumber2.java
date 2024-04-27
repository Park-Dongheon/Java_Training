package quiz;
/*	정수의 자릿수를 입력 받아서 해당 자릿수에 속하는 소수를 찾아서 출력하는 프로그램을 작성해 보세요.
	int num = 3;
	int s = (int)Math.pow(10.0, (double)(num-1));
	int e = (int)Math.pow(10.0, (double)(num))-1;
 *실행 예
 	입력 자릿수가 3이라면 3자릿수 정수 (100 ~ 999) 중에서 소수에 해당하는 숫자를 찾아서출력한다.
 */

import java.util.Scanner;

public class PrimeNumber2 {

	
	
	public void getPrimeNumber2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {											// 무한 루프, 입력 값이 0이 아니라면 반복하라
			System.out.print("Number[0:exit] 자릿수 입력: ");
			int num = sc.nextInt();
			if(num == 0) break;
			
			
			int s = (int)Math.pow(10.0, (double)(num-1));		// 입력자리 - 1의 제곱으로 입력값과 같은 자릿수 표현, 입력 자릿수의 시작 값 
			int e = (int)Math.pow(10.0, (double)(num)) - 1;		// 입력자리의 제곱 - 1로 입력값과 같은 자릿수 표현, 입력 자릿수의 끝 값
			
			// 소숫값
			for(int i = s; i < e; i++) {						// 입력 자릿수의 시작 값 ~ 끝 값까지 1씩 증가하며 조건문 검사 반복
				if(isPrime(i)) {								// 값 i가 isPrime(i)의 인자값으로 isPrime() 메소드 호출, true일 경우 출력
					System.out.println(i + "는 소수 입니다.");
				}
			}
		}
		sc.close();
		System.out.println("Done!");							// 무한 루프(while 문)가 0의 입력값으로 빠져나온 후 완료 출력
	}
	
	//	num이 소수면 true, 그렇지 않으면 false를 리턴
    public static boolean isPrime(int num) {					// 인자값을 받아 매개변수 num에 저장 num이 소수값인지 판단하는 메소드
        if (num <= 1) return false;								// 1 미만의 수는 소수가 아님
        
        for (int i = 2; i <= Math.sqrt(num); i++) {				// 2부터 num제곱근 까지의 수 중 num을 나누어 떨어지는 수가 있는지 확인
            if (num % i == 0) return false;						// 나누어 떨어지는 수가 있으면 소수가 아님
        }
        
        return true;											// 조건을 만족하지않는 그 외 num값은 소수임
    }

	public void work(boolean flag) {							// work()메소드가 호출 될 경우, boolean 타입의 인자값을 받아 매개변수 flag에 저장
		// TODO Auto-generated method stub
		if(flag) getPrimeNumber2();								// flag값이 true일 경우 getPrimeNumber2()메소드 호출					
	}

}
