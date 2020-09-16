import com.fasterxml.jackson.databind.ObjectMapper
import model.Update
import model.UpdateResponse
import java.net.URL

/**
 * main.
 *
 * @author Oleg_Gizatullin
 */
const val token = "1282763653:AAEK0uP4YCloaW9AtMHdSY5Tk7PU0I-9VM4"

fun main() {
    val upd: UpdateResponse = ObjectMapper()
        .readValue(URL("https://api.telegram.org/bot${token}/getUpdates"), UpdateResponse::class.java)
}

