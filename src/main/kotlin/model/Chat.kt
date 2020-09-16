package model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Chat.
 *
 * @author Oleg_Gizatullin
 */
data class Chat(

    @JsonProperty("id")
    val id: Int,

    @JsonProperty("type")
    val type: String,

    @JsonProperty("title")
    val title: String? = null,

    @JsonProperty("username")
    val username: String? = null,

    @JsonProperty("first_name")
    val firstName: String? = null,

    @JsonProperty("last_name")
    val lastName: String? = null,

    // @TODO(ChatPhoto Object)
    val photo: Any? = null,

    @JsonProperty("description")
    val description: String? = null,

    @JsonProperty("invite_link")
    val inviteLink: String? = null,

    @JsonProperty("pinned_message")
    val pinnedMessage: Message? = null,

    // @TODO(ChatPermissions Object)
    val permissions: Any? = null,

    @JsonProperty("slow_mode_delay")
    val slowModeDelay: Int? = null,

    @JsonProperty("sticker_set_name")
    val stickerSetName: String? = null,

    @JsonProperty("can_set_sticker_set")
    val canSetStickerSet: Boolean? = null
)
