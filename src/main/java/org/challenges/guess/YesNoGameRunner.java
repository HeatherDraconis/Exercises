package org.challenges.guess;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class YesNoGameRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        runGame(new ScannerSource(), new SystemOutPrinter());
    }

    public static void runGame(IInputSource inputSource, IPrinter printer) throws IOException, ClassNotFoundException {
        Node baseNode = loadGameData(printer);
        YesNoGame game = new YesNoGame(inputSource, baseNode, printer);
        game.run();
        writeGameData(getFile(), game.getBaseNode());
    }

    private static Node createDefaultGameData() {
        return new Leaf("Apple");
    }

    private static void writeGameData(File file, Node node) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(node);
        }
    }

    private static Node loadGameData(IPrinter printer) throws IOException, ClassNotFoundException {
        File file = getFile();
        if (!file.exists()) {
            printer.println("New Game Started!");
            return createDefaultGameData();
        }
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Node) objectInputStream.readObject();
        }
    }

    private static File getFile() throws IOException {
        String directory = getDirectory();
        return new File(directory);
    }

    private static String getDirectory() throws IOException {
        Properties properties = new Properties();
        URL path = YesNoGameRunner.class.getResource("/guess.properties");
        properties.load(new FileInputStream(path.getPath()));
        return properties.getProperty("directory");
    }
}
