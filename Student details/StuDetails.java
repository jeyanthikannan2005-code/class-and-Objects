class StuDetails
{
	String name;
	String roolNum;
	int marks;
	public static void main(String[] args)
	{
		StuDetails n=new StuDetails();
		n.name="Priya";
		n.roolNum="02";
		n.marks=97;
		System.out.println(n.name+" "+n.roolNum+" "+n.marks);
		StuDetails n1=new StuDetails();
		n1.name="Sri";
		n1.roolNum="002";
		n1.marks=78;
		System.out.println(n1.name+" "+n1.roolNum+" "+n1.marks);
	}
}