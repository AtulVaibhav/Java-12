package in.basics;


class Experiment{
	int data = 20;
	static int data2 = 30;
	
	public static void m1(Experiment ex) {
		System.out.println(Experiment.data2);
		System.out.println(ex.data);
		//System.out.println(this.data); : not allowed
	}
}

public class This_III {

	public static void main(String[] args) {
		Experiment ex = new Experiment();
		Experiment.m1(ex);

	}

}
