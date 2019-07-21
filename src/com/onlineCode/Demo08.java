package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 15:31
 */
public class Demo08 {
    public int JumpFloor(int target) {
        if (target == 0)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);

    }
    public int JumpFloorII(int target) {
       // return (int)Math.pow(2,target -1);
        return 2 << (target - 1);

    }
    public int RectCover(int target) {
        if(target <= 0) {
            return 0;
        }
        if (target == 1 || target == 2) {
            return target;
        }
        return RectCover(target -1) + RectCover(target - 2);

    }
}
