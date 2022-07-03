package com.alexenderboot.maven.core;
import lombok.Cleanup;
import java.io.*;

public class CleanupExample {
    public static void run(String[] args) throws IOException {
        @Cleanup InputStream in = new FileInputStream(args[0]);
        @Cleanup OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);  //the number of bytes in b
            if (r == -1) break;
            out.write(b, 0, r);    //writes b in outfile
        }
    }
}
