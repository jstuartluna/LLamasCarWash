package util.fileio;

import Modulos.Clientes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

    public class EscritorCvsClientes {

        //Delimiter used in CSV file
        private static final String COMMA_DELIMITER = ",";
        private static final String NEW_LINE_SEPARATOR = "\n";

        //CSV file header
        private static final String FILE_HEADER = "idendtidad,primerNombre,primerApellido, codigoCliente";

        public static void writeCsvFile(String fileName, ArrayList<Clientes> clientes, boolean append) {



            FileWriter fileWriter = null;

            try {
                fileWriter = new FileWriter(fileName,append);

                //Write the CSV file header
                fileWriter.append(FILE_HEADER);

                //Add a new line separator after the header
                fileWriter.append(NEW_LINE_SEPARATOR);

                //Write a new student object list to the CSV file
                for (Clientes cliente : clientes) {
                    fileWriter.append(String.valueOf(cliente.getNumeroidentidad()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(cliente.getNombre());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(cliente.getApellidos());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(cliente.getCodigocliente());
                    fileWriter.append(NEW_LINE_SEPARATOR);
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
