package com.gentech.methodsDemo;
class CallByValue {
	void calculate(int x, int y) {
		x+=100;
		y*=5;
		System.out.println("inside calculate method x: "+x+" y: "+y);
	}
	
}
class CallByReference {
	int x,y;
	void calculate(CallByReference o) {
		o.x+=100;
		o.y*=5;
		System.out.println("inside calculate method instance variable x: "+x+" instance variable y: "+y);
	}
}
public class CallByValueAndReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=10;
		System.out.println("Value of x: "+x+" the value of y: "+y);
		System.out.println("==============after calling object method======");
		CallByValue cv = new CallByValue();
		cv.calculate(x, y);
		System.out.println("=======Printing local values again======");
		System.out.println("After local values x: "+x+" y:"+y+" are unchanged");
		CallByReference cr = new CallByReference();
		cr.x=5;
		cr.y=10;
		System.out.println("Value of instance variable x: "+cr.x+" the instance value of y: "+cr.y);
		System.out.println("==============after calling object method========");
		cr.calculate(cr);
		System.out.println("Value of instance variable x: "+cr.x+" the instance value of y: "+cr.y);
	}

}
