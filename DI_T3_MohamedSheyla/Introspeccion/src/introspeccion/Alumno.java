
package introspeccion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Alumno {

    public static void main(String[] args) {

        Profesor silvia = new Profesor("Silvia");
        System.out.println(silvia.getNombre());
        Secretario tomas = new Secretario("Tomas", 2000);
        System.out.println(tomas.getNombre());
        System.out.println(tomas.getSalario());
        System.out.println(silvia.getClass()); 
        String nombreClase = "Profesor";
        Class cl1;
        try {
            cl1 = Class.forName(nombreClase);
            System.out.println(cl1.getName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        nombreClase = "Secretario";
        try {
            cl1 = Class.forName(nombreClase);
            System.out.println(cl1.getName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Profesor {

    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Secretario extends Profesor {

    private double salario;

    public Secretario(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    public void setIncentivo(double incentivo) {
        salario = salario + incentivo;
    }

    public String getSalario() {
        return "El salario es: " + salario;
    }
}