package SwordOffer;

/**
 * @author YanQiKing
 * @date 2019/9/1 15:24
 */
public class 替换空格 {
    public String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str = str.replace(i,i+1,"%20");
            }
        }
        return str.toString();

    }
}
