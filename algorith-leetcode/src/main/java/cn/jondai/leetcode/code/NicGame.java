package cn.jondai.leetcode.code;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by JonDai on 2016/4/20.
 * Originally:
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 * The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 *
 * Translate:
 * 你正在和Nic一起玩游戏，规则: 在桌上有一堆小石子，你每一次只能拿走1~3个，谁最后拿完石子便就是赢家，你将第一个开始拿石子。
 * 你们俩个都非常聪明并且很有游戏的谋略，写出一个函数,给定石子的个数，来确定你是否能赢得比赛吧!
 * 比如： 有4个石子，那么你都无法取得游戏的胜利: 无论你第一次拿走1个还是2个还是3个，最后的石子一定都是你的朋友拿走。
 */
public class NicGame {


    public static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    @Test
    public void test() {
        boolean isWin = NicGame.canWinNim(9);
        assertTrue(isWin);
    }
}
