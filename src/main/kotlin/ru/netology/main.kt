package ru.netology

import ru.netology.attacment.*
import ru.netology.content.*

fun main() {

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
    val audio = Audio("\"Боже, царя храни!\"", 300)
    val video = Video("\"Тридцатого уничтожить\"", 820)
    val text = Text("\"Конституция\"", 50)
    val photo = Photo("\"Закат\"", 200)
    val reference = Reference("\"Крутой ролик\"", 10)

    val audioAttachment = AudioAttachment(audio)
    val videoAttachment = VideoAttachment(video)
    val photoAttachment = PhotoAttachment(photo)
    val textAttachment = TextAttachment(text)
    val referenceAttachment = ReferenceAttachment(reference)

    Attachments.add(audioAttachment)
    Attachments.add(videoAttachment)
    Attachments.add(photoAttachment)
    Attachments.add(textAttachment)
    Attachments.add(referenceAttachment)

    println()
    println("----------------Attachments-------------------------")
    Attachments.printAttachments()

}


