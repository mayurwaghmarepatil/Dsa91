package mayur;


	import java.lang.Math;

	public class solution91 {
		
		static boolean isPowerOfTwo(int n)
		{
			if (n == 0)
				return false;

			return (int)(Math.ceil((Math.log(n) / Math.log(2))))
				== (int)(Math.floor(
					((Math.log(n) / Math.log(2)))));
		}
		public static void main(String[] args)
		{
			
			if (isPowerOfTwo(4))
				System.out.println("true");
			else
				System.out.println("false");

			if (isPowerOfTwo(3))
				System.out.println("true");
			else
				System.out.println("false");
		}
	}

	