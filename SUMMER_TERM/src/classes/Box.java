package classes;


public class Box {
double height,width,depth;
	public Box(double height, double width, double depth) {
	super();
	this.height = height;
	this.width = width;
	this.depth = depth;
}
	double volume()
	{
		return height*width*depth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10.5,11.5,5.6);
		System.out.println(b.volume());
		

	}

}
