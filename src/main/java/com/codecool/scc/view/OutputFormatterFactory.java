package com.codecool.scc.view;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(OutputFormat outputFormat) {
        OutputFormatter outputFormatter = null;

        switch (outputFormat) {
            case XML:
                outputFormatter = new XmlOutputFormatter();
                break;

            case JSON:
                outputFormatter = new JsonOutputFormatter();
                break;

            case TABLE:
                outputFormatter = new TableOutputFormatter();
                break;
        }

        return outputFormatter;
    }
}
