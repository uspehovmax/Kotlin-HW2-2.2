package ru.netology.attacment

import ru.netology.content.Video

class VideoAttachment(
    val video: Video,
    override var idAttachment: Long = 0,
    override val ownerId: Long = 0,
    override val userId: Long = 0,
    override val albumId: Long = 0
) : Attachment {

    val type: String = "Video"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${video.fileName}, " +
                "FileSize: ${video.fileSize}"
    }
}