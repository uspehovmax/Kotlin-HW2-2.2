package ru.netology.attacment

import ru.netology.content.Video

class VideoAttachment(
    val video: Video,
    override val idAttachment: Long,
    override val ownerId: Long,
    override val userId: Long,
    override val albumId: Long,
) : Attachment {

    val type: String = "Video"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${video.fileName}, " +
                "FileSize: ${video.fileSize}"
    }
}