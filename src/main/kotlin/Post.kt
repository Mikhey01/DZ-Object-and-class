data class Post(

    val id: Int,                    //Идентификатор записи.
    val ownerId: String,               //Идентификатор владельца стены, на которой размещена запись.
    val fromId: Int,                //Идентификатор автора записи (от чьего имени опубликована запись)
    val createdBy: Int,             //Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    val date: Int,                  //Время публикации записи в формате unixtime
    val text: String,               //Текст записи.,
    val replyOwnerId: Int,           //Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    val replyPostId: Int,            //Идентификатор записи, в ответ на которую была оставлена текущая.
    val friendsOnly: Int,               //1, если запись была создана с опцией «Только для друзей»
//    val copyright: String,
//    val postType: String,              // должна принимать post, copy, reply, postpone, suggest
//    val signerId: Int,
//    val canPin: Boolean,
//    val canDelete: Boolean,
//    val canEdit: Boolean,
//    val isPinned: Int,
//    val markedAsAds: Boolean,
//    val isFavorite: Boolean,
//    val postponedId: Int
)





