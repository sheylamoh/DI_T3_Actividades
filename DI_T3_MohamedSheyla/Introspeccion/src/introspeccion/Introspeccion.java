
package introspeccion;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sheyla
 */
public class Introspeccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreClase;
        Constructor constructores[];
        Method methos[];
        Field fields[];
        
        System.out.println("Introduce el nombre de clase: ");
        nombreClase = sc.nextLine();
        System.out.println("");
        
        Class cl1;
        
        try {
            cl1 = Class.forName(nombreClase);
            constructores = cl1.getConstructors();
            
            System.out.println("Nombre: " + cl1.getName());
            
            System.out.println("");
            
            for(int i = 0 ; i < constructores.length ; i++)
            {
                System.out.println("Constructor " + (i+1) + ": " + constructores[i].toString());
            }
            
            methos = cl1.getMethods();
            
            System.out.println("");
            
            for(int i = 0 ; i < methos.length ; i++)
            {
                System.out.println("Método " + (i+1) +  ": " + methos[i].toString());
            }
            System.out.println("");
            fields = cl1.getDeclaredFields();
            
            for(int i = 0 ; i < fields.length ; i++)
            {
                System.out.println("Field " + (i+1) +  ": " + fields[i].toString());
            }
            
            System.out.println("");
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
