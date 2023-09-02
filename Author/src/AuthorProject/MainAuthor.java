package AuthorProject;

public class MainAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorProject autora01 = new AuthorProject("Diana Bastidas", "diana.caro11@hotmail.com", 'f');
        System.out.println(autora01);
        
        autora01.setEmail("diana.roseroba@campusucc.edu.com");
        System.out.println("Actualizar el correo electrònico: " + autora01);

	}

}
