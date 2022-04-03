package ru.netology.attacment

import ru.netology.content.Text

class TextAttachment(
    val text: Text,
    override val idAttachment: Long,
    override val ownerId: Long,
    override val userId: Long,
    override val albumId: Long,
) : Attachment {

    val type: String = "Text"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${text.fileName}, " +
                "FileSize: ${text.fileSize}"
    }
}