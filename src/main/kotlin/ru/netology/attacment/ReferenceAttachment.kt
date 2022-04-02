package ru.netology.attacment

import ru.netology.content.Reference

class ReferenceAttachment(
    val reference: Reference,
    override var idAttachment: Long = 0,
    override val ownerId: Long = 0,
    override val userId: Long = 0,
    override val albumId: Long = 0,
) : Attachment {

    val type: String = "Reference"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${reference.fileName}, " +
                "FileSize: ${reference.fileSize}"
    }
}