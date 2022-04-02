package ru.netology.attacment

import ru.netology.content.Photo

class PhotoAttachment(
    val photo: Photo,
    override var idAttachment: Long = 0,
    override val ownerId: Long = 0,
    override val userId: Long = 0,
    override val albumId: Long = 0
) : Attachment {

    val type: String = "Photo"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${photo.fileName}, " +
                "FileSize: ${photo.fileSize}"
    }
}