package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "user1", 'M',LocalDate.of(1970, 1, 10) , 0));
        listOfUsers.add(new ForumUser(2, "user2", 'F',LocalDate.of(1975, 2, 11) , 2));
        listOfUsers.add(new ForumUser(3, "user3", 'M',LocalDate.of(1980, 3, 12) , 12));
        listOfUsers.add(new ForumUser(4, "user4", 'F',LocalDate.of(1985, 4, 13) , 6));
        listOfUsers.add(new ForumUser(5, "user5", 'M',LocalDate.of(1990, 5, 14) , 0));
        listOfUsers.add(new ForumUser(6, "user6", 'F',LocalDate.of(1995, 6, 15) , 8));
        listOfUsers.add(new ForumUser(7, "user7", 'M',LocalDate.of(2000, 7, 16) , 3));
        listOfUsers.add(new ForumUser(8, "user8", 'F',LocalDate.of(2005, 8, 17) , 6));
        listOfUsers.add(new ForumUser(9, "user9", 'M',LocalDate.of(2010, 9, 18) , 9));
        listOfUsers.add(new ForumUser(10, "user10", 'F',LocalDate.of(2015, 10, 19) , 0));
    }

    public List<ForumUser> getListOfUsers() {
        return new ArrayList<>(listOfUsers);
    }
}
