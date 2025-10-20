package Challenge;

public class StringChallange {

	public static void main(String[] args) {
		String s[]= {"sita","gita","nita","riyana","nitanshi"};
		int n=s.length;
		String ss = null;
		for(int i=0;i<n-1;i++)
		{
			if(s[i].length()<s[i+1].length())
			{
				 ss=s[i+1];
			}
		}

		System.out.println(" longest string is "+ss);
		System.out.println(" length of longest string is "+ss.length());
	}

}
