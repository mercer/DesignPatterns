package io.mercer.dp.visitor;

import org.junit.Before;
import org.junit.Test;

public class VisitorTest {

    private File root;
    @Before
    public void setup() {
        root = new File("", true);
        root.addChild(home());
        root.addChild(var());
    }

    @Test
    public void printDirectoryStructure() {
        Visitor printer = new PrinterVisitor();
        root.accept(printer);
    }

    @Test
    public void backupDirectoryStructure() {
        Visitor printer = new BackupVisitor();
        root.accept(printer);
    }

    private File var() {
        File output = new File("var", true);
        output.addChild(new File("file.ini", false));
        output.addChild(new File("file.txt", false));
        return output;
    }

    private File home() {
        File output = new File("home", true);
        output.addChild(new File("settings.xml", false));
        output.addChild(new File("document.pdf", false));
        return output;
    }

}