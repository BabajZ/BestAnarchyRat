package com.example.examplemod.RoflXd.Utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Downloader {
    public static void download(String url, File file, boolean forceDownload) {
        try {
            if(forceDownload || !file.exists()) FileUtils.copyURLToFile(new URL(url), file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}