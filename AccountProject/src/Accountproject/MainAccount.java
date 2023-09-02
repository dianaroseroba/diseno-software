package Accountproject;

public class MainAccount {

    public static void main(String[] args) {
        Account cuenta1 = new Account("DR001", "Diana Rosero", 1000000);
        Account cuenta2 = new Account("DR002", "Claudia Lòpez", 500000);
        
        System.out.println(cuenta1);
        
        cuenta1.credit(900000); //suma a la cuenta
        System.out.println("Despuès de pedir un crèdito de 900000 el total de mi cuenta es: " + cuenta1);
        
        cuenta1.debit(100000);
        System.out.println("Se debitan 100000 de la cuenta1: " + cuenta1);
        
        cuenta1.tranferTo(cuenta2, 90000);
        System.out.println("Si se transfiere 20000 desde la cuenta 1 a la cuenta 2:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
