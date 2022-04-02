package ru.netology.attacment

import ru.netology.Post

object Attachments {
    private var attachmentsArray = emptyArray<Attachment>()
    private var lastId = 0L    //

    fun add(attach: Attachment): Attachment {
        attach.idAttachment += lastId + 1
        attachmentsArray += attach
        lastId = attachmentsArray.last().idAttachment
        return attachmentsArray.last()
    }

    // Проверка вывода
    fun printAttachments() {
        for ((index, value) in attachmentsArray.withIndex()) {
            println("Значение индекса $index содержимое $value")
        }
    }
}