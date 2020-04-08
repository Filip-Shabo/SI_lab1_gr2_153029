class Student {
	String index;
	String firstName;
	String lastName;

	public final List<Integer> grades;
	public GradesList(int numbers){
		grades=new ArrayList<Integers>();
		
		for(int i:numbers){
			grades.add(i);
		}
	}

	//TODO constructor
	Student(String index, String firstName, String lastName){
	this.index=index;
	this.firstName=firstName;
	this.lastName=lastName;
	
	
	}
	//TODO seters & getters
	public String getIndex(){
	return this.index;
	}
	public String getFirstName(){
	return this.firstName;
	}
	public String getLastName(){
	return this.lastName;
	}
	
	public void setIndex(int i){
	this.index=i;
	}
	public void setFirstName(int fn){
	this.firstName=fn;
	}
	public void setLastName(int ln){
	this.lastName=ln;
	}

	
	public double getAverage() {
		//TODO
		
		return (double) sum/array.length;
		
	}

	public int ECTSCredits() {
		//TODO
	}
}
