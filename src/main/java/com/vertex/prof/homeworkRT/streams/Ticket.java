package com.vertex.prof.homeworkRT.streams;

import java.util.Objects;

public class Ticket {

    public int number;
    private int seat;
    private int row;
    public boolean win = false;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number &&
                seat == ticket.seat &&
                row == ticket.row;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, seat, row);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", seat=" + seat +
                ", row=" + row +
                ", win=" + win +
                '}';
    }
}
