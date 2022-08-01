import java.util.Scanner;

public class JO617 {
	private String name;
	private int height;
	
	public JO617(String name,int height) {
		this.name = name;
		this.height = height;
	}
	
	public void print() {
		System.out.println(name+" "+height);
	}
	
	public int getHeight() {
		return height;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JO617 [] p = new JO617[5];
		for(int i=0; i<p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			p[i] = new JO617(name, height);  //바로 생성자에 넣어준다.
		}
		sc.close();
		
		JO617 min = new JO617("min",190); 
		
		for(int i =0; i<p.length; i++) {
			if(min.getHeight()>p[i].getHeight()) {
				min=p[i];
			}
		}
		min.print();
	}

}
