
public class MyMain {

	public MyMain(String name)
	{
		System.out.println("My name is:" + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++)
		{
			System.out.println("i : "+ i);
			
		}
		
		MyMain mymain = new MyMain("Abhy");
	}

}
