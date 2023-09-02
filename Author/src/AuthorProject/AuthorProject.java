package AuthorProject;

public class AuthorProject {
    private String name;
    private String email;
    private char gender;

    // Constructor
    public AuthorProject(String name, String email, char gender) {
        this.name = name;
        this.email = email;

        // Validaciòn de genero femenino y masculino
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender must be either 'm' or 'f'"); //Throw es un metodo que hace que sea probable que ocurra una excepciòn
        }
    }

    // Getters y Setters
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "AuthorProject [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
}

