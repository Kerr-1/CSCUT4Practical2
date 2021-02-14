import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;



public class FilesInOut2 {
    public static void main(String[] args)  {

        String arr[] = new String[4];
        String lines[] = new String[15];
        String input = args[0];
        String output = args[1];
        boolean u = false;

        int i = 0;
        for(int k = 0; k < args.length; k++) {
            if(args[0].equals("-u")) {
                u = true;
                input = args[1];
                output = args[2];

            }

        }


        try {
            File myObj = new File(input); //change to args[1]


            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                arr = data.split("\\s+");
                if(arr.length > 3) {
                    lines[i] = arr[0] + " " + arr[1] + ". " + arr[2] + " " + dateFormat(arr[3]);
                }
                else {

                    lines[i] = arr[0] + " " + arr[1] + " " + dateFormat(arr[2]);
                }
                i++;


            }
            myReader.close();


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter file = new FileWriter(output); //change to args[2]
            for(String line : lines) {
                if(u) {
                    file.write(line.toUpperCase(Locale.ROOT) + "\n");
                }
                else {
                    file.write(line + "\n");
                }

            }


            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    } // main

    public static String dateFormat(String a) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("ddMMyyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(a, dateFormat);
        return formatter.format(date);
    }
}
