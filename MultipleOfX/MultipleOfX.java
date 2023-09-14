import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultipleOfX {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("終了は[Enter}だけを入力");
		System.out.print("整数入力>");
		
		String buf;
		while(!(buf = br.readLine()).equals("")) {
			int num = Integer.parseInt(buf);
			int x = 3;
			
			if((num % x) == 0) {
				System.out.println(num + " は" + x + "の倍数です");
			} else {
				System.out.println(num + " は" + x + "の倍数ではありません");
			}
			
			System.out.print("整数入力>");
		}
	}
}