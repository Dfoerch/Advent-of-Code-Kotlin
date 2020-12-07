class Day2 {

    fun solvePt1(): Int {

        val mapped = Utils.readInputLines(2).map {

            val splitStr = it.split(":")
            val char = splitStr[0].split(" ")[1][0]
            val range = IntRange(
                splitStr[0].split(" ")[0].split("-")[0].toInt(),
                splitStr[0].split(" ")[0].split("-")[1].toInt()
            )

            isPassValid(range, char, splitStr[1])

        }

        return mapped.count { it }
    }

    fun solvePt2(): Int {

        val mapped = Utils.readInputLines(2).map {

            val splitStr = it.split(":")
            val char = splitStr[0].split(" ")[1][0]
            val positions =
                listOf(splitStr[0].split(" ")[0].split("-")[0].toInt(),
                       splitStr[0].split(" ")[0].split("-")[1].toInt())


            isPassValid2(positions, char, splitStr[1])

        }

        return mapped.count { it }
    }


    private fun isPassValid(range: IntRange, char: Char, value: String): Boolean {

        return value.count { it == char } in range

    }

    private fun isPassValid2(positions: List<Int>, char: Char, value: String): Boolean {

        val count = listOf(value[positions[0]], value[positions[1]]).count { it == char }
        return count == 1
    }
}