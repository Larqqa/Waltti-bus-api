package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class ReadFile {
    public ReadFile(String fileName) {}

    public static BufferedReader read(String fileName) {
        if (Objects.isNull(fileName)) throw new IllegalArgumentException("Invalid argument!");

        var resource = ReadFile.class.getClassLoader().getResourceAsStream(fileName);
        if (Objects.isNull(resource)) throw new IllegalStateException("Invalid input!");

        return new BufferedReader(new InputStreamReader(resource));
    }
}
