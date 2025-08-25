class CompoundInterestCLA
{
	public static void main(String[] args) {
		
		int principal,time;
		double rate, amount, compoundInterest;

		principal = Integer.parseInt(args[0]);
		time = Integer.parseInt(args[1]);
		rate = Double.parseDouble(args[2]);

		System.out.println("Principal amount is : "+ principal);
		System.out.println("Time is : "+ time);
		System.out.println("Rate is : "+ rate);

		amount = principal*Math.pow(1+rate/100,time);

		compoundInterest = amount - principal;

		System.out.println("Amount is : "+ amount);
		System.out.println("Compound Interest is : "+ compoundInterest);
	}
}