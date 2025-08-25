class SimpleInterestCLA
{
	public static void main(String[] args)
	{
		int principal,time;
		float rate,simpleInterest;

		principal = Integer.parseInt(args[0]);
		time = Integer.parseInt(args[1]);
		rate = Float.parseFloat(args[2]);

		simpleInterest = (principal*rate*time) / 100;

		System.out.println("Principal amount is : " + principal);
		System.out.println("Time is : " + time);
		System.out.println("Rate is : " + rate);
		System.out.println("");
		System.out.println("Simple Interest is : "+ simpleInterest);

	}
}