import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Judge01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int USUALLY_CHARGE = 2000;
		int charge = USUALLY_CHARGE;
		
		System.out.print("年齢を入力してください>");
		int age = Integer.parseInt(br.readLine());
		
		if(age < 18) {
			charge /= 2;
		}
		
		System.out.println(age + "歳は" + charge + "円です");
	}
}