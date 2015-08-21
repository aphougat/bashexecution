package com.itembryo;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*ProcessBuilder pb = new ProcessBuilder("setantenv.sh", "myArg1", "myArg2");
        Map<String, String> env = pb.environment();
        env.put("VAR1", "myValue");
        env.remove("OTHERVAR");
        env.put("VAR2", env.get("VAR1") + "suffix");
        pb.directory(new File("/Users/abhay/Desktop"));
        try {
            Process p = pb.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }*/



        ProcessBuilder pb = new ProcessBuilder("/Users/abhay/Desktop/setantenv.sh");
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
