public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // User types text
        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.addState("Hello, World! How are you?");

        // Output: "Hello, World! How are you?"
        editor.displayCurrentState();

        // Undo operations
        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        // Redo operation
        editor.redo();
        editor.displayCurrentState();

        // Undo beyond limit
        editor.undo();
        editor.undo();
        editor.undo();  
    }
}