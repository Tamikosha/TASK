package kz.iitu.myapplication

import org.junit.Test

class NotesUIModelTest {
    @Test
    fun notesScreen_displaysNotesCorrectly() {
        val fakeNotes = listOf(
            Note(1, "Title 1", "Content 1"),
            Note(2, "Title 2", "Content 2")
        )
        val fakeViewModel = NotesViewModel(FakeNotesRepository(fakeNotes))

        composeTestRule.setContent {
            NotesScreen(viewModel = fakeViewModel)
        }

        composeTestRule.onNodeWithText("Title 1").assertIsDisplayed()
        composeTestRule.onNodeWithText("Title 2").assertIsDisplayed()
    }
}
}