package builder.v2.application;

import entities.Client;

public interface ClientAbstractBuilder extends Builder<Client> {

    ClientAbstractBuilder setName(String name);

    ClientAbstractBuilder setEmail(String email);

    ClientAbstractBuilder setPassword(String password);
}