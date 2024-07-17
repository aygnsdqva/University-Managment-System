package util.file;

import util.color.ColorUtil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {

    public static Object readFileDeserialize(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            ColorUtil.showInRed("Could not read object from file " + fileName);
            return null;
        }
    }

    public static void writeObjectToFile(Object obj, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            ColorUtil.showInRed("Could not write object to file " + fileName);
        }
    }
}

