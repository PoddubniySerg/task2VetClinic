package ru.netology.domain.services;

public interface IPet {

    String getPetId();

    String getNickname();

    String getAnimalType();

    IClient getOwner();
}
