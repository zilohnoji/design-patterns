package builder.v2.application;

import entities.Client;

public class ClientConcreteBuilder implements ClientAbstractBuilder {

    private Client entity;

    private ClientConcreteBuilder() {
        this.reset();
    }

    public static ClientConcreteBuilder builder(){
        return new ClientConcreteBuilder();
    }

    @Override
    public Client build() {
        return this.entity;
    }

    @Override
    public void reset() {
        this.entity = new Client();
    }

    @Override
    public ClientAbstractBuilder setName(String name) {
        this.entity.setName(name);
        return this;
    }

    @Override
    public ClientAbstractBuilder setEmail(String email) {
        this.entity.setEmail(email);
        return this;
    }

    @Override
    public ClientAbstractBuilder setPassword(String password) {
        this.entity.setPassword(password);
        return this;
    }
}