package test.gry;

import static java.lang.System.*;

public class InterfaceTest {

	public static void main(String[] args) {
		 SataHdd sh1=new SeagateHdd();
		 SataHdd sh2=new SamsungHdd();
		 sh1.writeData("2333");
		 
		 A a = new B(); // you need to realize it in B
		 a.doSth();
	}

}

interface SataHdd{
  public static final int CONNECT_LINE=4;
  public void writeData(String data);
  public String readData();
}
interface fixHdd{
  String address = "bj haidian";
  boolean doFix();
}
class SeagateHdd implements SataHdd, fixHdd{
  public String readData(){
      return "data";
  }
  public void writeData(String data) {
      out.println("write successfully...");
  }
  public boolean doFix(){
      return true;
  }
}
class SamsungHdd implements SataHdd{
  public String readData(){
      return "data";
  }
  public void writeData(String data){
      out.println("write successfully...");
  }
}
abstract class XXHdd implements SataHdd{
  public String readData() {
      return "data";
  }
}


// use interface as the type
interface A {
    public int doSth();
}
class B implements A {
    public int doSth() {
        System.out.println("now in B");
        return 123;
    }
}


