package ru.netology

import ru.netology.attacment.*
import ru.netology.content.*

fun main() {
    // Реализация Post
    val firstPost = Post(text = "First Post")
    val secondPost = Post(text = "Second Post", likes = 500)
    val thirdPost = Post(text = "Next Post", likes = 100, isFavorite = true)
    val updatedPost = Post(id = 3, text = "Update text", likes = 230, isFavorite = false)

    WallService.add(firstPost)
    WallService.add(secondPost)
    WallService.add(thirdPost)

    WallService.update(updatedPost)
    println("Update WallService: ${WallService.update(updatedPost)}")

    WallService.printPosts()

    // Реализация Attachment
    // Создаем объекты - файлы с именем и размером
    val audio = Audio("\"Боже, царя храни!\"", 300)
    val video = Video("\"Тридцатого уничтожить\"", 820)
    val text = Text("\"Конституция\"", 50)
    val photo = Photo("\"Закат\"", 200)
    val reference = Reference("\"Крутой ролик\"", 10)

    // Создаем объекты для Attachment с файлами
    val audioAttachment = AudioAttachment(audio, 1, 1, 1, 1)
    val videoAttachment = VideoAttachment(video, 2, 2, 2, 2)
    val photoAttachment = PhotoAttachment(photo, 3, 3, 3, 3)
    val textAttachment = TextAttachment(text, 4, 4, 4, 4)
    val referenceAttachment = ReferenceAttachment(reference, 5, 5, 5, 5)

    // создаем массив для добавления аттачментов и заполняем его
    var attachmentArray1 = emptyArray<Attachment>()
    attachmentArray1 += audioAttachment
    attachmentArray1 += videoAttachment
    attachmentArray1 += photoAttachment
    attachmentArray1 += textAttachment
    attachmentArray1 += referenceAttachment

    // добавляем аттачменты в посты
    firstPost.attachments += audioAttachment
    firstPost.attachments += videoAttachment
    secondPost.attachments += TextAttachment(text, secondPost.attachments.size + 1L, 4, 4, 4)

    // создание Поста с аттачментами и добавление этого поста в массив постов
    val attachmentPost = Post(text = "Attachment Post", attachments = attachmentArray1)
    WallService.add(attachmentPost)

    println()
    println("----------------Attachments-------------------------")
    WallService.printPosts()
    println("""Attachments of PostId:${attachmentPost.id}""")
    for ((index, value) in attachmentPost.attachments.withIndex()) {
        println("№ ${index + 1} - $value")
    }
    println()

    // Реализация Comment
    val commentFirst = Comment(postId = firstPost.id, text = "First Comment in firstPost")
    val commentSecond = Comment(postId = 2, text = "First Comment in firstPost")
    val commentNext = Comment(postId = 7, text = "First Comment in firstPost") // Comment к посту которого нет

    // Вариант добавления коментария к посту через fun createComment
    WallService.createComment(commentFirst)
    WallService.createComment(commentSecond)
    // Вариант с PostNotFoundException закоментирован
    //WallService.createComment(commentNext)

    // Вариант добавления коментария к посту через прямое добавление в массив постов по postId
    firstPost.comments += Comment(postId = firstPost.id, text = "First Comment in firstPost")
    firstPost.comments += Comment(postId = firstPost.id, text = "Second Comment in firstPost")
    secondPost.comments += Comment(postId = secondPost.id, text = "First Comment in secondPost")

    println("----------------Comment-------------------------")
    WallService.printPosts()
    println("""Comments of PostId:${firstPost.id}""")
    for ((index, value) in firstPost.comments.withIndex()) {
        println("№ ${index + 1} - $value")
    }

}


