package main;

import model.Client;
import service.ClientService;

public class Main {
    public static void main(String[] args) {
        Client i = Client.getInstance();
        System.out.println(i.hashCode());
        ClientService.serializeClient(i);

        Client client = ClientService.deserializeClient();
        System.out.println(client.hashCode());
        System.out.println(i == client);
    }
}
