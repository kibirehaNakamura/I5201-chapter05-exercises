import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Debug {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int REGULAR_PRICE = 2000;
		final String FEMALE = "F";
		
		System.out.print("年齢>");
		int age = Integer.parseInt(br.readLine());
		System.out.println("男性はM、女性はFを入力してください");
		System.out.print("性別>");
		String gender = br.readLine();
		
		int price = REGULAR_PRICE;
		// age < 18とgender.equals(FEMALE)の両方に該当する場合にpriceが1/4になっていたので修正する
		if((age < 18) || gender.equals(FEMALE)) {
			price /= 2;
		}
		System.out.println("入場料は" + price + "円です");
	}
}