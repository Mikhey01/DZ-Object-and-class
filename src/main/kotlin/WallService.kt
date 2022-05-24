class WallService {

    private var posts = emptyArray<Post>()


    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            post.id = 1
        } else {
            post.copy(id = post.id + 1)
        }
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index) in posts.withIndex()) {
            if (post.id != null) {
                posts[index] = post.copy(
                    ownerId = post.ownerId,
                    date = post.date)
            }
        }
        return true
    }
}

