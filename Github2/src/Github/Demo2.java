package Github;



public class Demo2 {
int max(int a,int b) {
	if(a>b)
		return a;
	else 
		return b;
}
	public static void main(String[] args) {
		int x=new Demo2().max(23,14);
		System.out.println(x);
		Demo2 d=new Demo2();
		int y=d.max(13, 43);
	  System.out.println(y);
		
	}

}