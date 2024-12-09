package kz.iitu.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kz.iitu.myapplication.screens.NoteDetailsScreen
import kz.iitu.myapplication.screens.NotesListScreen

class Navigation {

    @Composable
    fun NotesNavGraph(navController: NavHostController) {
        NavHost(navController = navController, startDestination = "notes_list") {
            composable("notes_list") { NotesListScreen(navController) }
            composable("note_details/{noteId}") { backStackEntry ->
                val noteId = backStackEntry.arguments?.getString("noteId")
                NoteDetailsScreen(noteId = noteId)
            }
        }
    }
}
