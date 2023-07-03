package utils;
PlatiDiverseGabriela
import java.util.Random;
public class utils {
    private static final Random random;

    static{
        random = new Random();
    }

    public static String randomUser(){
        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};
        String value = "";

        for(int i = 5; i<6;i++) {
            if(i == 5) {
                value = value + random.nextInt(100);
            }else {
 value = value + characters[random.nextInt(4)];
            }
        }
        return value;
       public static int randomNumber(int number) {
        return random.nextInt(number);
    }
    }

import java.util.Random;

public class utils {
    private static final Random random;

    static {
        random = new Random();

    }

    public static String randomUser() {
        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};
        String value = "";

        for (int i = 5; i < 6; i++) {
            if (i == 5) {
                value = value + random.nextInt(100);
            } else {
 master
                value = value + characters[random.nextInt(4)];
            }
        }
        return value;
    }
PlatiDiverseGabriela


 master
    public static int randomNumber(int number) {
        return random.nextInt(number);
    }
}
< PlatiDiverseGabriela


 master
