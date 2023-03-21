package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user = new User(1l, "Daniel", "daniel@gmail", "123", true);
        User user2 = new User(2l, "Elena", "elena@gmail", "123456789", false);
        User user3 = new User(3l, "Elisa", "elena@gmail", "123", true);

//        var question1 = new Question1();
//        question1.inc(List.of(1l,2l,3l))
//                .doOnNext(System.out::println)
//                .subscribe();

//        var question2 = new Question2();
//        question2.countAdmins(List.of(user, user2, user3))
//                .doOnNext(System.out::println)
//                .subscribe();

        var question3 = new Question3();
        question3.userIsValid(user2)
                .subscribe();
    }
}
