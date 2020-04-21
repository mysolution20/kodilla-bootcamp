package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.World;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("********************************");
        System.out.println();

//        World world = new World();
//        world.getContinents();

        System.out.println();
        System.out.println();
        System.out.println("********************************");
        System.out.println();
        System.out.println("7.5. Wzbogacenie wiedzy o IntStream");
        System.out.println();
        System.out.println();

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println(ArrayOperations.getAverage(numbers));

        System.out.println();
        System.out.println();
        System.out.println("********************************");
        System.out.println();
        System.out.println();


        System.out.println("----- 7.3. Poznanie funkcji stream(), filter(), map() i collect()-----");
        System.out.println();


        Forum forum = new Forum();

        Map<Integer, ForumUser> theForumUserList = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() < 2000)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        System.out.println("# elements: " + theForumUserList.size());

        theForumUserList.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);


        System.out.println();
        System.out.println("********************************");
        System.out.println();


        BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));      //  UWAGA  Collectors.joining()

        System.out.println(theResultStringOfBooks);


        System.out.println();
        System.out.println("********************************");
        System.out.println();


        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));     //  UWAGA  Collectors.toMap()

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        System.out.println();
        System.out.println("********************************");
        System.out.println();


        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);


        System.out.println();
        System.out.println("********************************");
        System.out.println();


        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());                         //  UWAGA  Collectors.toList()

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks
                .forEach(System.out::println);


        System.out.println();
        System.out.println("********************************");
    }
}
