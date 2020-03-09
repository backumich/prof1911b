package com.vertex.prof.homeworkRT.streams;

import java.util.*;

public class BookingOffice {

    Map<Ticket, TheaterGoer> tickets = new HashMap<>();

    public Map buyTicket(TheaterGoer theaterGoer, int number, int row, int seat) {

        Ticket ticket = new Ticket();
        ticket.setNumber(number);
        ticket.setRow(row);
        ticket.setSeat(seat);

        tickets.put(ticket, theaterGoer);

        return tickets;
    }

    Integer findMinMustacheLength(Map<Ticket, TheaterGoer> tickets) {
        List<TheaterGoer> theaterGoers = new ArrayList<>(tickets.values());
        return theaterGoers.stream()
                .map(v -> v.mustacheLength)
                .filter(v -> v != 0)
                .min(Comparator.naturalOrder())
                .get();
    }

    Integer findMinNumberOfBrooches(Map<Ticket, TheaterGoer> tickets) {
        List<TheaterGoer> theaterGoers = new ArrayList<>(tickets.values());
        return theaterGoers.stream()
                .map(v -> v.numberOfBrooches)
                .filter(v -> v != 0)
                .min(Comparator.naturalOrder())
                .get();
    }

    public void markWinners(Map<Ticket, TheaterGoer> tickets) {
        int minMustacheLength = findMinMustacheLength(tickets);
        int minNumberOfBrooches = findMinNumberOfBrooches(tickets);

        tickets.forEach((k, v) ->
        {
            if (v.mustacheLength == minMustacheLength) {
                k.win = true;
            }

            if (v.numberOfBrooches == minNumberOfBrooches) {
                k.win = true;
            }
        });

    }
}