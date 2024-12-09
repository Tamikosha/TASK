package kz.iitu.myapplication.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kz.iitu.myapplication.models.Note

class NotesViewModel : ViewModel() {

    private val _notes = MutableStateFlow<List<Note>>(emptyList())
    val notes: StateFlow<List<Note>> = _notes

    fun addNote(title: String, content: String) {
        val newNote = Note(
            id = (_notes.value.maxOfOrNull { it.id } ?: 0) + 1,
            title = title,
            content = content
        )
        _notes.value = _notes.value + newNote
    }
}