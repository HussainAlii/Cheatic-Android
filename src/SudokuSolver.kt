class SudokuSolver {
    var board = Array(9) { Array(9) { "" } }

    constructor(board: Array<Array<String>>){
        this.board = board
        solve_sudoku()
    }

    companion object{
        private var loopChecker = 0

        fun isStuck():Boolean{
            return loopChecker>=100000
        }

        fun isSolved(board:Array<Array<String>>):Boolean{
            for (i in 0..8)
                for (j in 0..8){
                    if (board[i][j]=="")
                        return false
                }
            return true
        }

        fun cloneBoard (board: Array<Array<String>>): Array<Array<String>> {
            var solvedBoard = Array(9) { Array(9) { "" } }

            for (i in 0..8)
                for (j in 0..8){
                    solvedBoard[i][j]=board[i][j]
                }
            return solvedBoard
        }

         fun print_board(board: Array<Array<String>>) {
            println()
            for (i in board) {
                var x = ""
                for (j in i) {
                    if (j == "")
                        x += " "
                    if (j == "") x = x + "-"
                    else x = x + " " + j
                }
                println(x)
            }
        }
    }

    private fun solve_sudoku(): Boolean {
        loopChecker++
        if (loopChecker>=100000)
            return true
        var empty = get_empty()
        if (empty.isEmpty())
            return true

        var row = empty[0]
        var col = empty[1]

        for (i in 1..9){
            var istr = i.toString()
            if (isValid(row,col,istr)){
                board[row][col]=istr
                if (solve_sudoku())
                    return true
            }
            board[row][col]=""
        }
        return false
    }

    private fun isValid(i: Int, j: Int, value: String): Boolean {
        for (col in 0..8){
            var x = board[i][col]
            if (x==value)
                return false
        }

        for (row in 0..8){
            var x = board[row][j]
            if (x==value)
                return false
        }

        var start_i = i - (i%3)
        var start_j = j - (j%3)
        for (row in 0..2){
            for (col in 0..2) {
                if (board[start_i][start_j] == value) return false
                start_j+=1
            }
            start_j = j-(j%3)
            start_i+=1

        }

        return true
    }


    private fun get_empty(): Array<Int> {
        for (i in 0..8){
            for (j in 0..8){
                if (board[i][j]=="")
                    return arrayOf(i,j)
                else continue
            }
        }
        return arrayOf()
    }

}