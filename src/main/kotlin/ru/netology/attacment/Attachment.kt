package ru.netology.attacment

interface Attachment {
    val idAttachment: Long
    val ownerId: Long
    val userId: Long
    val albumId: Long

}