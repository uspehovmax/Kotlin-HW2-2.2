package ru.netology.attacment

import ru.netology.content.Audio

class AudioAttachment(
    val audio: Audio,
    override val idAttachment: Long,
    override val ownerId: Long,
    override val userId: Long,
    override val albumId: Long,
) : Attachment {
    val type: String = "Audio"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${audio.fileName}, " +
                "FileSize: ${audio.fileSize}"
    }
}