package Guardar;

import Contactos.Contactos;
import Generador.Generador;
import java.util.Scanner;
import java.io.*;

public class Guardar {

    public void agendar(){

        Scanner leer = new Scanner(System.in);
        
        char volver;
    
        try{
            BufferedWriter archivo = new BufferedWriter(new FileWriter(new File("Arch.json")));

            do{

                Contactos c = new Contactos();

                Generador g = new Generador();
		
                

                archivo.write('{');
                archivo.newLine();
    
                //nombre
        
                c.setNombre(g.generarNombre());
                
                archivo.write("\"nombre\" : " + "\"" + c.getNombre() + "\",");
                archivo.newLine();
            
                System.out.println("El nombre es: " + c.getNombre());
        
        
                //apellido		
            
                c.setApellido(g.generarApellido());
        
                archivo.write("\"apellido\" : " + "\"" + c.getApellido() + "\",");
                archivo.newLine();
            
                System.out.println("El apellido es: " + c.getApellido());
        
            
                //empresa
            
                c.setEmpresa(g.generarEmpresa());
        
                archivo.write("\"empresa\" : " + "\"" + c.getEmpresa() + "\",");
                archivo.newLine();
        
                System.out.println("La empresa es: " + c.getEmpresa());
        
        
                //cargo
                    
                c.setCargo(g.generarCargo());
        
                archivo.write("\"cargo\" : " + "\"" + c.getCargo() + "\",");
                archivo.newLine();
        
                System.out.println("El cargo es: " + c.getCargo());
        
        
                //correo
        
                c.setCorreo(g.generarCorreo());
        
                archivo.write("\"archivo\" : " + "\"" + c.getCorreo() + "\",");
                archivo.newLine();
        
               System.out.println("El correo es: " + c.getCorreo());
        
        
                //telefono
        
                c.setTelefono(g.generarTelefono());
        
                archivo.write("\"telefono\" : " + "\"" + 351 + c.getTelefono() + "\",");
                archivo.newLine();
        
                System.out.println("El telefono es: 351" + c.getTelefono());
        
        
                //notas
                System.out.println("Ingrese notas");
        
                c.setNotas(leer.nextLine());
        
                archivo.write("\"notas\" : " + "\"" + c.getNotas() + "\"");
                archivo.newLine();
        
                System.out.println("Las notas son: " + c.getNotas());
            
                /*System.out.println("Desea agregar datos extra? S/N");
            
                String op;
    
                op = leer.nextLine();
        
                if (op == "s"){
            
                    //poner todos los datos extra aca
            
                }*/

                System.out.println("Desea agregar otro contacto? S/N");

                volver = leer.next().charAt(0);

                if(volver == 'S' || volver == 's' ){

                    archivo.write("},");
                    archivo.newLine();

                }else{

                    archivo.write('}');

                }
                
                

            }while(volver == 's' || volver == 'S');
    
            archivo.close();
            leer.close();
        }
    
        catch (IOException error){

            System.out.println("Hay un problema en el archivo" + error.getMessage());
        
        }
    
    }
    
}





