package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Note;
import model.Notebook;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private ListView<Note> notesListView;

    private Notebook notebook;

    @FXML
    public void initialize() {
        notebook = new Notebook();
    }

    @FXML
    private void handleAddNote() {
        String title = titleField.getText();
        String content = contentArea.getText();

        if (!title.isEmpty() && !content.isEmpty()) {
            Note newNote = new Note(title, content);
            notebook.addNote(newNote);
            notesListView.getItems().add(newNote);

            titleField.clear();
            contentArea.clear();
        }
    }
}

