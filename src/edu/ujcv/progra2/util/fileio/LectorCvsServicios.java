package util.fileio;

import Modulos.Servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorCvsServicios {

    private static final String COMMA_DELIMITER = ",";

    //Student attributes index
    private static final int SERVICE_COD_IDX = 0;
    private static final int SERVICE_DESSER_IDX = 1;
    private static final int SERVICE_PRESER_IDX = 2;
    private static final int SERVICE_CANSER_IDX = 3;

    public static ArrayList<Servicios> readCsvFile(String fileName) {

        BufferedReader fileReader = null;
        ArrayList<Servicios> servicios = new ArrayList();

        try {

            String line = "";

            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                    //Create a new student object and fill his  data
                   Servicios cliente = new Servicios(tokens[SERVICE_COD_IDX], tokens[SERVICE_DESSER_IDX], tokens[SERVICE_PRESER_IDX], tokens[SERVICE_CANSER_IDX]);
                   servicios.add(cliente);
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
        return servicios;
    }
}
