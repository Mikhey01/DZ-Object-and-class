import kotlin.random.Random

class WallService {

    private var posts = emptyArray<Post>()
    private var idNumber = 1

//val original = Post(
//    2, 123654, 12112022,"Добрый день"
//)
    fun add(post: Post): Post {

        idNumber += post.id
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if(post.id == idNumber) {
                posts[index] = post.copy(id = post.id,
                    ownerId = post.ownerId,
                    date = post.date,
                    text = post.text)
            }
        }
        return true
    }
}

