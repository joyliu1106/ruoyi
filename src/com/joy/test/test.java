package com.joy.test;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        User user = new User(1, "");
        User user1 = new User(2, "");
        User user2 = new User(3, "哈哈");
        User user3 = new User(4, "");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);

        User vo = new User();
        StringBuffer idea = new StringBuffer();
        for (User u : list) {
            vo = list.get(list.size() - 1);
            if (vo.getName() != null && !vo.getName().equals("")) {
                idea.append(u.getName() + "/" + vo.getName());
            }
        }

        System.out.println(idea.toString());
    }
}
