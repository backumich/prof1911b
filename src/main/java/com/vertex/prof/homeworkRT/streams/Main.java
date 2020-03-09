package com.vertex.prof.homeworkRT.streams;

import static streams.TheaterGoer.gentlemenLine;
import static streams.TheaterGoer.ladiesLine;

public class Main {
    public static void main(String[] args) {
        TheaterGoer theaterGoer0 = new TheaterGoer("James", Gender.GENTLEMAN, 10);
        TheaterGoer theaterGoer1 = new TheaterGoer("Sam", Gender.GENTLEMAN, 15);
        TheaterGoer theaterGoer5 = new TheaterGoer("Jane", Gender.LADY, true, 2);
        TheaterGoer theaterGoer2 = new TheaterGoer("Charles", Gender.GENTLEMAN, 10);
        TheaterGoer theaterGoer4 = new TheaterGoer("Mary", Gender.LADY, false, 5);
        TheaterGoer theaterGoer3 = new TheaterGoer("John", Gender.GENTLEMAN, 25);
        TheaterGoer theaterGoer6 = new TheaterGoer("Agatha", Gender.LADY, false, 2);

        for (TheaterGoer gentleman : gentlemenLine) {
            ladiesLine.add(gentleman);
        }
        System.out.println(ladiesLine);
        System.out.println();

        //2.0

        BookingOffice bookingOffice = new BookingOffice();

        bookingOffice.buyTicket(theaterGoer0, 1, 10, 15);
        bookingOffice.buyTicket(theaterGoer1, 2, 3, 6);
        bookingOffice.buyTicket(theaterGoer0, 3, 5, 12);
        bookingOffice.buyTicket(theaterGoer2, 4, 6, 13);
        bookingOffice.buyTicket(theaterGoer3, 5, 7, 14);
        bookingOffice.buyTicket(theaterGoer4, 6, 12, 18);
        bookingOffice.buyTicket(theaterGoer5, 7, 15, 21);
        bookingOffice.buyTicket(theaterGoer6, 8, 20, 30);

        System.out.println(bookingOffice.tickets);
        System.out.println();

        System.out.println(bookingOffice.findMinMustacheLength(bookingOffice.tickets));
        System.out.println(bookingOffice.findMinNumberOfBrooches(bookingOffice.tickets));

        bookingOffice.markWinners(bookingOffice.tickets);

        bookingOffice.tickets.forEach((k, v) -> {
            if (k.win == true) {
                if (v.gender == Gender.LADY) {
                    System.out.println("Ticket number is " + k.number + ". Number of brooches is " + v.numberOfBrooches);
                }
                if (v.gender == Gender.GENTLEMAN) {
                    System.out.println("Ticket number is " + k.number + ". Mustache lenght is " + v.mustacheLength);
                }
            }
        });
    }
}
