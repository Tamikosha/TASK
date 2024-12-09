package kz.iitu.myapplication.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun NoteDetailsScreen(noteId: String?) {
    Text(text = "Details for Note ID: $noteId")
}