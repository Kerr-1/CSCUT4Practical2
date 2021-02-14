import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;




/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args)  {
      String arr[] = new String[3];
      String lines[] = new String[14];
      int i = 0;
      boolean u = true; //args[0]
        try {
            File myObj = new File("input.txt"); //change to args[1]


            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                arr = data.split("\\s+");
                lines[i] = arr[0] + " " + arr[1] +" " + dateFormat(arr[2]);
                System.out.println(lines[i] + " INDEX       " + i);
                i++;


            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

              try {
                        FileWriter file = new FileWriter("formatted.txt"); //change to args[2]
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

} // FilesInOut
