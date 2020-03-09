package com.vertex.prof.homeworkRT.collections;

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

    public void markWinners(Map<Ticket, TheaterGoer> tickets) {

        int minMustacheLength = 10000;
        int minNumberOfBrooches = 10000;

        for (Map.Entry<Ticket, TheaterGoer> entry : tickets.entrySet()) {

            if ((entry.getValue().mustacheLength != 0) &&
                    (entry.getValue().mustacheLength < minMustacheLength)) {
                minMustacheLength = entry.getValue().mustacheLength;
            }
            if ((entry.getValue().numberOfBrooches != 0) &&
                    entry.getValue().numberOfBrooches < minNumberOfBrooches) {
                minNumberOfBrooches = entry.getValue().numberOfBrooches;
            }
        }

        for (Map.Entry<Ticket, TheaterGoer> entry : tickets.entrySet()) {

            if (entry.getValue().mustacheLength == minMustacheLength) {
                entry.getKey().win = true;
            }

            if (entry.getValue().numberOfBrooches == minNumberOfBrooches) {
                entry.getKey().win = true;
            }

        }
    }


    public HashSet<TheaterGoer> findActiveTicketBuyers(Map<Ticket, TheaterGoer> tickets) {
        List<TheaterGoer> ticketBuyers = new ArrayList<>(tickets.values());
        HashSet<TheaterGoer> activeTicketBuyers = new HashSet<>();
        return activeTicketBuyers;
    }

}

