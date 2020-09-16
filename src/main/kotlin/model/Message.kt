package model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Message.
 *
 * @author Oleg_Gizatullin
 */

data class Message(

        @JsonProperty("message_id")
        val messageId: Int,

        @JsonProperty("from")
        val from: User? = null,

        @JsonProperty("date")
        val date: Int,

        @JsonProperty("chat")
        val chat: Chat,

        @JsonProperty("forward_from")
        val forwardFrom: User? = null,

        @JsonProperty("forward_from_chat")
        val forwardFromChat: Chat? = null,

        @JsonProperty("forward_from_message_id")
        val forwardFromMessageId: Int? = null,

        @JsonProperty("forward_signature")
        val forwardSignature: String? = null,

        @JsonProperty("forward_sender_name")
        val forwardSenderName: String? = null,

        @JsonProperty("forward_date")
        val forwardDate: Int? = null,

        @JsonProperty("reply_to_message")
        val replyToMessage: Message? = null,

        @JsonProperty("via_bot")
        val viaBot: User? = null,

        @JsonProperty("edit_date")
        val editDate: Int? = null,

        @JsonProperty("mediaGroupId")
        val media_group_id: String? = null,

        @JsonProperty("author_signature")
        val authorSignature: String? = null,

        @JsonProperty("text")
        val text: String? = null,

        // @TODO(MessageEntity Object)
        // @JsonProperty("entities")
        val entities: Any? = null,

        // @TODO(Animation Object)
        // @JsonProperty("animation")
        val animation: Any? = null,

        // @TODO(Audio Object)
        // @JsonProperty("audio")
        val audio: Any? = null,

        // @TODO(Document Object)
        // @JsonProperty("document")
        val document: Any? = null,

        // @TODO(PhotoSize Object)
        // @JsonProperty("photo")
        val photo: Any? = null,

        // @TODO(Sticker Object)
        // @JsonProperty("sticker")
        val sticker: Any? = null,

        // @TODO(Video Object)
        // @JsonProperty("video")
        val video: Any? = null,

        // @TODO(VideoNote Object)
        // @JsonProperty("video_note")
        val videoNote: Any? = null,

        // @TODO(Voice Object)
        // @JsonProperty("voice")
        val voice: Any? = null,

         @JsonProperty("caption")
        val caption: String? = null,

        // @TODO(MessageEntity Object)
        // @JsonProperty("caption_entities")
        val captionEntities: Any? = null,

        // @TODO(Contact Object)
        // @JsonProperty("contact")
        val contact: Any? = null,

        // @TODO(Dice Object)
        // @JsonProperty("dice")
        val dice: Any? = null,

        // @TODO(Game Object)
        // @JsonProperty("game")
        val game: Any? = null,

        // @TODO(Poll Object)
        // @JsonProperty("poll")
        val poll: Any? = null,

        // @TODO(Venue Object)
        // @JsonProperty("venue")
        val venue: Any? = null,

        // @TODO(Location Object)
        // @JsonProperty("location")
        val location: Any? = null,

         @JsonProperty("new_chat_members")
        val newChatMembers: ArrayList<User>? = null,

         @JsonProperty("left_chat_member")
        val leftChatMember: User? = null,

         @JsonProperty("new_chat_title")
        val newChatTitle: String? = null,

        // @TODO(PhotoSize Object)
        // @JsonProperty("new_chat_photo")
        val newChatPhoto: Any? = null,

        @JsonProperty("delete_chat_photo")
        val deleteChatPhoto: Boolean? = null,

        @JsonProperty("group_chat_created")
        val groupChatCreated: Boolean? = null,

        @JsonProperty("supergroup_chat_created")
        val supergroupChatCreated: Boolean? = null,

        @JsonProperty("channel_chat_created")
        val channelChatCreated: Boolean? = null,

        @JsonProperty("migrate_to_chat_id")
        val migrateToChatId: Int? = null,

        @JsonProperty("migrate_from_chat_id")
        val migrateFromChatId: Int? = null,

        @JsonProperty("pinned_message")
        val pinnedMessage: Message? = null,

//        @TODO(Invoice Object)
//        @JsonProperty("invoice")
        val invoice: Any? = null,

//        @TODO(SuccessfulPayment Object)
//        @JsonProperty("successful_payment")
        val successfulPayment: Any? = null,

        @JsonProperty("connected_website")
        val connectedWebsite: String? = null,

//        @TODO(PassportData Object)
//        @JsonProperty("passport_data")
        val passportData: Any? = null,

//        @TODO(InlineKeyboardMarkup Object)
//        @JsonProperty("reply_markup")
        val replyMarkup: Any? = null

)
