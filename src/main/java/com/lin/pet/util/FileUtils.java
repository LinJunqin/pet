package com.lin.pet.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URLConnection;

/**
 * Created by xhans on 2016/4/11.
 */
public class FileUtils {
    public static String getFileType(byte[] file) throws IOException {
        return URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(file));
    }

}
