package codes;

import java.util.Random;

public class MainDrive {

	public static void main(String[] args) {

//		컴퓨터가 세자리 숫자 출제
//		int 세 칸짜리 배열로
		
		int[] cpuNumbers = new int[3];
		
		for(int i=0; i<cpuNumbers.length; i++) {
			
			while (true) {
				
				Random myRandom = new Random();
				int randomNum = myRandom.nextInt(9)+1; //0 ~ 10직전까지 나옴(9까지)
				
				boolean isDuplOk = true;
				
				for(int num: cpuNumbers) {
					if(num == randomNum) {
						isDuplOk = false;
						break;
					}
				}
				
				if(isDuplOk) {
					cpuNumbers[i] = randomNum;
					break;
				}
			}
		}
		
		
//		문제 확인용 for문
		for(int num: cpuNumbers) {
			System.out.println(num);
		}
		
		
	}
}
