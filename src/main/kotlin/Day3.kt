class Day3 {

    fun solvePt1(): Long {

        return countTree(3,1)

    }


    fun solvePt2(): Long {

        return countTree(1,1) * countTree(3,1) * countTree(5,1) * countTree(7,1) *
                countTree(1,2)

    }


    fun countTree(incX : Int, incY: Int) : Long{

        val inpArray = Utils.generateMatrix(3)

        var x = 0; var y = 0; var trees : Long = 0
        var position: Int

        while (y < inpArray.size - 1) {
            y = y.plus(incY)
            x = x.plus(incX)
            position = if(x >= inpArray[y].length){
                x % (inpArray[y].length)
            } else {
                x
            }

            if (inpArray[y][position] == '#'){
                trees++
            }
        }

        return trees

    }
}