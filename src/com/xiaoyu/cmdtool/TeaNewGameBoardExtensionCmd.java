package com.xiaoyu.cmdtool;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * 老师端新建棋局(可扩展)
 * Created by ck on 2017/8/2.
 * update:新建 67号命令
 */

public class TeaNewGameBoardExtensionCmd{


    public final ChessType type;

    //新建棋局名称

    public String name;

    // 1 有规则 0 无规则
    public int hasRule;

    public Ext ext;

    private String extJSON = "";

    public static final int MIN_SUPPORT_CMD_VERSION = 13;

    public static class Ext {
        /**
         * 0，老师黑子，学生白子
         * 1，老师白子，学生黑子
         * 2，老师vs老师
         * 3，学生vs学生
         */
        private int role = -1;

        /**
         * 0黑先，1白先
         */
        private int order = -1;

        /**
         * 0初始棋盘，1当前棋盘，2历史棋盘
         */
        private int layout = -1;

        /**
         * 历史棋盘序号
         */
        private int layoutIndex = -1;

        /**
         * 白方名称
         */
        private String whiteName;
        /**
         * 白方头像
         */
        private String whiteUrl;
        /**
         * 黑方名称
         */
        private String blackName;
        /**
         * 黑方头像
         */
        private String blackUrl;

        private Ext() {

        }

        public static class Builder {
            private int role = -1;
            private int order = -1;
            private int layout = -1;
            private int layoutIndex = -1;
            private String whiteName;
            private String whiteUrl;
            private String blackName;
            private String blackUrl;

            public Builder setRole(int role) {
                this.role = role;
                return this;
            }

            public Builder setOrder(int order) {
                this.order = order;
                return this;
            }

            public Builder setLayout(int layout) {
                this.layout = layout;
                return this;
            }

            public Builder setLayoutIndex(int layoutIndex) {
                this.layoutIndex = layoutIndex;
                return this;
            }

            public Builder setWhiteName(String whiteName) {
                this.whiteName = whiteName;
                return this;
            }

            public Builder setWhiteUrl(String whiteUrl) {
                this.whiteUrl = whiteUrl;
                return this;
            }

            public Builder setBlackName(String blackName) {
                this.blackName = blackName;
                return this;
            }

            public Builder setBlackUrl(String blackUrl) {
                this.blackUrl = blackUrl;
                return this;
            }


            public Ext build() {
                Ext ext = new Ext();
                ext.role = this.role;
                ext.order = this.order;
                ext.layout = this.layout;
                ext.layoutIndex = this.layoutIndex;
                ext.blackName = this.blackName;
                ext.blackUrl = this.blackUrl;
                ext.whiteName = this.whiteName;
                ext.whiteUrl = this.whiteUrl;
                return ext;
            }
        }
    }

    public TeaNewGameBoardExtensionCmd(ChessType type, String name, int hasRule, Ext ext) {
        this.type = type;
        this.name = name;
        this.hasRule = hasRule;
        this.ext = ext;
    }


    public List<Byte> toByte() {
        return ParserManager.getPkgBytes(ActionStep.TEA_NEW_GAME_BOARD_EXTENSION, this.type.getCode(), this.name, this.hasRule, JSON.toJSONString(ext));
    }

}
