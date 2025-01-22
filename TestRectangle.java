
public class TestRectangle {

	public static void main(String[] args) {
		
	Rectangle r1 = new Rectangle()
;	System.out.print(r1.showData());
	Spacing();
	System.out.println("Display data wsing toSting() methood"); 
	System.out.println(r1);
	Spacing();
	Rectangle r2 = new Rectangle(1.2f , 3.4f);
	System.out.println(r2);
	
	r1.setLength (5.7f);
	r1.setWidth(7.8f);
	System.out.println(r1);
	System.out.println("length is "+r1.getLegth());
	System.out.println("Width is "+ r1.getWidth());
	
	Spacing();
	System.out.printf("area is %.2fm", r1.getArea());
	System.out.printf("perimeter is %.2",r1.getPerometer());
	
	Spacing();
	System.out.printf("area is %.2fm", r2.getArea());
	System.out.printf("perimeter is %.2",r2.getPerometer());
	}
	public static void Spacing () {
		System.out.println();
		
	}
}
