class WallService {

     private var posts = emptyArray<Post>()


    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            post.id = 1
        } else {
            post.id = posts.last().id + 1
        }
        posts += post
        return posts.last()
    }

    fun print() {
        for (post in posts) {
            println(post.text)
            println(post.id)

        }
    }

    fun update(post: Post): Boolean {
        for ((index, updatePost) in posts.withIndex()) {
            if (updatePost.id == post.id) {
                posts[index] = post.copy(
                    ownerId = post.ownerId,
                    date = post.date)
                return true
            }
        }
        return false
    }
}

