<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://play.google.com/store/apps/details?id=com.hostile.cheatic">
    <img src="images/logo.png" width="120px" height="120px" alt="CFlix Logo">
  </a>
  
  <br />
    <a href="https://play.google.com/store/apps/details?id=com.hostile.cheatic">View app</a>


<!-- ABOUT THE PROJECT -->
## About The Project

A puzzle solver app which uses computer vision technology to distingue puzzle games and uses AI that is built using minimax and backtracking algorithms to solve them.
  <div>
    <img src="images/tic-tac-toe/tic-tac-toe.jpg" alt="sudoku Result"  width="220" height="520px">
    <img src="images/sudoku/sudoku.jpg" alt="sudoku Result"  width="220" height="520px">
  </div>
  
### Built With

* [Kotlin](https://kotlinlang.org)
* [OpenCV](https://opencv.org)
* [TensorFlow-tools](https://www.tensorflow.org)
* [ML Kit-tools](https://developers.google.com/ml-kit)
* [Python](https://www.python.org)


    <!-- Outcomes -->
## Overall Outcomes/Achievements
  
  1. Solving Sudoku game by using backtracking algorithm.    
  
  2. Solving Tic-Tac-Toe game by using minimax algorithm.
  
  3. Provide User friendly interface design.
  
## How it works
  <div>
  <summary>Using Python to create classification model:</summary>
  <ol>
    <li>
      <p>Before the training, we start by collect hundreds of images that are divided into two sections, Positive and negative images.</p>
      <ul>
        <li>positive images are images that contain the object of interest.</li>
        <li>negative images are images that do not contain the object of interest (better to include images that are somehow related to the object environment but not the object itself).</li>
      </ul>
    </li>
    <li>
      <p>After gathering a good amount of images, we clean up the data.</p>
      <ul>
        <li>Cropping each image if needed.</li>
        <li>Resizing each image into (210 X 210) which is a perfect size to detect an object from the camera.</li>
        <li>Converting each image into grayscale.</li>
        <li>Renaming each image in an ascending order.</li>
      </ul>
    </li>
    </br>
    <div style="display: flex;">
    <div style="margin-left: 10px;">
      <img src="images/p.jpg" alt="positive images" width="320px" height="220px">
      <p>Collection of Positive images</p>
    </div>
    <div>
      <img src="images/n.jpg" alt="negative images" width="320px" height="220px">
      <p>Collection of Negative images</p>
    </div>
    </div>
    <li><p><a target="_blank" href="https://teachablemachine.withgoogle.com"> Using machine leaning tools to train the data and generate tflite file.</a></p></li>
    <li><p>Classification model embedded into the app to recognize objects.</p></li>
  </ol>
  <summary>Object detection in a puzzle:</summary>
  
  1. Capture data from the camera.
  
  2. Clean up the captured image.
  
  3. Apply warp perspective
  
  4. Detect object.
  
  5. Use smart algorithm to solve it.
   
  <summary>Sudoku algorithm:</summary>
  
      fun solve_sudoku(): Boolean { //using Backtracking algorithm
        var empty = get_empty() //get next empty box
        if (empty.isEmpty()) //if there is nothing inside empty then the board is solved
            return true
            
        //take location of empty box
        var row = empty[0] 
        var col = empty[1]

        for (i in 1..9){
            var istr = i.toString()
            if (isValid(row,col,istr)){ //check if (i) inside the box is valid or not
                board[row][col]=istr 
                if (solve_sudoku()) //if valid go deeper until it returns true
                    return true
            }
            board[row][col]=""
        }
        return false // Board can not be solved!
    }
  
  <summary>Tic-Tac-Toe algorithm:</summary>
       
      private fun miniMax(board: Array<Array<Int>>, isMax: Boolean): Int { // solve using minimax algorithm
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
      
  <br>
  <br>
  <img src="images/sudoku/sudoku_detection.gif" alt="sudoku detection"  width="220" height="520px">
  <img src="images/sudoku/sudokuResult.jpg" alt="sudoku Result"  width="220" height="520px">
  <img src="images/sudoku/solve_sudoku.jpg" alt="solve sudoku"  width="220" height="520px">
  </br>
  </br>
  <img src="images/tic-tac-toe/tic-tac-toe-ex1.jpg" alt="sudoku detection"  width="220" height="520px">
  <img src="images/tic-tac-toe/tic-tac-toe-ex2.jpg" alt="sudoku detection"  width="220" height="520px">
</div>

