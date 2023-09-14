import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrCondition {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int USUALLY_CHARGE = 2000;
		final String FEMALE = "female";
		
		System.out.print("年齢を入力>");
		int age = Integer.parseInt(br.readLine());
		System.out.print("性別を入力(male/female)>");
		String gender = br.readLine();
		
		int charge = USUALLY_CHARGE;
		if((age < 18) || gender.equals(FEMALE)) {
			charge /= 2;
		}
		
		System.out.println("入場料は" + charge + "円です");
	}
}