package by.belhard.sokolovskaya.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите полный путь к каталогу с файлами: ");
        String dirName = sc.nextLine();
        System.out.println("Введите полный путь к итоговому файлу: ");
        String resultFileName = sc.nextLine();
        File dir = new File(dirName);
        File resultFile = new File(resultFileName);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile));

            for (File file : Objects.requireNonNull(dir.listFiles())) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String str;
                StringBuilder fileText = new StringBuilder();
                while ((str = reader.readLine()) != null) {
                    fileText.append(str).append(" ");
                    writer.write(str);
                    writer.newLine();
                }
                System.out.println(fileText);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}