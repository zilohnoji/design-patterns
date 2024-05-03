package builder.v2.application;

import entities.Client;

public class Program {

    public static void main(String[] args) {
        Client client = ClientConcreteBuilder.builder()
                .setName("Pedro Donato")
                .setEmail("pedrodonato@gmail.com")
                .setPassword("12345678")
                .build();

        System.out.println(client);
    }
}