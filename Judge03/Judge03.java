import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Judge03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String FEMALE = "female";
		
		System.out.print("性別を入力してください(男:male/女:female)>");
		String gender = br.readLine();
		
		if(gender.equals(FEMALE)) {
			System.out.println("女性です");
		} else {
			System.out.println("男性です");
		}
	}
}