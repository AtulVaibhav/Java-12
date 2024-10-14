package in.basics;

public class Query {
   int data =20;
	public void read(Query q1) {
		System.out.println("Value of q1 :"+q1);
		System.out.println(q1.data);//20
	}
	public static void main(String[] args) {
		Query a = new Query(); //
		System.out.println(a);//4517d9a3
		
		a.read(a);
        
	}

}
