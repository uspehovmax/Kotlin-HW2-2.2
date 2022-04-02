package ru.netology.attacment

interface Attachment {
    var idAttachment: Long
    val ownerId: Long
    val userId: Long
    val albumId: Long

}