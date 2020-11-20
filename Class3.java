package com.hefshine.classwork;

public class Class3 {

	public static void main(String[] args) {
		Class1 ob=new Class1();
		ob.display();//default
		//ob.m1(); private method
		ob.m2();//protected method
		ob.m3();
	}

}

/*          diffclass     diffclass       child          child
 *         samepackage    diffpackage     samapackaage   diff.pack
 default     y               n             y              n
 public      y               y             y               y
 private     n               n             n              n
 protected   y               n             y               n--y
 */


