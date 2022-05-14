package ru.netology.attacment

import ru.netology.content.*

abstract class Attachment(open val type: String)

data class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio = Audio()
) : Attachment("audio")

data class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo = Photo()
) : Attachment("photo")

data class ReferenceAttachment(
    override val type: String = "reference",
    val reference: Reference = Reference()
) : Attachment("reference")

data class TextAttachment(
    override val type: String = "text",
    val text: Text = Text()
) : Attachment("text")

data class VideoAttachment(
    override val type: String = "video",
    val video: Video = Video()
) : Attachment("video")

//fun showAttachment(attachment: Attachment) {
//    when (attachment.type) {
//        "audio" -> (attachment as AudioAttachment).audioId
//        "photo" -> (attachment as PhotoAttachment).photoId
//        "reference" -> (attachment as ReferenceAttachment).referenceId
//        "text" -> (attachment as TextAttachment).textId
//        "video" -> (attachment as VideoAttachment).videoId
//    }
//}