import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Empleado> lstEmpleados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);



        EmpleadoAdministrativo ea1 = new EmpleadoAdministrativo("Gary", 31, 30000000, 12000);

        EmpleadoVentas ev1 = new EmpleadoVentas("Ana", 23, 2400000, 23000, 6);

        EmpleadoHoras eh1 = new EmpleadoHoras("Daniel", 45, 1300000,14, 85000 );


        lstEmpleados.add(ea1);
        lstEmpleados.add(ev1);
        lstEmpleados.add(eh1);


        System.out.println(lstEmpleados);

        int opc;
        do {
            System.out.println("\n1. Registrar empleado administrativo");
            System.out.println("2. Registrar empleado ventas");
            System.out.println("3. Registrar empleado por horas");
            System.out.println("4. Mostrar todos los empleados");
            System.out.println("5. Buscar empleado por ID");
            System.out.println("6. Calcular salario final");
            System.out.println("7. Aumentar salario base");
            System.out.println("8. Mostrar empleados mayores de edad");
            System.out.println("9. Salir");

            opc = teclado.nextInt();

            switch (opc){
                case 1: {
                    System.out.println("Registar empleado administrativo");

                    System.out.println("Ingresa el nombre del empleado ");
                    String nombre = teclado.next();

                    System.out.println("Ingresa la edad del empleado");
                    int edad = teclado.nextInt();

                    System.out.println("Ingresa el salario del empleado");
                    double salarioBase = teclado.nextDouble();

                    System.out.println("Ingresa la bonificación del empleado");
                    double bonificacion = teclado.nextDouble();


                    Empleado ea2 = new EmpleadoAdministrativo(nombre, edad, salarioBase, bonificacion);
                    lstEmpleados.add(ea2);
                }
                    break;


                case 2: {
                    System.out.println("Registar empleado ventas");

                    System.out.println("Ingresa el nombre del empleado ");
                    String nombre = teclado.next();

                    System.out.println("Ingresa la edad del empleado");
                    int edad = teclado.nextInt();

                    System.out.println("Ingresa el salario del empleado");
                    double salarioBase = teclado.nextDouble();

                    System.out.println("Ingresa el total de ventas del empleado");
                    double totalVentas = teclado.nextDouble();

                    System.out.println("Ingresa el porcentaje de comision del empleado");
                    double comision = teclado.nextDouble();


                    Empleado ev2 = new EmpleadoVentas(nombre, edad, salarioBase, totalVentas, comision);
                    lstEmpleados.add(ev2);
                }
                    break;

                case 3: {
                    System.out.println("Registar empleado por horas");

                    System.out.println("Ingresa el nombre del empleado ");
                    String nombre = teclado.next();

                    System.out.println("Ingresa la edad del empleado");
                    int edad = teclado.nextInt();

                    System.out.println("Ingresa el salario del empleado");
                    double salarioBase = teclado.nextDouble();

                    System.out.println("Ingresa el total de horas trabajadas del empleado");
                    int horasTrabajadas = teclado.nextInt();

                    System.out.println("Ingresa el valor por hora del empleado");
                    double valorHora = teclado.nextDouble();


                    Empleado eh2 = new EmpleadoHoras(nombre, edad, salarioBase, horasTrabajadas, valorHora);
                    lstEmpleados.add(eh2);
                }
                    break;

                case 4: {
                    for (Empleado p: lstEmpleados){
                        System.out.println(p);
                    }
                }
                break;

            }

        }while (opc != 9);

    }
}