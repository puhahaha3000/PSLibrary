import java.util.ArrayList;

public class PrimeNumber {
	
	public static ArrayList<Integer> getPrimeNo(int endNum) {
		return getPrimeNo(1, endNum);
	}
	
	public static ArrayList<Integer> getPrimeNo(int startNum, int endNum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean[] isNotPrimeNum = new boolean[endNum + 1];
		
		for (int i = 2; i <= endNum; i++) {
			if (isNotPrimeNum[i]) continue;
			if (i >= startNum) result.add(i);
			for (int j = 2 * i; j <= endNum; j += i) isNotPrimeNum[j] = true;
		}
		
		return result;
    }
}
