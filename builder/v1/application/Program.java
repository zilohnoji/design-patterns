package builder.v1.application;

import entities.Client;

public class Program {

    public static void main(String[] args) {
        Client donato = ClientBuilder.builder()
                .name("Pedro Donato")
                .email("pedrodonato@gmail.com")
                .password("12345678")
                .build();

        System.out.println(donato);
    }
}