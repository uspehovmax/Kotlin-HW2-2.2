package ru.netology.attacment

import ru.netology.content.Text

class TextAttachment(
    val text: Text,
    override var idAttachment: Long = 0,
    override val ownerId: Long = 0,
    override val userId: Long = 0,
    override val albumId: Long = 0
) : Attachment {

    val type: String = "Text"

    override fun toString(): String {
        return "AttachmentId: $idAttachment, " +
                "TypeOfAttachment: $type, " +
                "FileName: ${text.fileName}, " +
                "FileSize: ${text.fileSize}"
    }
}