public class Character extends Location{

private String firstName; 
private String lastName;
public Character() {
	this.firstName="No One";
	this.lastName="Stark";
}
public String getName() {
	return firstName;
}
public void setName(String name) {
	this.firstName = name;
}
public String getlName() {
	return lastName;
}
public void setlName(String lName) {
	this.lastName = lName;
}


public String toString(){
	return ("Sir "+ this.firstName + " of House "+ this.lastName);
}


}

