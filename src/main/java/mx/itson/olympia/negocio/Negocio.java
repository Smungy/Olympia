/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.itson.olympia.negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author Jesus Alan
 */
/*
p
    */
public class Negocio {
    
    //Obtiene la primera vocal interna de la cadena ingresada
    public static char obtenerPrimeraVocalInterna(String cadena) {
    Pattern vocal = Pattern.compile("[AEIOUaeiou]");
    
    Matcher m = vocal.matcher(cadena.substring(1, cadena.length() - 1));
    if (m.find()) {
        return m.group().charAt(0);
      }
    return 'X'; // Si no se encontró ninguna vocal interna.
   }
    //Obtiene la primera consonante interna de la cadena ingresada
    public static char obtenerPrimeraConsonanteInterna(String cadena) {
    Pattern consonante = Pattern.compile("[BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz]");
    Matcher m = consonante.matcher(cadena.substring(1, cadena.length() - 1));
    if (m.find()) {
        return m.group().charAt(0);
      }
    return 'X'; // Si no se encontró ninguna vocal interna.
   }
}
    
    
   
    

       
    

        
        
   
   
    
         
         
   

