package net.pod.authenticsmithing.util;

import net.pod.authenticsmithing.AuthenticSmithingMod;

import java.io.File;
import java.net.URL;

public class FileHelper {
    public static String findFileInResources(String fileNameToFind) {
        ClassLoader classLoader = FileHelper.class.getClassLoader();
        URL resourceUrl = classLoader.getResource("main/resources/assets/"
                + AuthenticSmithingMod.MODID);
        if (resourceUrl == null) {
            return null;
        }
        File resourcesFolder = new File(resourceUrl.getFile());
        File resource = seekFile(resourcesFolder, fileNameToFind + ".png");
        if (resource == null) {
            return null;
        }
        return getRelativePath(resource);
    }

    public static File seekFile(File folder, String filename) {
        File[] files = folder.listFiles();
        if (files == null) {
            return null;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                return seekFile(file, filename);
            } else if (file.getName().equals(filename)) {
                return file;
            }
        }
        return null;
    }

    public static String getRelativePath(File file) {
        String absolutePath = file.getAbsolutePath();
        String resourcesPath = FileHelper.class.getClassLoader().getResource("resources")
                .getPath() + File.pathSeparator + AuthenticSmithingMod.MODID + File.pathSeparator;
        return absolutePath.replace(resourcesPath, "");
    }
}
