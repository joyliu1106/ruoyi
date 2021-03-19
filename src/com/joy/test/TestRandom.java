package com.joy.test;

import java.util.ArrayList;
import java.util.List;

public class TestRandom {
    public static void main(String[] args) {
        System.out.println(getOnlyCardNum(1110 + ""));
    }

    /**
     * 查询当前card_num是否唯一
     */
    public static String getOnlyCardNum(String companyId) {
        //ids相当于数据库的cardNums
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ids.add(111 + "" + i);
        }
        String cardId = companyId;
        while (true) {
            if (!ids.contains(cardId)) {
                break;
            } else {
                //一已存在该cardNum
                for (int i = 0; i < 15; i++) {
                    cardId = Integer.parseInt(companyId) + i + "";
                    continue;
                }
            }
        }
        return cardId;
    }
}
