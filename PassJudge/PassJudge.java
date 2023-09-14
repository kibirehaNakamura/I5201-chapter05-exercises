import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PassJudge {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int PASS_JUDGE = 50;
		
		System.out.println("終了は[Enter]だけを入力");
		System.out.print("点数入力>");
		String buf;
		while(!(buf = br.readLine()).equals("")) {
			int score = Integer.parseInt(buf);
			String message = "";
			
			if(score < PASS_JUDGE) {
				int lack = PASS_JUDGE - score;
				message = "あと" + lack + "点で合格です";
			} else {
				message = "合格です";
			}
			System.out.println(message);
			System.out.print("点数入力>");
		}
	}
}