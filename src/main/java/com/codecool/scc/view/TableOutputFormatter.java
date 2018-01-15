package com.codecool.scc.view;

import org.sk.PrettyTable;

import java.util.List;

public class TableOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {
        PrettyTable prettyTable = new PrettyTable(data.get(0));

        for (int i = 0; i < data.size(); i++) {
            prettyTable.addRow(data.get(i));
        }
        System.out.println(prettyTable);
    }
}
