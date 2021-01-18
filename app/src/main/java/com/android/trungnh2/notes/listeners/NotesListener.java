package com.android.trungnh2.notes.listeners;

import com.android.trungnh2.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
