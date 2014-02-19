package io.mercer.dp.command;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CommandTest {
    @Test
    public void testExecute() throws Exception {
        Document document = new Document();
        Editor editor = new Editor();

        editor.storeAndExecute(new Add(document, "test"));
        assertThat(document.getContent()).isEqualTo("test");

        editor.storeAndExecute(new DeleteOneCharacter(document));
        assertThat(document.getContent()).isEqualTo("tes");

        editor.undo();
        assertThat(document.getContent()).isEqualTo("test");

        editor.undo();
        assertThat(document.getContent()).isEmpty();
    }
}
