class Box
{
	static double width,height,depth;
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	static double volume()
	{
		return width*height*depth;
	}
	public static void main(String[] args)
	{
		Box b =new Box(2,3,4);
		System.out.println(b.volume());
	}
}