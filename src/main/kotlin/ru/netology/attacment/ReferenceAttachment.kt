package ru.netology.attacment

import ru.netology.content.Reference

class ReferenceAttachment(
    val reference: Reference,
    override val idAttachment: Long,
    override val ownerId: Long,
    override val userId: Long,
    override val albumId: Long,
) : Attachment {

    val type: String = "Reference"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${reference.fileName}, " +
                "FileSize: ${reference.fileSize}"
    }
}