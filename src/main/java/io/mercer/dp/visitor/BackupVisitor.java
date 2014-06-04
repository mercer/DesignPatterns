package io.mercer.dp.visitor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BackupVisitor implements Visitor {
    private static final Logger LOG = LogManager.getLogger(BackupVisitor.class);
    @Override
    public void visit(File file) {
        LOG.debug("backing up: " + file.getName());
    }
}
