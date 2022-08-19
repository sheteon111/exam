
import java.util.Scanner;

public class Operation {
	
	private int X,Y,R;
	
	public void init(int X,int Y)
	{
		this.X=X;
		this.Y=Y;
	}
	public void add()
	{
		R = X + Y;
	}
	
	
	public void display()
	{
		System.out.println("Result "+R);
	}

	public static void main(String[] args) {
		int n=0;
		Operation m1 = new Operation();
		Scanner s = new Scanner(System.in);
		
		int x = 5;
		int y = 4;
		m1.init(x, y);
		
			m1.add();
			m1.display();
			
				
		
		
	}
}
