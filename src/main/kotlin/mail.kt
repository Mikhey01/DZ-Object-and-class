
fun main() {

    val wallservice = WallService()

    wallservice.add(Post(0, 321654, 12112022, "Добрый день"))
    wallservice.add(Post(0, 654987, 12112022, "Добрый вечер"))
    wallservice.add(Post(0, 123698, 12112022, "Доброй ночи"))

    wallservice.update(Post(2, 321654, 12112022, "Доброй всем ночи"))

    wallservice.print()
}

