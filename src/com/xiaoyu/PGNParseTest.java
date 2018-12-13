package com.xiaoyu;

import com.xiaoyu.pgntool.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

public class PGNParseTest {

    /**
     * @param args
     * @throws IOException
     * @throws PGNParseException
     * @throws MalformedMoveException
     * @throws NullPointerException
     */
    public static void main(String[] args) throws IOException, PGNParseException, NullPointerException, MalformedMoveException {
        if (args.length == 0) {
            System.out.println("Usage:");
            System.out.println("\tpgn_path");
        }

        File file = new File("/Users/yaodonglv/Desktop/XQS文档/test6.pgn");
        File file2 = new File("/Users/yaodonglv/Desktop/XQS文档/test3.pgn");
        URL url = new URL("http://127.0.0.1:8080/test.pgn");
        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        PGNSource source = new PGNSource(file2);
        Iterator<PGNGame> i = source.listGames().iterator();

        while (i.hasNext()) {
            PGNGame game = i.next();

            System.out.println("############################");
            Iterator<String> tagsIterator = game.getTagKeysIterator();

            while (tagsIterator.hasNext()) {
                String key = tagsIterator.next();
                System.out.println(key + " {" + game.getTag(key) + "}");
            }

            System.out.println();
            Iterator<PGNMove> movesIterator = game.getMovesIterator();
            int num = 1;

            while (movesIterator.hasNext()) {
                PGNMove move = movesIterator.next();

                if (num % 2 == 1 && !move.isEndGameMarked()) {
                    System.out.print((num + 1) / 2 + ". ");
                }

                if (!move.isEndGameMarked()) {
                    String color = move.getColor() == Color.white ? "白" : "黑";
                    System.out.print(color + "." + move.getPiece());
                }

                num++;

                if (move.isEndGameMarked()) {
                    System.out.print("(" + move.getMove() + ")");
                } else if (move.isKingSideCastle()) {
                    System.out.print("[O-O] ");
                } else if (move.isQueenSideCastle()) {
                    System.out.print("[O-O-O] ");
                } else {
                    System.out.print("[" + move.getFromSquare() + "]->[" + move.getToSquare() + "] ");
                }
            }

            System.out.println();
        }
    }

}