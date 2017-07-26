package test.gry;

public class GenericTest {

	// constraint generic
	public static <T extends Number> T getMax(T arr[])
	{
		T max = arr[0];
		for( T elem : arr )
		{
			max = elem.doubleValue() > max.doubleValue() ? elem : max;
		}
		return max;
	}
	
	public static void printP(Point<? extends Number,? extends Number> p)
	{
		System.out.println( "(x,y) : " + p.x + ", " + p.y );
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> point = new Point();
		point.setX(23);
		point.setY(23.4);
		
		point.printInfo();
		printP(point);
		
		
		Double dx[] = {new Double(1),new Double(2),new Double(3),new Double(4)};
		String sx[] = {"1", "2", "3", "4"};
		
		System.out.println(getMax(dx));
		
	}

}

class Point<T1, T2> {
	T1 x;
	T2 y;
	
	public T1 getX() {
		return x;
	}
	
	public T2 getY() {
		return y;
	}
	
	public void setX(T1 x) {
		this.x = x;
	}
	
	public void setY(T2 y) {
		this.y = y;
	}
	
	public <T1, T2> void printInfo() {
		System.out.println( "(x,y) : " + x + ", " + y );
	}
}


