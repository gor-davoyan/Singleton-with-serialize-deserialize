package service;

import model.Client;

import java.io.*;

public class ClientService {
    private static final String FILE_NAME = "user";

    public static void serializeClient(Client c) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Client deserializeClient() {
        Client c = null;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object o = ois.readObject();
            c = (Client) o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
}
