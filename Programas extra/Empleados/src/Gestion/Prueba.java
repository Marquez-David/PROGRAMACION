
package Gestion;


public class Prueba {


    public static void main(String[] args) {
        
        Departamento D1 = new Departamento("Departamento 1 ",123,"C/Gran Via ","Telefonica ");
        Departamento D2 = new Departamento("Departamento 2 ",456,"C/Serranos ","Starbucks ");
        
        Direccion Dir1 = new Direccion("C/Ilustracion ",3,28903,"Getafe ","Madrid ");
        Direccion Dir2 = new Direccion("C/Ave del Paraiso ",7,74092,"Montepinar ","Madrid ");
        
        Empleado E1 = new Empleado("47319570Z ","David ",24,"España ",2.500,D1,"Jefe ",Dir1);
        Empleado E2 = new Empleado("5729702Q ","Adrian ",18,"España ",1.856,D2,"Programador ",Dir2);
        
        System.out.println(E1.toString());
        System.out.println(E2.toString());
        System.out.println(E1.calculo_salario_neto(17.9));
        
        
    }
    
}
