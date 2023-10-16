package mercedarioRecipesApp;
//Enumeración USER_TYPE
enum USER_TYPE {
 Administrator,
 Chef,
 Other
}

//Clase User
public class User {
 private String userName;
 private String password;
 private USER_TYPE userType;

 // Constructor por defecto
 public User() {
     this.userName = "";
     this.password = "";
     this.userType = USER_TYPE.Other; // Asigna un tipo por defecto
 }

 // Getters y Setters para userName
 public String getUserName() {
     return userName;
 }

 public void setUserName(String userName) {
     this.userName = userName;
 }

 // Getters y Setters para password
 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }

 // Getters y Setters para userType
 public USER_TYPE getUserType() {
     return userType;
 }

 public void setUserType(USER_TYPE userType) {
     this.userType = userType;
 }

 // Método para autenticar
 public boolean authenticate(USER_TYPE userType, String password) {
     return this.userType == userType && this.password.equals(password);
 }

}
