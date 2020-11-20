package com.hefshine.homework;

import com.hefshine.classwork.Class1;

public class Class2  extends  Class1{

public	void print()
	{
		Class1 ob=new Class1();
		//ob.display(); default
		ob.m2(); //protected
		//ob.m1(); private
		ob.m3();//public
	}
}
