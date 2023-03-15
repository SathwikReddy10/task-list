package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.ArrayList;

public class ManageProject implements ManageService {
    @Override
    public void manage(String commandLine, PrintWriter out) {
        String[] subcommandRest = commandLine.split(" ", 2);
        String name = subcommandRest[1];
        TaskList.tasks.put(name, new ArrayList<>());
    }
}
