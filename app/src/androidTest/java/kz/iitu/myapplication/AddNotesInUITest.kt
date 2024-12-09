package kz.iitu.myapplication

import org.junit.Test

class AddNotesInUITest {
    @Test
    fun addNote_updatesUI() = runTest {
        val fakeRepository = FakeNotesRepository(emptyList())
        val viewModel = NotesViewModel(fakeRepository)

        composeTestRule.setContent {
            NotesScreen(viewModel = viewModel)
        }

        viewModel.addNote("New Title", "New Content")

        composeTestRule.onNodeWithText("New Title").assertIsDisplayed()
    }
}