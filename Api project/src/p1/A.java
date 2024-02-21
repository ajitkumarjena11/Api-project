package p1;

public class A {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test(10,"mike",true,'a',10.3);
	}
	public void test(int i,String s, boolean b,char c,double d) {
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
