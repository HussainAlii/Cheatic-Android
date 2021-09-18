import kotlin.math.max
import kotlin.math.min

class TicTacToe(var ai: Int, var enemy: Int) {

    fun printBord(board: Array<Array<Int>>) {
        for (i in board) {
            var x = ""
            for (j in i) {
                x = x + " " + j
            }
            print(x)
            print("\n")
        }
    }

    fun cloneBoard (board: Array<Array<Int>>): Array<Array<Int>> {
        var cloneBoard = arrayOf(
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0)
        )

        for (i in 0..2)
            for (j in 0..2){
                cloneBoard[i][j]=board[i][j]
            }
        return cloneBoard
    }

    fun getBestNextMove(board: Array<Array<Int>>): Array<Int> {
        var currScore = -999
        var location: Array<Int> = arrayOf()
        for (i in 0..2) {
            for (j in 0..2) {
                if (board[i][j] == 0) {
                    board[i][j] = ai
                    var score = miniMax(board, false)
                    board[i][j] = 0
                    if (score > currScore) {
                        currScore = score
                        location = arrayOf(i, j)
                    }
                }
            }
        }
        return location
    }

    private fun miniMax(board: Array<Array<Int>>, isMax: Boolean): Int {
        var winnerPlayer = winner(board) //take current board and get winner if exist
        if (winnerPlayer != -1) //if there is a winner or draw return point
            return when (winnerPlayer) {
                ai -> 10
                enemy -> -10
                else -> 0
            }
        // if maximizing player
        if (isMax) {
            var bestScore = -999 //predict the worse for the player
            for (i in 0..2) {
                for (j in 0..2) {
                    if (board[i][j] == 0) {
                        board[i][j] = ai //temp move
                        var currScore = miniMax(board, false) //go deeper
                        board[i][j] = 0 //undo the change
                        bestScore = max(currScore, bestScore)
                    }
                }
            }
            return bestScore
        } else { // if minimizing player (enemy)
            var bestScore = 999 //predict the best for the enemy
            for (i in 0..2) {
                for (j in 0..2) {
                    if (board[i][j] == 0) {
                        board[i][j] = enemy //temp move
                        var currScore = miniMax(board,true) //go deeper
                        board[i][j] = 0 //undo the change
                        bestScore = min(currScore, bestScore)
                    }
                }
            }
            return bestScore
        }
    }

    private fun winner(board: Array<Array<Int>>): Int {
        for (i in 0..2) {
            if (equalsOfThree(board[i][0], board[i][1], board[i][2]))
                return board[i][0]
        }

        for (i in 0..2) {
            if (equalsOfThree(board[0][i], board[1][i], board[2][i]))
                return board[0][i]
        }

        if (equalsOfThree(board[0][0], board[1][1], board[2][2]))
            return board[0][0]

        if (equalsOfThree(board[0][2], board[1][1], board[2][0]))
            return board[0][2]

        var availableSpots = 0
        for (i in 0..2) {
            for (j in 0..2) {
                if (board[i][j] == 0) {
                    availableSpots++
                    break
                }
            }
        }

        if (availableSpots == 0)
            return 0
        else
            return -1
    }

    private fun equalsOfThree(a: Int, b: Int, c: Int): Boolean {
        return a == b && b == c && a != 0;
    }

}
