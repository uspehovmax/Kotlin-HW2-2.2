import org.junit.Assert
import org.junit.Test
import ru.netology.WallService
import org.junit.Assert.*
import ru.netology.Post

class WallServiceTest {

    @Test
    fun add() {

        val idTest = 1L
        val textTest = "Test text"
        val isFavoriteTest = true

        val result = WallService.add(Post(id = idTest, text = textTest, isFavorite = isFavoriteTest))

        assertTrue(result.id != 0L)
    }

    @Test
    fun update_True() {

        WallService.add(Post(text = "First Post", isFavorite = true))
        WallService.add(Post(text = "Second Post", isFavorite = false))
        WallService.add(Post(text = "Next Post", isFavorite = true))

        val update = Post(id = 3, text = "Update text", isFavorite = false)

        val result = WallService.update(update)

        assertTrue(result)
    }

    @Test
    fun update_False() {

        WallService.add(Post(text = "Hello", likes = 250, isFavorite = true))
        WallService.add(Post(text = "World", likes = 60, isFavorite = false))
        WallService.add(Post(text = "Next time", isFavorite = true))

        val update = Post(id = 5, text = "edited text", isFavorite = false)

        val result = WallService.update(update)

        assertFalse(result)
    }
}