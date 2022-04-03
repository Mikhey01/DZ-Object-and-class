class comments(
    val count: Int,                     //количество комментариев
    val canPost: Boolean,              //информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    val groupsCanPost: Boolean,         //информация о том, могут ли сообщества комментировать запись;
    val canClose: Boolean,              //может ли текущий пользователь закрыть комментарии к записи;
    val canOpen: Boolean                //может ли текущий пользователь открыть комментарии к записи.
)

class likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

class reposts(
    val count: Int,
    val userReposted: Boolean
)

class views(
    val count: Int
)

class donut(
    val is_donut: Boolean,
    val paid_duration: Int,
//    val placeholder: object : ArraysUtilJVM {
//
//}
    val can_publish_free_copy: Boolean,
    val edit_mode: String,
    //val all // todo
    //val duration // todo

)
