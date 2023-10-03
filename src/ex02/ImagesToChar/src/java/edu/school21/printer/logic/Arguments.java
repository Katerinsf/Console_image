package edu.school21.printer.logic;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=")
public class Arguments {
    @Parameter(
            names = "--white",
            required = true
    )
    private String white;

    @Parameter(
            names = "--black",
            required = true
    )
    private String black;

    public String getWhite() {
        return white;
    }

    public String getBlack() {
        return black;
    }
}
