import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Judge02 {
	public static void main(String[] args) throws IOException {
		final int USUALLY_CHARGE = 2000;
		int charge = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("年齢を入力してください>");
		int age = Integer.parseInt(br.readLine());
		
		if(age < 18) {
			charge = USUALLY_CHARGE / 2;
		} else {
			charge = USUALLY_CHARGE;
		}
		
		System.out.println(age + "歳は" + charge + "円です");
	}
}