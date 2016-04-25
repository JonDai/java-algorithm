package cn.jondai.leetcode.medium;

import org.junit.Test;

/**
 * Created by JonDai on 2016/4/20.
 *
 * Originally:
 * There are n bulbs that are initially off. You first turn on all the bulbs.
 * Then, you turn off every second bulb. On the third round, you toggle every third bulb
 * (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb.
 * For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds.
 *
 * Translate:
 * 假设有 n 个已经关掉的灯，
 * 第一轮：你打开所有的灯，
 * 第二轮：关掉每第二个灯（每隔一个灯就关掉）
 * 第三轮：每第三个灯就切换一下（如果开着就关掉， 如果关掉的打开）
 * 第 i 轮， 每 i 灯切换一下...
 * 最后在第N轮后，你只能切换最后一个灯了。
 * N轮之后，找出还有多少个灯是打开的
 */
public class BulbSwitcher {

    public static double solution(int n) {
       return  Math.sqrt(n);
    }

    @Test
    public void test(){
        System.out.println(solution(6));
    }
}
