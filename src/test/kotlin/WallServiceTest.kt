import junit.framework.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val posts = emptyArray<Post>()


        service.add(Post(2, 321654, 12112022, "Добрый день"))
        service.add(Post(3, 654987, 12112022, "Добрый вечер"))

        val result = fun(): Boolean {
            for (post in posts) return when {
                (post.id > 0) -> true
                else -> false
            }
            return true
        }
        assertEquals(true, result)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(2, 321654, 12112022, "Добрый день"))
        service.add(Post(3, 654987, 12112022, "Добрый вечер"))
        service.add(Post(4, 123698, 12112022, "Доброй ночи"))
        // создаём информацию об обновлении
        val updatePost = Post(2, 321654, 12112022, "Доброй всем ночи")

        // выполняем целевое действие
        val result = service.update(updatePost)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)

    }

    @Test
    fun updateExistingNew() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(2, 321654, 12112022, "Добрый день"))
        service.add(Post(3, 654987, 12112022, "Добрый вечер"))
        service.add(Post(4, 123698, 12112022, "Доброй ночи"))
        // создаём информацию об обновлении
        val updatePost = Post(23456, 321654, 12112022, "Доброй всем ночи")

        // выполняем целевое действие
        val result = service.update(updatePost)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

}
