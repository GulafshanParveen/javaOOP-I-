class Constructor{
	private int x;
	private Constructor(){
		System.out.println("Constructor is called");
		x=5;
	}
	public static void main(String[] args){
		Constructor C=new Constructor();
		System.out.println("Value of x="+C.x);
	}
}
