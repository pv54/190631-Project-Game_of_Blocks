import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.util.Scanner;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;



class SHA {
	public static String SHA_extracter(String string) throws NoSuchAlgorithmException
	{
		MessageDigest di = MessageDigest.getInstance("SHA-256");
		byte[] hash=di.digest(string.getBytes(StandardCharsets.UTF_8));
	    BigInteger n = new BigInteger(1, hash);
		StringBuilder hex = new StringBuilder(n.toString(16));
		return hex.toString();
	}

	public static void main(String args[])
	{   Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		System.out.print("Enter the number of zeros(0) in Target value : ");
		int T=sc.nextInt();
		final long startTime = System.nanoTime();
		 int size=64-T; //64
		try
		{   
		    double a=10;
			double b=64-size;
			int i=(int)(Math.pow(a, b));
			String result=SHA_extracter(s);
                 if(result.length()==size)
				{
					System.out.println(s+i+" : "+String.format("%1$" + 64 + "s", result).replace(' ', '0'));
				
				}
				else 
				{   while(true)
					{   String ns=s+i;
						System.out.println(s);
						result=SHA_extracter(ns);
						System.out.println(i+" :"+result);
						if(result.length()==size)
						{ System.out.println("\n\n\n\n==================================================================================================================");
						     
						System.out.println("Desired Nonce Value:: "+s+i+" : "+String.format("%1$" + 64 + "s", result).replace(' ', '0'));
						 
						  break;
						}
				        i++;
				    }
				    
			    }
			sc.close();
		}
		catch (NoSuchAlgorithmException e) {
			System.out.println("Incorrect algorithm: " + e);
		}
		final long duration = System.nanoTime()- startTime;
		double sec=(double)duration/1000000000.0;
		System.out.println("Time(s):: "+sec+" s");
		System.out.println("==================================================================================================================");
	}
}
