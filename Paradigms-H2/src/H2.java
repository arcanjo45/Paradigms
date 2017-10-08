
public class H2 {

	public static void main(String[] args) {
		Portfolio p=new Portfolio();
		 Company c1=new Company("Ubisoft");
		 Shares s1=new Shares(1200,c1);
		 Shares s2=new Shares(500,c1);
		 Shares s3=new Shares(700,c1);
		 Company c2=new Company("Apple");
		 Shares s4=new Shares(800,c2);
		 Shares s5=new Shares(900,c2);
		 Shares s6=new Shares(100,c2);
		 p.addShare(s1); p.addShare(s2); p.addShare(s3); p.addShare(s4);
		 p.addShare(s5); p.addShare(s6);
		 System.out.println(p.computeSum()); //4200.0

	}

}
