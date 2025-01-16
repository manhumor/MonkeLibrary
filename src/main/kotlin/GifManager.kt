package ua.manhumor

import net.dv8tion.jda.api.utils.FileUpload
import java.io.File

class GifManager {
    private val directory = "src/main/resources"

    private val vutuvMap = hashMapOf<String, FileUpload>()
    private val boboboMap = hashMapOf<String, FileUpload>()
    private val manhumorMap = hashMapOf<String, FileUpload>()
    private val overwriteMap = hashMapOf<String, FileUpload>()
    private val graphicscardMap = hashMapOf<String, FileUpload>()

    private val unknown: FileUpload = FileUpload.fromData(
        File("${directory}/unknown.gif")
    )

    init {

        // -----

        this.vutuvMap["CAB"] = FileUpload.fromData(
            File("${directory}/vutuv/CAB.gif")
        )
        this.vutuvMap["GCNW"] = FileUpload.fromData(
            File("${directory}/vutuv/GCNW.gif")
        )
        this.vutuvMap["Games"] = FileUpload.fromData(
            File("${directory}/vutuv/Games.gif")
        )
        this.vutuvMap["Spinning"] = FileUpload.fromData(
            File("${directory}/vutuv/Spinning.gif")
        )
        this.vutuvMap["Thinking"] = FileUpload.fromData(
            File("${directory}/vutuv/Thinking.gif")
        )
        this.vutuvMap["Displeased"] = FileUpload.fromData(
            File("${directory}/vutuv/Displeased.gif")
        )
        this.vutuvMap["Schizophrenia"] = FileUpload.fromData(
            File("${directory}/vutuv/Schizophrenia.gif")
        )

        // -----

        this.boboboMap["SFU"] = FileUpload.fromData(
            File("${directory}/bobobo/SFU.gif")
        )
        this.boboboMap["WWWD"] = FileUpload.fromData(
            File("${directory}/bobobo/WWWD.gif")
        )
        this.boboboMap["Works"] = FileUpload.fromData(
            File("${directory}/bobobo/Works.gif")
        )
        this.boboboMap["WNMU"] = FileUpload.fromData(
            File("${directory}/bobobo/WNMU.gif")
        )

        // -----

        this.manhumorMap["BTWHTS"] = FileUpload.fromData(
            File("${directory}/man_humor/BTWHTS.gif")
        )
        this.manhumorMap["TOSTSITC"] = FileUpload.fromData(
            File("${directory}/man_humor/TOSTSITC.gif")
        )
        this.manhumorMap["Hyperactive"] = FileUpload.fromData(
            File("${directory}/man_humor/Hyperactive.gif")
        )
        this.manhumorMap["BSCFW"] = FileUpload.fromData(
            File("${directory}/man_humor/BSCFW.gif")
        )
        this.manhumorMap["EFSC"] = FileUpload.fromData(
            File("${directory}/man_humor/EFSC.gif")
        )
        this.manhumorMap["SFU"] = FileUpload.fromData(
            File("${directory}/man_humor/SFU.gif")
        )

        // -----

        this.overwriteMap["Confession"] = FileUpload.fromData(
            File("${directory}/overwrite/Confession.gif")
        )
        this.overwriteMap["RHWAM"] = FileUpload.fromData(
            File("${directory}/overwrite/RHWAM.gif")
        )
        this.overwriteMap["BSCFW"] = FileUpload.fromData(
            File("${directory}/overwrite/BSCFW.gif")
        )
        this.overwriteMap["TTEFTMRO"] = FileUpload.fromData(
            File("${directory}/overwrite/TTEFTMRO.gif")
        )
        this.overwriteMap["TWHH"] = FileUpload.fromData(
            File("${directory}/overwrite/TWHH.gif")
        )

        // -----

        this.graphicscardMap["CAB"] = FileUpload.fromData(
            File("${directory}/graphicscard/CAB.gif")
        )
        this.graphicscardMap["BOptimized"] = FileUpload.fromData(
            File("${directory}/graphicscard/BOptimized.gif")
        )
        this.graphicscardMap["SFU"] = FileUpload.fromData(
            File("${directory}/graphicscard/SFU.gif")
        )
        this.graphicscardMap["GODO"] = FileUpload.fromData(
            File("${directory}/graphicscard/GODO.gif")
        )
        this.graphicscardMap["PAMOGC"] = FileUpload.fromData(
            File("${directory}/graphicscard/PAMOGC.gif")
        )
    }

    fun getValue(s: String, u: Users): FileUpload {
        return when (u) {
            Users.VUTUV -> vutuvMap[s] ?: unknown
            Users.BOBOBO -> boboboMap[s] ?: unknown
            Users.MAN_HUMOR -> manhumorMap[s] ?: unknown
            Users.OVERWRITE -> overwriteMap[s] ?: unknown
            Users.GRAPHICSCARD -> graphicscardMap[s] ?: unknown
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
}