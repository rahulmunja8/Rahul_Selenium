package Week1;

class ConstructorOverloadDemo {

	      int  value1;
	      int  value2;
	      ConstructorOverloadDemo(){
	       value1 = 10;
	       value2 = 20;
	       System.out.println("Inside 1st Constructor");
	     }
	      ConstructorOverloadDemo(int a){
	      value1 = a;
	      System.out.println("Inside 2nd Constructor");
	    }
	      ConstructorOverloadDemo(int a,int b){
	    value1 = a;
	    value2 = b;
	    System.out.println("Inside 3rd Constructor");
	   }
	   public void display(){
	      System.out.println("Value1 === "+value1);
	      System.out.println("Value2 === "+value2);
	  }
	  public static void main(String args[]){
		  ConstructorOverloadDemo d1 = new ConstructorOverloadDemo();
		  ConstructorOverloadDemo d2 = new ConstructorOverloadDemo(30);
		  ConstructorOverloadDemo d3 = new ConstructorOverloadDemo(30,40);
	    d1.display();
	    d2.display();
	    d3.display();
	 }
	}

