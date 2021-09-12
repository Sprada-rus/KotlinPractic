import kotlin.coroutines.coroutineContext

class Song(val title: String, val artist: String) {
    var genre: String = ""
        get() = field
        set(value) {
            field = value
        }
    var nameSong: String = title
        get() = field

    fun play() {
        println("Играет песня $title артиста $artist")
    }

    fun stop(){
        println("Песня $title остановлена")
    }
}