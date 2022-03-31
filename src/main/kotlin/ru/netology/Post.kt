package ru.netology

//import java.util.*

// часть полей закомментирована для оптимизации

class Post(
    var id: Long = 0,
//    val ownerId: Long,
//    val fromId: Long,
//    val createdBy: Long,
//    val date: String,
    val text: String,
//    val replyOwnerId: Long,
//    val replyPostId: Long,
//    val friendsOnly: Boolean,
//    val comments: Objects? = null,    //
//    val copyright: Objects? = null,    //
    val likes: Long = 0,    //
//    val reposts: Objects? = null,    //
//    val views: Objects? = null,    //
//    val postType: String,

//    val postSource: Objects? = null, !!
//    val attachments []:
//    val geo: Objects? = null,
//    val copyHistory []:

//    val signerId: Long,
//    val canPin: Boolean,
//    val canDelete: Boolean = false,
//    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
//    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = true,
//    val donut: Objects? = null,    //
//    val postponedId: Long,
) {

}
