package ru.netology

import ru.netology.attacment.Attachment
import java.lang.Exception
import java.util.Collections.copy
import ru.netology.PostNotFoundException as PostNotFoundException1

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var lastId = 0L
    private var lastAttachmentId = 0

    fun add(post: Post): Post {
        post.id += lastId + 1
        posts += post
        lastId = posts.last().id
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (searchPost in posts) {
            if (post.id == searchPost.id) {
                val updatedPost = post.copy(
                    id = post.id,
                    text = post.text,
                    likes = post.likes,
                    attachments = post.attachments
                )
                posts[posts.indexOf(searchPost)] = updatedPost
                return true
            }
        }
        return false
    }

    fun addAttachment(post: Post, attachment: Attachment): Boolean {
        for (searchPost in posts) {
            if (post.id == searchPost.id) {
                val addAttachmentPost = post.copy(
                    id = post.id,
                    text = post.text,
                    likes = post.likes,
                    attachments = post.attachments + attachment
                )
                posts[posts.indexOf(searchPost)] = addAttachmentPost
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment): Boolean {
        var checkPostId: Boolean = false
        for ((i, post) in posts.withIndex()) {
            if (posts[i].id == comment.postId) {
                posts[i] = posts[i].copy(
                    comments = arrayOf(comment),
                )
                checkPostId = true
            }
        }
        if (checkPostId) {
            println("Пост найден Post id:${comment.postId}")
        } else {
            throw ru.netology.PostNotFoundException("ТАКОГО ПОСТА НЕТ")
        }
        return true
    }

    // Проверка вывода
    fun printPosts() {
        for ((index, value) in posts.withIndex()) {
            println("Значение индекса $index содержимое $value")
        }
    }
}
