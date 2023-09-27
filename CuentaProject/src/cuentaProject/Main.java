package cuentaProject;

public class Main {
	  public static void main(String[] args) {
	        Cuenta cuenta1 = new Cuenta("Diana C. Rosero", 500000);
	        Cuenta cuenta2 = new Cuenta("Diana C. Rosero", 1300000.98);

	        System.out.println(cuenta1.toString());
	        System.out.println(cuenta2.toString());
	    }
}
