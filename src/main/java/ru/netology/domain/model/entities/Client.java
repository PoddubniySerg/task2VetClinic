package ru.netology.domain.model.entities;

import ru.netology.domain.services.IClient;
import ru.netology.domain.services.IPet;

import java.util.Objects;
import java.util.Set;

public class Client implements IClient {

    private final String clientId;
    private final String name;
    private final String patronymic;
    private final String surname;
    private final Set<IPet> pets;

    public Client(String clientId, String name, String patronymic, String surname, Set<IPet> pets) {
        this.clientId = clientId;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.pets = pets;
    }

    @Override
    public String getClientId() {
        return this.clientId;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPatronymic() {
        return this.patronymic;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public Set<IPet> getPets() {
        return this.pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(getClientId(), client.getClientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientId());
    }
}
