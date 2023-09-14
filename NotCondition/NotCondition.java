import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NotCondition {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String BLOOD_TYPE_A = "A";
		
		System.out.print("血液型を入力(A/B/O/AB)>");
		String bloodType = br.readLine();
		
		if(!bloodType.equals(BLOOD_TYPE_A)) {
			System.out.println("献血にご協力ください");
		}
	}
}