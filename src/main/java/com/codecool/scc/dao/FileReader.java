package com.codecool.scc.dao;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileReader {

    public List<String[]> readData(File file) throws IOException {
        CSVReader csvReader = new CSVReader(new java.io.FileReader(file));
        return csvReader.readAll();
    }
}
