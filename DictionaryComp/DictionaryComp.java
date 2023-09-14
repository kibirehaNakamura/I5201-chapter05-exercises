import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DictionaryComp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("文字列1>");
		String str1 = br.readLine();
		System.out.print("文字列2>");
		String str2 = br.readLine();
		
		String appear = "先に現れる文字列 : ";
		
		if(str1.compareTo(str2) < 0) {
			appear += str1;
		} else if(str1.compareTo(str2) > 0) {
			appear += str2;
		} else {
			appear = "一致 : " + str1 + " と " + str2;
		}
		
		System.out.println(appear);
	}
}