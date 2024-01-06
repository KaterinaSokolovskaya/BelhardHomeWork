package by.belhard.sokolovskaya.library;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static boolean saveReadersList(List<Reader> readers, String fileName) {
        boolean result = false;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(readers);
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<Reader> restoreReadersList(String restoreFileName) {
        List<Reader> readers = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(restoreFileName))) {
            readers = (ArrayList<Reader>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return readers;
    }
}