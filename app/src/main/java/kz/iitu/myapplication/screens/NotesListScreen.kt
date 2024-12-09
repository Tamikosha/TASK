package kz.iitu.myapplication.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import kz.iitu.myapplication.models.Note

@Composable
fun NotesListScreen(navController: NavHostController) {
    val fakeNotes = listOf(
        Note(1, "Note 1", "This is the content of Note 1"),
        Note(2, "Note 2", "This is the content of Note 2")
    )

    Column {
        fakeNotes.forEach { note ->
            Text(
                text = note.title,
                modifier = androidx.compose.ui.Modifier.clickable {
                    navController.navigate("note_details/${note.id}")
                }
            )
        }
    }
}