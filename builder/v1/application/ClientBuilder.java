package builder.v1.application;

import entities.Client;

public class ClientBuilder {

    private Client entity;

    private ClientBuilder() {
        this.entity = new Client();
    }

    public static ClientBuilder builder() {
        return new ClientBuilder();
    }

    public Client build() {
        return this.entity;
    }

    public ClientBuilder name(String name) {
        this.entity.setName(name);
        return this;
    }

    public ClientBuilder email(String email) {
        this.entity.setEmail(email);
        return this;
    }

    public ClientBuilder password(String password) {
        this.entity.setPassword(password);
        return this;
    }
}