import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Evaluation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("終了は[Enter]だけを入力");
		System.out.print("点数入力>");
		
		String buf;
		while(!(buf = br.readLine()).equals("")) {
			int score = Integer.parseInt(buf);
			String message = "評価";
			
			// 条件式がORだとあらゆる値がtrueになるのでANDに修正
			if(0 <= score && score <= 100) {
				if(score < 40) {
					message += "C";
				} else if(score < 70) {
					message += "B";
				} else {
					message += "A";
				}
			} else {
				message = "範囲外の値ERROR:0から100までの値を入力してください";
			}
			System.out.println(message);
			System.out.print("点数入力>");
		}
	}
}