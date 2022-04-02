package ru.netology.attacment

import ru.netology.content.Audio

class AudioAttachment(
    val audio: Audio,
    override var idAttachment: Long = 0,
    override val ownerId: Long = 0,
    override val userId: Long = 0,
    override val albumId: Long = 0
) : Attachment {

    val type: String = "Audio"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${audio.fileName}, " +
                "FileSize: ${audio.fileSize}"
    }
}