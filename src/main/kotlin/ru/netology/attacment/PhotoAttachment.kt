package ru.netology.attacment

import ru.netology.content.Photo

class PhotoAttachment(
    val photo: Photo,
    override val idAttachment: Long,
    override val ownerId: Long,
    override val userId: Long,
    override val albumId: Long,
) : Attachment {

    val type: String = "Photo"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${photo.fileName}, " +
                "FileSize: ${photo.fileSize}"
    }
}