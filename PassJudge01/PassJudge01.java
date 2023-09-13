import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PassJudge01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("点数を入力>");
		int score = Integer.parseInt(br.readLine());
		
		if(score >= 70) {
			System.out.println("合格です");
		}
	}
}