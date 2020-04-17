package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String firstName;
    private String lastName;
    private String peselId;

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return getFirstName().equals(that.getFirstName()) &&
                getLastName().equals(that.getLastName()) &&
                getPeselId().equals(that.getPeselId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPeselId());
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
