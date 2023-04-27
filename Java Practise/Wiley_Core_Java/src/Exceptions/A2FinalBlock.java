package Exceptions;

public class A2FinalBlock {

	public static void main(String[] args) {
		try {


			try {
				System.out.println("11111");

			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("wiley");

			//System.exit(0);

			try {
				System.out.println(10/0);

			} 
			catch (Exception e) {
				e.printStackTrace();				
			}
			finally {
				System.out.println("Nexted close connection");
			}

			System.out.println("Edge");

		}
		catch(Exception e) {
			System.out.println("Catch block");
			//			System.exit(0);
			try {
				System.out.println("try catch blosck inside catch block");
				System.out.println(10/0);

			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
			finally {
				System.out.println("nested close connection");
			}

			e.printStackTrace();
		}
		finally {
			//			System.out.println(10/0);
			System.out.println("Clone conection");
			try {
				System.out.println("try catch blosck inside finally block");
				System.out.println(10/0);

			} catch (Exception e3) {
				e3.printStackTrace();
				// TODO: handle exception
			}
			finally {
				System.out.println("nested close connection inside finally");
			}
		
		}
		System.out.println("Last statement");
	}

}
