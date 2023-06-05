package bt04.ex2.a;
import java.util.Arrays;

public class GiftSorter {
    public String sortGiftCode(String giftCode) {
        char[] code = giftCode.toCharArray();
        Arrays.sort(code);
        return String.valueOf(code);
    }
    public static void main(String[] args){
        GiftSorter sorter = new GiftSorter();
        System.out.println(sorter.sortGiftCode("asdfsgfgffdsiuuiuommv"));
    }
}
