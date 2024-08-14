package blinmatic.easytools;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class FileIO 
{
    public static String readFile(String file_path) 
    {
        try 
        {
            File file_object = new File(file_path);
            Scanner reader = new Scanner(file_object);

            String data = "";

            while (reader.hasNextLine()) 
            {
              String line = reader.nextLine();
              data = data + line;
            }

            reader.close();
            return data;

        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] readBinaryFile(String filePath) 
    {
        try (FileInputStream fis = new FileInputStream(filePath); ByteArrayOutputStream baos = new ByteArrayOutputStream()) 
        {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) 
            {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeFile(String file_name, String data) 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_name))) 
        {
            writer.write(data);
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public static void writeBinaryFile(String file_name, byte[] data) 
    {
        try (FileOutputStream fos = new FileOutputStream(file_name)) 
        {
            fos.write(data);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
