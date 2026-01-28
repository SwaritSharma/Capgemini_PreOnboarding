package LinkedList.TextEditor;

public class TextEditorTest {

    public static void main(String[] args) {

        TextEditorUndoRedo editor = new TextEditorUndoRedo();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World!!");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Java");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();
    }
}
