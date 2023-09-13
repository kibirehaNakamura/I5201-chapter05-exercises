import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GradeJudge01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String grade = "";
		
		System.out.print("点数を入力>");
		int marks = Integer.parseInt(br.readLine());
		
		if(marks < 50) {
			grade = "D";
		} else if(marks < 70) {
			grade = "C";
		} else if(marks < 90) {
			grade = "B";
		} else {
			grade = "A";
		}
		System.out.println("評価は " + grade + " です");
		/* 1. marks = 70 → B評価
		 * 2. marks = 90 → A評価
		 * 3. marks = 50 → C評価
		 * 4. marks = 49 → D評価
		 * 5. marks = 69 → C評価
		 * 6. marks = 89 → B評価
		 */
	}
}