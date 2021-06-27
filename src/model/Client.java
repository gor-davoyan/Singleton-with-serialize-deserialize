package model;

import java.io.Serial;
import java.io.Serializable;

public class Client implements Serializable {
    private String name;
    private int id;
    public static Client instance;

    private Client() { }

    public static Client getInstance() {
        if (instance == null) {
            synchronized (Client.class) {
                if (instance == null) {
                    instance = new Client();
                }
            }
        }
        return instance;
    }

    @Serial
    private Object readResolve() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}