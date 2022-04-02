package ru.netology

import java.util.*

// часть полей закомментирована для оптимизации

class Post( // для тестирования data class меняем на class
    var id: Long = 0,
    val ownerId: Long = 0,
    val fromId: Long = 0,
    val createdBy: Long = 0,
    val date: String = "TODAY",
    val text: String,
    val replyOwnerId: Long = 0,
    val replyPostId: Long = 0,
    val friendsOnly: Boolean = true,
    val comments: Objects? = null,
    val copyright: Objects? = null,
    val likes: Long = 0,
    val reposts: Objects? = null,
    val views: Objects? = null,
    val postType: String = "post",        // post, copy, reply, postpone, suggest
    val postSource: Objects? = null,
    //val attachments: Array<Post> = emptyArray<Post>(),
    val geo: Objects? = null,
    var copyHistory: Array<Post> = emptyArray<Post>(),
    val signerId: Long = 0,
    val canPin: Boolean = true,
    val canDelete: Boolean = false,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = true,
    val donut: Objects? = null,    //
    val postponedId: Long = 0,
) {
    // переопределение для контроля вывода без data class
    override fun toString(): String {
        return "Post id: $id, Text: $text, likes: $likes"
    }
}