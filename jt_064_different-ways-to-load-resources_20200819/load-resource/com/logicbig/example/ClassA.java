package com.logicbig.example;


import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ClassA {

    private static final String line = "-----------------------------------------";

    private void loadResource (String resource) throws IOException {
        URL u = this.getClass().getResource(resource);
        loadResourceByUrl(u, resource);
    }

    private void loadResourceWithContextLoader (String resource) throws IOException {
        URL u = Thread.currentThread().getContextClassLoader().getResource(resource);
        loadResourceByUrl(u, resource);
    }

    private void loadResourceWithSystemClassLoader (String resource) throws IOException {
        URL u = ClassLoader.getSystemClassLoader().getResource(resource);
        loadResourceByUrl(u, resource);
    }

    private void loadResourceByUrl (URL u, String resource) throws IOException {
        System.out.println("-> attempting input resource: "+resource);
        if (u != null) {
            String path = u.getPath();
            path = path.replaceFirst("^/(.:/)", "$1");
            System.out.println("    absolute resource path found :\n    " + path);
            String s = new String(Files.readAllBytes(Paths.get(path)));
            System.out.println("    file content: "+s);
        } else {
            System.out.println("    no resource found: " + resource);
        }
    }

    public static void main (String[] args) throws IOException {
        ClassA a = new ClassA();
        System.out.println(line+"\nusing this.getClass().getResource\n"+line);
        a.loadResource("test-pkg-resource.txt");
        a.loadResource("/test-pkg-resource.txt");
        a.loadResource("root-resource.txt");
        a.loadResource("/root-resource.txt");

        System.out.println(line+"\n using current thread context loader\n"+line);
        a.loadResourceWithContextLoader("test-pkg-resource.txt");
        a.loadResourceWithContextLoader("/test-pkg-resource.txt");
        a.loadResourceWithContextLoader("root-resource.txt");
        a.loadResourceWithContextLoader("/root-resource.txt");


        System.out.println(line+"\n using ClassLoader.getSystemClassLoader()\n"+line);
        a.loadResourceWithSystemClassLoader("test-pkg-resource.txt");
        a.loadResourceWithSystemClassLoader("/test-pkg-resource.txt");
        a.loadResourceWithSystemClassLoader("root-resource.txt");
        a.loadResourceWithSystemClassLoader("/root-resource.txt");

    }
}
