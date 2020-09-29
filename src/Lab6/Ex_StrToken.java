package Lab6;

import java.util.StringTokenizer;

public class Ex_StrToken {

    public static void main(String[] args) {

        String msg = "Artificial intelligence is a technology" +
                " that is already impacting how users interact with," +
                " and are affected by the Internet. In the near future," +
                " its impact is likely to only continue to grow." +
                " AI has the potential to vastly change the way that humans interact," +
                " not only with the digital world, but also with each other," +
                " through their work and through other socioeconomic institutions" +
                " – for better or for worse.";

        System.out.println(msg.length());

        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());  // return word count as integer


        while (myToken.hasMoreTokens()){
            System.out.println(myToken.nextToken());
        }
    }
}
