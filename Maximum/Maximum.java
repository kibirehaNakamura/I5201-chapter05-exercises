import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Maximum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String MAX_MESSAGE = "最大値は";
		
		System.out.print("xを入力>");
		int x = Integer.parseInt(br.readLine());
		System.out.print("yを入力>");
		int y = Integer.parseInt(br.readLine());
		System.out.print("zを入力>");
		int z = Integer.parseInt(br.readLine());
		
		String max = "";
		if(x < y) {
			if(y < z){
				max = MAX_MESSAGE + z;
			} else {
				max = MAX_MESSAGE + y;
			}
		} else {
			if(x < z) {
				max = MAX_MESSAGE + z;
			} else {
				max = MAX_MESSAGE + x;
			}
		}
		System.out.println(max);
	}
}