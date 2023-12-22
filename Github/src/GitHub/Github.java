package GitHub;


public class Github {
	void show( ) {
		System.out.println("A class");
	}

	}
	class B extends Github{
		void show() {
			System.out.println("B class");
	} 
		void print() {
			show();
			this.show();
		}

		public static void main(String[] args) {
			
			B ob=new B();
		}
	}


