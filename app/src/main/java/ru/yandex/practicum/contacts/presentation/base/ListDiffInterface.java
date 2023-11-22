package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <E> {
    public boolean theSameAs (E object);

    public boolean equals (Object o);
}