class A{
	void showA(){
		System.out.println("A class ka method");
	}
}
class B extends A{
	void showB(){
		System.out.println("B class ka method");
	}
}
class C extends A{
	void showC(){
		System.out.println("C class ka method");
	}
	public static void main(String args[]){
		A obj1 = new A();
		obj1.showA();
	//  obj1.showB()
	//  obj1.showC()
		System.out.println("----------------------");
		
		B obj2 = new B();
		obj2.showA();
		obj2.showB();
	//  obj2.showC();
		System.out.println("----------------------");
		
		C obj3 = new C();
		obj3.showA();
		obj3.showC();
	//  obj3.showB();
	}
}