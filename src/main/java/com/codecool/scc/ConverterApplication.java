package com.codecool.scc;

import java.io.File;

public class ConverterApplication {

    public static void main(String[] args) {

        File file;

        switch (args.length) {

            case 0:
                System.out.println("No input file defined");
                break;

            case 1:
                file = new File(args[0]);
                break;

            case 2:
                file = new File(args[1]);
                break;

            default:
                System.out.println("Number of arguments should be 1 or 2");
        }

    }
}
