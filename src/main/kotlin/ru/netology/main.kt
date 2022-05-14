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
    // Создаем объекты - файлы соответствующих типов
    val audio = Audio(1,21,55,2)
    val video = Video(255, 820,45,156)
    val text = Text(555, 50,222,111)
    val photo = Photo(125, 200,559,1473)
    val reference = Reference(8789,1445,11555,155)

    // Создаем объекты для Attachment с файлами
    val audioAttachment = AudioAttachment("audio", audio)
    val videoAttachment = VideoAttachment("video", video)
    val photoAttachment = PhotoAttachment("photo", photo)
    val textAttachment = TextAttachment("text", text)
    val referenceAttachment = ReferenceAttachment("reference", reference)

    //  Добавляем аттачменты в посты через addAttachment
    WallService.addAttachment(firstPost, audioAttachment)
    WallService.addAttachment(firstPost, videoAttachment)
    WallService.addAttachment(secondPost, photoAttachment)
    WallService.addAttachment(secondPost, textAttachment)
    WallService.addAttachment(secondPost, referenceAttachment)
    WallService.addAttachment(thirdPost, audioAttachment)
    WallService.addAttachment(thirdPost, textAttachment)
    WallService.addAttachment(thirdPost, photoAttachment)
    WallService.addAttachment(thirdPost, referenceAttachment)
    WallService.addAttachment(thirdPost, videoAttachment)

    // создаем массив для добавления аттачментов и заполняем его
    var attachmentArray = emptyArray<Attachment>()
    attachmentArray += audioAttachment
    attachmentArray += videoAttachment
    attachmentArray += photoAttachment
    attachmentArray += textAttachment
    attachmentArray += referenceAttachment

    // создание Поста с аттачментами и добавление этого поста в массив постов
    val attachmentPost = Post(text = "Attachment Post", attachments = attachmentArray)
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
    WallService.createComment(commentFirst)

    WallService.createComment(commentSecond)
    // Вариант с PostNotFoundException закоментирован
    //WallService.createComment(commentNext)

    // Вариант добавления коментария к посту через прямое добавление в массив постов по postId
//    firstPost.comments += Comment(postId = firstPost.id, text = "First Comment in firstPost")
//    firstPost.comments += Comment(postId = firstPost.id, text = "Second Comment in firstPost")
//    secondPost.comments += Comment(postId = secondPost.id, text = "First Comment in secondPost")

    println("----------------Comment-------------------------")
    WallService.printPosts()
    println("""Comments of PostId:${firstPost.id}""")
    for ((index, value) in firstPost.comments.withIndex()) {
        println("№ ${index + 1} - $value")
    }

}


