package com.xiaoyu.cmdtool;


public enum ChessType {

    // 围棋 9 * 9
    Mode_Weiqi_9x9(0, 9),

    // 围棋 13 * 13
    Mode_Weiqi_13x13(1, 13),

    // 围棋 19 * 19
    Mode_Weiqi_19x19(2, 19),

    // 国际象棋
    Mode_Chess(3, 9);

    // 线的条数, 因为是正方形，所以横坐标和纵坐标的数量是一样的
    private int lines;
    private int code;

    ChessType(int code, int lines) {
        this.code = code;
        this.lines = lines;
    }

    public int getLines() {
        return lines;
    }

    public int getCode() {
        return code;
    }


    public static ChessType getTypeByCode(int code) {
        switch (code) {
            case 0:
                return Mode_Weiqi_9x9;
            case 1:
                return Mode_Weiqi_13x13;
            case 2:
                return Mode_Weiqi_19x19;
            case 3:
                return Mode_Chess;
        }
        return null;
    }


}
