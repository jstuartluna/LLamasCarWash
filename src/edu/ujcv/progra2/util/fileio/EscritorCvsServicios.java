package util.fileio;

import Modulos.Servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscritorCvsServicios {

    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header
    private static final String FILE_HEADER = "codigoProducto ,cantidadProducto,precioProducto , descripcionProducto";

    public static void writeCsvFile(String fileName, ArrayList<Servicios> productos, boolean append) {



        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName,append);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER);

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file
            for (Servicios producto : productos) {
                fileWriter.append(String.valueOf(producto.getCodigoservicio()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(producto.getDescripcionservicio());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(producto.getPrecioservicio());
                fileWriter.append(COMMA_DELIMITER);
            }


        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }

}
