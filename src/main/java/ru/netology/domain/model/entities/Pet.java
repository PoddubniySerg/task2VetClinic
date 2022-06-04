package ru.netology.domain.model.entities;

import ru.netology.domain.services.IClient;
import ru.netology.domain.services.IPet;

import java.util.Objects;

public class Pet implements IPet {

    private final String petId;
    private final String nickname;
    private final String type;

    private final IClient client;

    public Pet(String petId, String nickname, String type, IClient client) {
        this.petId = petId;
        this.nickname = nickname;
        this.type = type;
        this.client = client;
    }

    @Override
    public String getPetId() {
        return this.petId;
    }

    @Override
    public String getNickname() {
        return this.nickname;
    }

    @Override
    public String getAnimalType() {
        return this.type;
    }

    @Override
    public IClient getOwner() {
        return this.client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(getPetId(), pet.getPetId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPetId());
    }
}
