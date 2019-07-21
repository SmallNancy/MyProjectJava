package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author YanQiKing
 * @date 2019/7/21 14:21
 */
public class QueTest {
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();
        deque.add('(');
        deque.add('{');
        System.out.println(deque.getLast());
        Character c = deque.removeLast();
        System.out.println(deque.peek());
    }
}
