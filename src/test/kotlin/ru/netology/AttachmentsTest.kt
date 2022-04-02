package ru.netology

import org.junit.Assert
import org.junit.Test
import ru.netology.attacment.*
import ru.netology.content.*

class AttachmentsTest {
    val audio = Audio("\"Боже, царя храни!\"", 300 )
    val video = Video("\"Тридцатого уничтожить\"", 820 )
    val photo = Photo("\"Закат\"", 200 )

    val audioAttachment = AudioAttachment(audio)
    val videoAttachment = VideoAttachment(video)
    val photoAttachment = PhotoAttachment(photo)

    @Test
    fun add() {

        val result = Attachments.add(audioAttachment)

        Assert.assertTrue(result.idAttachment != 0L)
    }

}