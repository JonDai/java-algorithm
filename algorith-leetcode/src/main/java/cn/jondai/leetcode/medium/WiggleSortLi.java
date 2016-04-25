package cn.jondai.leetcode.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JonDai on 2016/4/25.
 *
 * <link>https://leetcode.com/problems/wiggle-sort-ii/</link>
 *
 * Originally:
 * Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....

 Example:
 (1) Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
 (2) Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].

 Note:
 You may assume all input has valid answer.  你可以假设所有的输入都有正确的答案。

 Follow Up:
 Can you do it in O(n) time and/or in-place with O(1) extra space?
 *
 */

public class WiggleSortLi {

    //This is mine solution
    public void wiggleSort(Integer... nums) {
        List<Integer> numList = Arrays.asList(nums);
        //先进行一遍排序
        numList.sort((n1,n2) -> n1.compareTo(n2));
        //分组
        List<Integer> nums1 = numList.subList(0, numList.size() / 2);
        List<Integer> nums2 = numList.subList(numList.size() /2 , numList.size());
        List<Integer> newnums = nums1.get(nums1.size()-1) < nums2.get(0) ? mergeOne(numList , nums1, nums2) : mergeTwo(numList , nums1, nums2);
        newnums.forEach(n -> System.out.println(n));
    }

    private List<Integer> mergeOne(List<Integer> numList , List<Integer> nums1 ,List<Integer> nums2){
        List<Integer> newnums = new ArrayList<>();
        int x=0 ,y=0;
        for(int j = 0; j< numList.size(); j++){
            if(j != 0 && j % 2 != 0 ){
                newnums.add(nums2.get(x));
                x++;
            }else{
                newnums.add(nums1.get(y));
                y++;
            }
        }
        return newnums;
    }

    private List<Integer> mergeTwo(List<Integer> numList , List<Integer> nums1 ,List<Integer> nums2){
        List<Integer> newnums = new ArrayList<>();
        int x=0 ,y=0;
        nums2.sort( (n1,n2) -> n2.compareTo(n1));
        nums2.forEach(n -> System.out.println(n));
        return mergeOne(numList , nums1 ,nums2);
    }

    @Test
    public void mine(){
        wiggleSort(1, 5, 1, 1, 6, 4);
//        wiggleSort(5,6,4,5);
    }



}
