package com.croc.task7;

public class Main {

        public static void main(String[] args) {

                if (args.length < 2) {
                        System.out.println("данные введены неправильно");
                        return;
                }

                try {
                        for (int i = 0; i < args.length - 1; i++) {
                                ChessPosition from = parse(args[i]);
                                ChessPosition to = parse(args[i + 1]);
                                horseMove(from, to);
                        }

                        System.out.println("OK");

                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }

        }

        static ChessPosition parse(String position) throws IllegalPositionException {
                int x = (int)position.charAt(0) - 97;
                int y = Integer.parseInt(String.copyValueOf(position.toCharArray(), 1, 1)) - 1;
                return new ChessPosition(x, y);
        }


        public static void horseMove(ChessPosition from, ChessPosition to) throws IllegalMoveException {
                int dx = Math.abs(from.getX() - to.getX());
                int dy = Math.abs(from.getY() - to.getY());
                if (!((dx == 2 && dy == 1) || (dx == 1 && dy == 2))) throw new IllegalMoveException(from, to);
        }
}
