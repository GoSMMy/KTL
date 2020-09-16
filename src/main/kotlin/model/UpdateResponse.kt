package model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * UpdateResponse.
 *
 * @author Oleg_Gizatullin
 */
data class UpdateResponse(

    @JsonProperty("ok")
    val ok: Boolean,

    @JsonProperty("result")
    val result: ArrayList<Update>
)