package com.example.examplemod.Hacks.Print.ChatListner;

import net.minecraft.client.Minecraft;

public class ServerUtils {

    private static Minecraft mc = Minecraft.getMinecraft();

    public static boolean isOnServer() {
        if(mc.getCurrentServerData() != null) {
            return true;
        }
        return false;
    }
}