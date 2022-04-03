object WallService {
    private var posts = emptyArray<Post>()
    private var idNumber = 0

    fun add(post: Post): Post {
        idNumber += post.id
        posts += post
        return posts.get(idNumber)
    }

    fun update(post: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            post.id == idNumber

        }
        return true
    }
}

