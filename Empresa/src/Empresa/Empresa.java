package Empresa;

public class Empresa {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Diana", "Bastidas", "12345678Z", "Calle 123", "222-222", 2000000, "1234ABC", "Ford", "Fiesta", "666-666", "Zona 1", 0.10);
        vendedor.incrementarSalario(0);
        System.out.println(vendedor);

        JefeDeZona jefe = new JefeDeZona("David", "Acosta", "87654321Z", "Avenida 456", "777-777", 3500000, "5678DEF", "Toyota", "Padro", "888-888", "Zona Norte", 0.10, "D-100");
        jefe.incrementarSalario(0);
        System.out.println(jefe);
    }
}

