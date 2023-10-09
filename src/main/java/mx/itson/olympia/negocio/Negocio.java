
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.itson.olympia.negocio;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Contiene funciones, y condiciones que nos ayudan a obtener la vocal interna, consonante interna para obtener la CURP.

/**
 *
 * @author Antonio Alatorre
 */
/*
p
    */
public class Negocio {
    
    //Define la función llamada obtenerPrimeraVocalInterna, toma una cadena de String como entrada y devuelve un char.
    public static char obtenerPrimeraVocalInterna(String cadena) {
    //Se crea un objeto Pattern llamado vocal, la expresión regular AEIOUaeiou se utiliza para buscar cualquier vocal en la cadena.
    Pattern vocal = Pattern.compile("[AEIOUaeiouáéíóú]");
    //Se llama al método matcher en el Pattern creado anteriormente, y se le proporciona una subcadena de cadena. 
    //La subcadena se obtiene eliminando el primer y último carácter de cadena. 
    //Esto se hace para buscar en la parte interna de la cadena y omitir el primer y último carácter.
    Matcher m = vocal.matcher(cadena.substring(1, cadena.length() - 1));
     //Busca la primera coincidencia de la expresión regular en la subcadena. Si se encuentra una vocal interna, esta condición será verdadera
    if (m.find()) {
        return m.group().charAt(0);
      }
    return 'X';
   }
    
    
    //Define la función llamada obtenerPrimeraConsonanteInterna, toma una cadena de String como entrada y devuelve un char.
    public static char obtenerPrimeraConsonanteInterna(String cadena) {
    //Se crea un objeto Pattern llamado consonante, la expresión regular [BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz] se utiliza para buscar cualquier consonante en la cadena.
    Pattern consonante = Pattern.compile("[BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz]");
    //Se llama al método matcher en el Pattern creado anteriormente, y se le proporciona una subcadena de cadena. La subcadena se obtiene eliminando el primer y último carácter de cadena. 
    //Esto se hace para buscar en la parte interna de la cadena y omitir el primer y último carácter.
    Matcher m = consonante.matcher(cadena.substring(1, cadena.length() - 1));
    //Busca la primera coincidencia de la expresión regular en la subcadena. Si se encuentra una vocal interna, esta condición será verdadera
    if (m.find()) {
        return m.group().charAt(0);
      }
    return 'X'; 
    
     } 
    
   
//Condicion en nombres compuestos que comiencen con José o María, se tomará en cuenta la primera letra segundo nombre.
    public static char obtenerPrimeraLetraNombre(String nombreCompleto) {
        String[] partesNombre = nombreCompleto.split(" ");
       
        // Se pone la condicion
        if (partesNombre.length >= 2) {
            String primerNombre = partesNombre[0];
            String segundoNombre = partesNombre[1];
          //es un método en Java que se utiliza para comparar dos cadenas de caracteres ignorando las diferencias entre mayúsculas y minúsculas.
            if (primerNombre.equalsIgnoreCase("Jóse") || primerNombre.equalsIgnoreCase("María")) {
                // si la condicion se cumple, devolvera la primera letra del segundo nombre
                return segundoNombre.charAt(0);
            }
        }
       // en caso de no cumplirla, seguira tomando la primera letra del primer nombre
        return nombreCompleto.charAt(0);
    }
    
    
    //Condicion para determinar si la persona es nacida antes de los 2000 o despues de
    public static char obtenerDigitoFecha(int añoNacimiento) {
        //se plantea la condicion
        if (añoNacimiento >= 2000) {
            //si la condicion en cuestion es verdadera y el año de nacimiento es mayor a los 2000. Retorna 'A'
            return 'A';
        } else {
            //si la condicion en cuestion es falsa y el año de nacimiento es menor a los 2000. Retorna '0'
            return '0';
        }
    
    
    }   
}
      


    
    

    
    
   
    

       
    

        
        
   
   
    
         
         
   


