class rect{
	private int a, b;
	//Since they are declared as private you cant call them by their variable name in the main code
	public rect(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int retarea(){
		return a*b;
	}
}
