package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 0L    //

    fun add(post: Post): Post {
        post.id += lastId + 1
        posts += post
        lastId = posts.last().id
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (searchPost in posts) {
            if (post.id == searchPost.id) {
                // первый вариант через создание поста с тем же идентификатором
                val updatedPost = Post(searchPost.id, post.text, post.likes, post.isPinned, post.isFavorite)
                // второй вариант через копирование post.copy
                //val updatedPost = post.copy(searchPost.id, post.text, post.likes, post.isPinned, post.isFavorite)
                posts[posts.indexOf(searchPost)] = updatedPost
                return true
            }
        }
        return false
    }

    // Проверка вывода
    fun printPosts() {
        for ((index, value) in posts.withIndex()) {
            println("Значение индекса $index содержимое $value")
        }
    }
}
