import junit.framework.Assert.*
import org.junit.Assert.assertNotEquals
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {
        val wallService = WallService()

        val post = wallService.add(Post(0, 321654, 12112022, "Добрый день"))

        var result = post.id

        assertNotEquals(0, result)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val wallservice = WallService()
        // заполняем несколькими постами
        wallservice.add(Post(0, 321654, 12112022, "Добрый день"))
        wallservice.add(Post(0, 654987, 12112022, "Добрый вечер"))
        wallservice.add(Post(0, 123698, 12112022, "Доброй ночи"))
        // создаём информацию об обновлении
        val updateTestPost = Post(1, 321654, 12112022, "Доброй всем ночи")

        // выполняем целевое действие
        val result = wallservice.update(updateTestPost)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateNotExistin() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(0, 321654, 12112022, "Добрый день"))
        service.add(Post(0, 654987, 12112022, "Добрый вечер"))
        service.add(Post(0, 123698, 12112022, "Доброй ночи"))
        // создаём информацию об обновлении
        val updateTestPost = Post(0, 321654, 12112022, "Доброй всем ночи")

        // выполняем целевое действие
        val result = service.update(updateTestPost)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}



