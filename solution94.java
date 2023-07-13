package mayur;

public class solution94 {
		static int power(int N, int P)
		{
			if (P == 0)
				return 1;
			else
				return N * power(N, P - 1);
		}
		public static void main(String[] args)
		{
			int N = 5;
			int P = 2;

			System.out.println(power(N, P));
		}
	}



