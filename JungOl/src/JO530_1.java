import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JO530_1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			String inp = br.readLine();
			n = Integer.parseInt(inp); // 래퍼클래스
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (n >= 20) {
			System.out.println("adult");
		} else {
			System.out.println((20 - n) + " years later");
		}
	}

}
