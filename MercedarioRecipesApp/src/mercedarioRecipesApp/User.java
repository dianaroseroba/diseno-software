package mercedarioRecipesApp;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
enum Type {
    ADMINISTRATOR,
    OTHER
}

enum Unit {
    KG, 
    LITRE, 
    PIECE
}
public class User {
	private String username;
    private String password;
    private Type userType;

    public boolean authenticate() {
        // Logic for user authentication
        return true;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Type getUserType() {
		return userType;
	}

	public void setUserType(Type userType) {
		this.userType = userType;
	}

}
