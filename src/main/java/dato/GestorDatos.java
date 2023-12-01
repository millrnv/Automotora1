package dato;

import modelo.*;

import java.io.*;
import java.util.ArrayList;

public class GestorDatos {

    public static void leerArchivoVehiculos(Automotora automotora, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
//Lee cada linea del archivo hasta que la linea sea nula
            while((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(",");
                if(data[0].equals("Motocicleta")) {
                    automotora.getVehiculos().add(new Motocicleta(data[1],data[2], Integer.parseInt(data[3]),Double.parseDouble(data[4]),Double.parseDouble(data[5]),Integer.parseInt(data[6]),Double.parseDouble(data[7]),data[8],data[9]));
                }else {
                    automotora.getVehiculos().add(new Automovil(data[1],data[2], Integer.parseInt(data[3]),Double.parseDouble(data[4]),Double.parseDouble(data[5]),Integer.parseInt(data[6]),Double.parseDouble(data[7]),Integer.parseInt(data[8]),Double.parseDouble(data[9])));
                }

            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    public static boolean registrarDato(Object objeto, String direccionArchivo) {
        boolean lineaVacia=false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia=true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
//Si el documento no es nuevo y tiene registrado datos, se debe
            if(!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }




}