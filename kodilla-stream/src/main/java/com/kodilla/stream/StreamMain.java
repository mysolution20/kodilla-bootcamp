package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        System.out.println("********************************");
        System.out.println();
        System.out.println("----- 7.3. Poznanie funkcji stream(), filter(), map() i collect()-----");
        System.out.println();


    Forum forum = new Forum();

        Map<Integer,ForumUser> theForumUserList = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getGender() == 'M')
                .filter(ForumUser -> ForumUser.getBirthDay().getYear() < 2000)
                .filter(ForumUser -> ForumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        System.out.println("# elements: " + theForumUserList.size());

        theForumUserList.entrySet().stream()
                .map( entry -> entry.getKey()+":"+entry.getValue())
                .forEach(System.out:: println);



        System.out.println();
        System.out.println("********************************");
        System.out.println();


        BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));      //  UWAGA  Collectors.joining()

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







   /*     System.out.println("********************************");
        System.out.println();

        People.getList().stream()
                .map(s -> s.toUpperCase())       //  lub   .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);



        System.out.println();
        System.out.println("********************************");
   */


     /*   String text = "AbEcAdLo Z pIeCa SpAdLo";

        System.out.println("********************************");
        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(text ,(s) -> s );
        poemBeautifier.beautify(text ,(s) -> s.toLowerCase() );
        poemBeautifier.beautify(text ,(s) -> s.toUpperCase() );
        poemBeautifier.beautify(text ,(s) -> s.replaceAll("ABECADLO","tranwaj") );


        System.out.println();
        System.out.println("********************************");
*/

//        System.out.println();
//        System.out.println("**********************");
//        System.out.println();


 /*       System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
*/
/*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
*/




//        3.
/*        Processor processor = new Processor();
        processor.execute(()-> System.out.println("This is an example text."));*/

//        2.
/*      Processor processor = new Processor();
        Executor codeToExecute = ()-> System.out.println("This is an example text.");
        processor.execute(codeToExecute);*/

//        1.
/*      Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);*/


    }
}
