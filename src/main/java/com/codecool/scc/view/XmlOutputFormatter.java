package com.codecool.scc.view;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {
        System.out.println("printedXmlHere!");
    }
}
