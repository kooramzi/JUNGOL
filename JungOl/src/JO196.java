import java.util.Scanner;

public class JO196 {
	private String name;
	private String tel;
	private String addr;

	public JO196(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JO196[] p = new JO196[3];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			p[i] = new JO196(name, tel, addr);
		}

		// 객체간 이름값 비교(첫글짜만 떼서 비교)
		JO196 s = p[0];
		for (int i = 0; i < p.length; i++) {
			if (s.getName().charAt(0) > p[i].getName().charAt(0)) {
				s = p[i];
			}
		}
		s.print();
	}
}
