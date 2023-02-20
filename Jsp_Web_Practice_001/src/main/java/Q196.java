import java.util.Scanner;

class Person {
	
	private String name;
	private String tel;
	private String adrs;
 
public Person (String name, String tel, String adrs) {
	this.name = name;
	this.tel = tel;
	this.adrs = adrs;
}

public void print() {
	System.out.println("name :" + name);
	System.out.println("tel :" +tel);
	System.out.println("addr :" +adrs);

}
}

public class Q196 {
	public static void mina(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		String name =sc.next();
		String tel =sc.next();
		String adrs  =sc.next();
		sc.close();
		
		System.out.println(name);
		System.out.println(tel);
		System.out.println(adrs);
		
		Person p = new Person (name, tel, adrs);
		}
}
