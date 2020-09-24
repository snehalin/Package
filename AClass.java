package pack1;
import com.hefshine.pack2.BClass;
//import java.lang.Integer;
public class AClass {
public static void main(String args[])
{
	System.out.println(InterfaceOne.a);
	BClass obj=new BClass();
	System.out.println(obj.b);
	
	String s1="100";
	String s2="200";
	int i=Integer.parseInt(s1);
	int j=Integer.parseInt(s2);
	System.out.println(i+j);
	
}
}
