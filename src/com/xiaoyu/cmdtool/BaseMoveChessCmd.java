package com.xiaoyu.cmdtool;

import java.util.List;

/**
 * Created by ck on 2017/7/24.
 */

public abstract class BaseMoveChessCmd {
    /**
     * 围棋: 0 黑棋， 1 白棋
     * 国际象棋: 白色 0 兵,   1 车,  2 马，  3 相，   4 后， 5皇
     * 黑色 10 兵, 11 车,  12 马， 13 相， 14 后， 15皇
     */
    public final int role;

    // 开始棋盘的横坐标
    public final int x;//-1 表示 增加棋子

    // 开始棋盘纵坐标
    public final int y;

    // 落子棋盘的横坐标
    public final int x2; //-1 表示 移除棋子

    // 落子棋盘纵坐标
    public final int y2;

    public boolean meSent = true;

    public BaseMoveChessCmd(int role, int x, int y, int x2, int y2) {
        this.role = role;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public List<Byte> toByte() {
        return ParserManager.getPkgBytes(ActionStep.TEA_MOVE_CHESS, this.role, this.x, this.y, this.x2, this.y2);
    }

}
