package javabystriystart;

import java.io.*;

public class FileHandlingDemo {

    public static void start() {
        String line;
/*        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("myFile.txt"));*/
//BufferedReader должен знать, какой поток данных нужно буферизовать
//Java>=7 «try с ресурсами» - автозакрывает объект BufferedReader
System.out.println("------------FileHandlingDemo start----------------");
try (BufferedReader reader = new BufferedReader(new FileReader("myFile.txt"))){
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();  //прострочное чтение
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } /*finally {
            try {
                if (reader != null) {
                    reader.close(); //Всегда закрывайте
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }*/

        String text = "Hello World";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myFile2.txt", true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
System.out.println("------------FileHandlingDemo finish----------------");
    }
}