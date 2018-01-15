package com.codecool.scc.services;

import com.codecool.scc.dao.FileReader;
import com.codecool.scc.view.OutputFormat;
import com.codecool.scc.view.OutputFormatter;
import com.codecool.scc.view.OutputFormatterFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    public void convert(File file) {
        try {
            List<String[]> data = fileReader.readData(file);
            OutputFormatter outputFormatter = outputFormatterFactory.createByFormat(OutputFormat.TABLE);
            outputFormatter.printToConsole(data);

        } catch (IOException e) {
            System.out.println("Wrong file name. Please check if such file exists.");
        }
    }

    public void convert(File file, OutputFormat outputFormat) {
        System.out.println("I convert CSV to output format");
    }

}
