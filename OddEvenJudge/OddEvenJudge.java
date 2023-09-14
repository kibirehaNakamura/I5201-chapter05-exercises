import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddEvenJudge {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("終了は[Enter}だけを入力");
		System.out.print("整数入力>");
		
		String buf;
		while(!(buf = br.readLine()).equals("")) {
			int num = Integer.parseInt(buf);
			
			if((num % 2) == 0) {
				System.out.println(num + " は偶数です");
			} else {
				System.out.println(num + " は奇数です");
			}
			
			System.out.print("整数入力>");
		}
	}
}