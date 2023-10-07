/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.itson.olympia.negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Contiene funciones y clases que nos ayudan a obtener la vocal interna.

/**
 *
 * @author Jesus Alan
 */
/*
p
    */
public class Negocio {
    
    //Define la función llamada obtenerPrimeraVocalInterna, toma una cadena de String como entrada y devuelve un char.
    public static char obtenerPrimeraVocalInterna(String cadena) {
    //Se crea un objeto Pattern llamado vocal, la expresión regular AEIOUaeiou se utiliza para buscar cualquier vocal en la cadena.
    Pattern vocal = Pattern.compile("[AEIOUaeiou]");
    //Se llama al método matcher en el Pattern creado anteriormente, y se le proporciona una subcadena de cadena. La subcadena se obtiene eliminando el primer y último carácter de cadena. 
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
}
    
    
   
    

       
    

        
        
   
   
    
         
         
   

