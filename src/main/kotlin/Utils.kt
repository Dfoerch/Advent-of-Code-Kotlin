import java.io.File

object Utils{

    fun readInputLines(day: Int): List<String> {

        return File("src/main/resources/Day_$day.txt").readLines()

    }

    fun generateMatrix(day: Int) : Array<String> {

        val inpStrings = readInputLines(day)

        /*val concStrings = inpStrings.map {
            it.repeat(4)
        }*/

        return inpStrings.toTypedArray()
    }

}