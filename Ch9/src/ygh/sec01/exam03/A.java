package ygh.sec01.exam03;

public class A {
    int field1;
	void method1() { }
	
	static int field2;
	static void method2() { }
	
	class B {
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {

			field2 = 10;
			method2();
		}
	}	
}
