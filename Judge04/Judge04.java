import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Judge04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("文字列1を入力してください>");
		String str1 = br.readLine();
		System.out.print("文字列2を入力してください>");
		String str2 = br.readLine();
		
		if(str1.compareTo(str2) == 0) {
			System.out.println(str1 + " と " + str2 + " は一致しました");
		} else if(str1.compareTo(str2) < 0) {
			System.out.println(str1 + " が先で " + str2 + " があとです");
		} else {
			System.out.println(str2 + " が先で " + str1 + " があとです");
		}
	}
}