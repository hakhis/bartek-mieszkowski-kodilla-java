package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(1990, 6, 28);
        System.out.println(data1.getYear() - data2.getYear());

        Map<Integer, ForumUser> theFilteredListOfUsers = forum.getListOfUsers().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> LocalDate.now().getYear() - user.getBirthDate().getYear() >= 20)
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));
        System.out.println("Amount of users passing criteria: " + theFilteredListOfUsers.size());
        theFilteredListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
