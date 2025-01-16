package ua.manhumor

import net.dv8tion.jda.api.utils.FileUpload
import java.io.File
import java.io.InputStream

class GifManager {
    private val classLoader: ClassLoader = Thread.currentThread().contextClassLoader ?: GifManager::class.java.classLoader

    private val vutuvMap = hashMapOf<String, FileUpload>()
    private val boboboMap = hashMapOf<String, FileUpload>()
    private val manhumorMap = hashMapOf<String, FileUpload>()
    private val overwriteMap = hashMapOf<String, FileUpload>()
    private val graphicscardMap = hashMapOf<String, FileUpload>()

    private val unknown: InputStream = classLoader.getResourceAsStream("unknown.gif")!!
    private val unknownFile: FileUpload = FileUpload.fromData(
        unknown, "unknown.gif"
    )

    init {

        // -----

        this.vutuvMap["CAB"] = getGif("vutuv/CAB.gif")
        this.vutuvMap["GCNW"] = getGif("vutuv/GCNW.gif")
        this.vutuvMap["Games"] = getGif("vutuv/Games.gif")
        this.vutuvMap["Spinning"] = getGif("vutuv/Spinning.gif")
        this.vutuvMap["Thinking"] = getGif("vutuv/Thinking.gif")
        this.vutuvMap["Displeased"] = getGif("vutuv/Displeased.gif")
        this.vutuvMap["Schizophrenia"] = getGif("vutuv/Schizophrenia.gif")

        // -----

        this.boboboMap["SFU"] = getGif("bobobo/SFU.gif")
        this.boboboMap["WWWD"] = getGif("bobobo/WWWD.gif")
        this.boboboMap["Works"] = getGif("bobobo/Works.gif")
        this.boboboMap["WNMU"] = getGif("bobobo/WNMU.gif")

        // -----

        this.manhumorMap["BTWHTS"] = getGif("man_humor/BTWHTS.gif")
        this.manhumorMap["TOSTSITC"] = getGif("man_humor/TOSTSITC.gif")
        this.manhumorMap["Hyperactive"] = getGif("man_humor/Hyperactive.gif")
        this.manhumorMap["BSCFW"] = getGif("man_humor/BSCFW.gif")
        this.manhumorMap["EFSC"] = getGif("man_humor/EFSC.gif")
        this.manhumorMap["SFU"] = getGif("man_humor/SFU.gif")

        // -----

        this.overwriteMap["Confession"] = getGif("overwrite/Confession.gif")
        this.overwriteMap["RHWAM"] = getGif("overwrite/RHWAM.gif")
        this.overwriteMap["BSCFW"] = getGif("overwrite/BSCFW.gif")
        this.overwriteMap["TTEFTMRO"] = getGif("overwrite/TTEFTMRO.gif")
        this.overwriteMap["TWHH"] = getGif("overwrite/TWHH.gif")

        // -----

        this.graphicscardMap["CAB"] = getGif("graphicscard/CAB.gif")
        this.graphicscardMap["BOptimized"] = getGif("graphicscard/BOptimized.gif")
        this.graphicscardMap["SFU"] = getGif("graphicscard/SFU.gif")
        this.graphicscardMap["GODO"] = getGif("graphicscard/GODO.gif")
        this.graphicscardMap["PAMOGC"] = getGif("graphicscard/PAMOGC.gif")
    }

    fun getValue(s: String, u: Users): FileUpload {
        return when (u) {
            Users.VUTUV -> vutuvMap[s] ?: unknownFile
            Users.BOBOBO -> boboboMap[s] ?: unknownFile
            Users.MAN_HUMOR -> manhumorMap[s] ?: unknownFile
            Users.OVERWRITE -> overwriteMap[s] ?: unknownFile
            Users.GRAPHICSCARD -> graphicscardMap[s] ?: unknownFile
        }
    }

    fun getValue(u: Users): FileUpload {
        return when (u) {
            Users.VUTUV -> vutuvMap.values.random()
            Users.BOBOBO -> boboboMap.values.random()
            Users.MAN_HUMOR -> manhumorMap.values.random()
            Users.OVERWRITE -> overwriteMap.values.random()
            Users.GRAPHICSCARD -> graphicscardMap.values.random()
        }
    }

    private fun getGif(s: String): FileUpload {
        return FileUpload.fromData(classLoader.getResourceAsStream(s) ?: unknown, s)
    }
}