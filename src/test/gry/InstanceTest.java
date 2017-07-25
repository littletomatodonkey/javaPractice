package test.gry;


public class InstanceTest {

	public static void main(String[] args) {
		People obj = new People();
		if(obj instanceof Object){
            System.out.println("i am an obejct");
        }
		
		if(obj instanceof People){
            System.out.println("i am an person");
        }
		
		if(obj instanceof Teacher){
            System.out.println("i am an teacher");
        }
	}

}

