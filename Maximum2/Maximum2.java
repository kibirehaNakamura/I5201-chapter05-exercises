import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Maximum2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String MAX_MESSAGE = "最大値は";
		
		System.out.print("xを入力>");
		int x = Integer.parseInt(br.readLine());
		System.out.print("yを入力>");
		int y = Integer.parseInt(br.readLine());
		System.out.print("zを入力>");
		int z = Integer.parseInt(br.readLine());
		
		int maxValue = x;
		if(maxValue < y) {
			maxValue = y;
		}
		if(maxValue < z) {
			maxValue = z;
		}
		
		System.out.println(MAX_MESSAGE + maxValue);
	}
}