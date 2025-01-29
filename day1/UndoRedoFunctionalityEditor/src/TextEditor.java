class TextEditor {
    private TextState head, current;
    private int historyLimit = 10;
    private int historySize = 0;

    public TextEditor() {
        head = current = new TextState(""); // Initial empty state
    }

    // Add a new state (record an action)**
    public void addState(String newText) {
        TextState newState = new TextState(newText);

        // Remove forward history (redo stack) if exists
        current.next = null;

        // Link new state to the doubly linked list
        newState.prev = current;
        current.next = newState;
        current = newState;

        // Manage history size
        historySize++;
        if (historySize > historyLimit) {
            head = head.next;  // Remove oldest state
            head.prev = null;
            historySize--;
        }
    }

    // Undo: Move to the previous state**
    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Undo not possible!");
        }
    }

    // Redo: Move to the next state**
    public void redo() {
        if (current.next != null) {
            current = current.next;
        } else {
            System.out.println("Redo not possible!");
        }
    }

    // **Display the current text state**
    public void displayCurrentState() {
        System.out.println("Current State: \"" + current.content + "\"");
    }
}