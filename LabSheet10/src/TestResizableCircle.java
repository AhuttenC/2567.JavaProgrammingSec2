
public class TestResizableCircle {

	public static void main(String[] args) {
		Line();
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		System.out.println("Perimeter: " +  rc.getPerimeter());
		System.out.println("Area: " + rc.getArea());
		Line();
		rc.resize(50);
		System.out.println("Atter resize(50%) : "+ rc );
		System.out.println("Perimeter: " +  rc.getPerimeter());
		System.out.println("Area: " + rc.getArea());
		Line();
	}
	public static void Line() {
		for (int i = 1; i < 60; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
