
public class Bonk implements Being{

	//instance variables
	private String name;
	private Position position;
	private String gender;
	
	public Bonk(){
		
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void act() throws CannotActException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Position getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocation(Position location) {
		// TODO Auto-generated method stub
		
	}

}
