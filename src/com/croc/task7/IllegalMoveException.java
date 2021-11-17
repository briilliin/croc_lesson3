package com.croc.task7;

public class IllegalMoveException extends Exception {
    private ChessPosition from, to;
    public IllegalMoveException(ChessPosition from, ChessPosition to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getMessage() {
        return String.format("конь так не ходит: %s -> %s", this.from.toString(), this.to.toString());
    }
}