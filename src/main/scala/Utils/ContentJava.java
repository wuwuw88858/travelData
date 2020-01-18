package Utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * @author zhijie
 * @date 2020-01-18 11:53
 */
public class ContentJava {

    public static char getSingleContent() {
        String str = "";
        int hightPos; //
        int lowPos;
        Random random = new Random();
        byte[] b = new byte[2];
        hightPos = (Math.abs(random.nextInt(36)) + 176);
        lowPos = (Math.abs(random.nextInt(93)) + 161);

        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str= new String(b, "GBK");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return str.charAt(0);

    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(System.currentTimeMillis() - random.nextInt(99999999));
    }
}
