package model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Update.
 *
 * @author Oleg_Gizatullin
 */

data class Update(

        @JsonProperty("update_id")
        val updateId: Int,

        @JsonProperty("message")
        val message: Message,
)