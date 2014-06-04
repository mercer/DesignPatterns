package io.mercer.dp.visitor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrinterVisitor implements Visitor {
    private static final Logger LOG = LogManager.getLogger(PrinterVisitor.class);

    @Override
    public void visit(File file) {
        LOG.debug(tabs(file.getLevel()) + file.getName() + end(file.isDirectory()));
    }

    private String end(boolean isDirectory) {
        return isDirectory ? "/" : "";
    }

    private String tabs(int level) {
        String output = "";
        for (int i = 0; i< level; i++) {
            output += "    ";
        }
        return output;
    }
}
