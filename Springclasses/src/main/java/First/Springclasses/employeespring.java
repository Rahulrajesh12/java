package First.Springclasses;

public class employeespring 
{
@Override
	public String toString() {
		return "employeespring [employe=" + employe + ", id=" + id + ", role=" + role + ", email=" + email + "]";
	}
public String getEmploye() {
		return employe;
	}
	public void setEmploye(String employe) {
		this.employe = employe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
String employe;
int id;
String role;
String email;
	
}
