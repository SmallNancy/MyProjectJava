package SwordOffer;

/**
 * @author YanQiKing
 * @date 2019/9/1 15:19
 */
public class 二维数组中的查找 {
    public boolean Find(int target, int [][] array) {
        for(int i = 0; i < array.length;i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (target == array[i][j]){
                    return true;
                }
            }
        }
        return false;

    }
}
