package ru.netology

import ru.netology.attacment.Attachment

data class Comment(
    val postId: Long,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String,
    val donut: Object? = null,
    val replyToUser: Int = 0,
    val replyToComment: Int = 0,
    val attachments: Object? = null,
    val parentsStack: Array<String> = emptyArray<String>(),
    val thread: Object? = null
) {
    // переопределение для контроля вывода
    override fun toString(): String {
        return "postId: $postId, " +
                "Text: $text "
    }

}