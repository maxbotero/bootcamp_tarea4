public class Main {
    public static void main(String[] args) {


    Cliente cliente = new Cliente();

    cliente.setCredito(5000);
    cliente.edad = 60;
    cliente.nombre = "Pablo";
    cliente.telefono = "3185236458";
    System.out.println("El cliente se llama " + cliente.nombre + ", su edad es " + cliente.edad + "años " + "y tiene un credito de " + cliente.getCredito() + " dolares");

    Trabajador trabajador = new Trabajador();
    trabajador.setSalario(2000);
    trabajador.edad = 45;
    trabajador.nombre = "perejildo";
    trabajador.telefono = "3203185498";
    System.out.println("El trabajador de llama " + trabajador.nombre + ", su edad es " + trabajador.edad + " y tiene un salario de " + trabajador.getSalario() + " dolares");
    }

}

class Persona {
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona {
    private float credito;

    public void setCredito(float credito){
        this.credito = credito;
    }

    public float getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private float salario;

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

}
