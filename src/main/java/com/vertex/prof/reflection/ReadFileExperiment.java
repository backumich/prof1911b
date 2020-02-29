package com.vertex.prof.reflection;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileExperiment {

    private static Logger logger = Logger.getLogger(ReadFileExperiment.class);

    public static void main(String[] args) {
        logger.debug("Starting main method");

        URL classResource = ReadFileExperiment.class.getResource("test.txt");
        URL classLoaderResource = ReadFileExperiment.class.getClassLoader().getResource("test.txt");


        try {
            printFileContent(classResource);
        } catch (Throwable t){
            logger.error("Can't find the file", t);
//            System.out.println(t);
//            throw new RuntimeException("Message", t);
//            t.printStackTrace();

        }


        try {
            printFileContent(classLoaderResource);
        } catch (Throwable t){
//            System.out.println(t);
            logger.error("Can't find the file", t);
//            t.printStackTrace();
        }

        logger.debug("Main method is finished");
    }

    private static void printFileContent(URL classResource) throws URISyntaxException, IOException {
        Path classPath = Paths.get(classResource.toURI());
        logger.info(Files.readAllLines(classPath));
    }
}
