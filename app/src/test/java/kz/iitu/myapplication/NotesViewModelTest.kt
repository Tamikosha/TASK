package kz.iitu.myapplication

import org.junit.Test

class NotesViewModelTest {
    @Test
    fun notesViewModel_fetchNotes_emitsNotes() = runTest {
        val fakeRepository = FakeNotesRepository(
            notes = listOf(
                Note(1, "Test Note 1", "Test Content 1"),
                Note(2, "Test Note 2", "Test Content 2")
            )
        )
        val viewModel = NotesViewModel(fakeRepository)

        viewModel.notes.test {
            val emittedNotes = awaitItem()
            assertThat(emittedNotes).hasSize(2)
            assertThat(emittedNotes[0].title).isEqualTo("Test Note 1")
        }
    }
}