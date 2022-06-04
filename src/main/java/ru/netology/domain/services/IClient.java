package ru.netology.domain.services;

import java.util.Set;

public interface IClient {

    String getClientId();

    String getName();

    String getPatronymic();

    String getSurname();

    Set<IPet> getPets();
}
