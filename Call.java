class Object{
	public void function(){
		System.out.println("Function method is called");
	}
}
class Call{
	public static void main(String[] args){
		Object ob1=new Object();
		ob1.function();
		System.out.println("Main method is called");
	}
}
