package week3.assignment.org.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("15inch - Desktop Size invoked from Desktop Class");
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
