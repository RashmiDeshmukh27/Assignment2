
public class FirstSession {
	public static void main(String[] args){
		FirstSession fs = new FirstSession();
		//System.out.println(FirstSession.add(12, 12));
		try
		{
			System.out.println(fs.div(75,0));

		}
		catch(Exception ex)
		{
			System.out.println("Some logical error present");
		}
		finally
		{
			System.out.println("program will safely close");
		}
	}
	public int div (int a, int b){
		
		return a/b;
	}
	
}
