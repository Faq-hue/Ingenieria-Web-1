package Generador;

import java.util.Random;

public class Generador {
    
    public String correo;

    public String generarNombre(){

        String nombre[] = {"Facundo","Dario","Lorenzo","Kevin","Thais","Angelo","Milagros","Sofia","Gabriel","Enzo","Karen","Micaela","Ezequiel","Yair","Tomas","Britney","Taylor","Camila","Joaquin","Nicolas"};

        Random r = new Random();

        int x = r.nextInt(19);

        correo = nombre[x];

        return nombre[x];
    }



    public String generarApellido(){

        String apellido[] = {"Zamora","Yanes","Sosa","Zavala","Sanabria","Musa","Escudero","Manfredi","Spears","Swift","Cortez","Ikari","Varela","Gomez","Maldonado","Vega","Arevalo","Gomez","Peralta","Ponce"};

        Random r = new Random();

        int x = r.nextInt(19);

        correo = correo + apellido[x];

        return apellido[x];
    }


    public String generarEmpresa(){

        String empresa[] = {"Apple","Google","Sony","Samsung","LG","Rexona","Lakai","Ford","Fiat","Nerv","Spotify","McDonalds","BMW","SpaceX","Adidas","Nestle","Heineken","P&G","Micrososft","Subway"}; 

        Random r = new Random();

        int x = r.nextInt(19);

        return empresa[x];
    }


    public String generarCargo(){

        String cargo[] = {"CEO","Ingeniero","Lavaplatos","Cocinero","Asistente","Tecnico","Gerente","Recursos Humanos","Administrador","Vendedor","Analista","Ejecutivo","Community Manager","Supervisor","Auditor","Chofer","Liquidador de Sueldos","Consultor","Webmaster","Programador"};

        Random r = new Random();

        int x = r.nextInt(19);

        return cargo[x];
    }


    public int generarTelefono(){

        Random r = new Random();

        int x = r.nextInt(1000001) + 1;

        return x;
    }


    public String generarCorreo(){

        return correo + "@gmail.com";
    }
}
