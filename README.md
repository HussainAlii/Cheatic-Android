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

### Built With

* [Kotlin](https://kotlinlang.org)
* [OpenCV](https://opencv.org)
* [TensorFlow-tools](https://www.tensorflow.org)
* [ML Kit-tools](https://developers.google.com/ml-kit)
* [Python](https://www.python.org)


    <!-- Outcomes -->
## Overall Outcomes/Achievements
  
  1. Solving Sudoku game.    
  
  2. Solving Tic-Tac-Toe game.
  
### How it works
  <div>
  <summary>Using Python to generate positive and negative images:</summary>
  <ol>
    <li>
      <p>Before the training, we start by collect hundreds of images that are divided into two sections, Positive and negative images.</p>
      <ul>
        <li>positive images are images that contain the object of interest.</li>
        <li>negative images are images that do not contain the object of interest (better to include images that are somehow related to the object environment but not the object itself).</li>
      </ul>
    </li>
    <li><p>After gathering a good amount of images using python, we clean up the data by cropping each image if needed and then, resizing them into (210 X 210) which is a perfect size to detect an object from the camera. After that, convert them into grayscale and finally, rename them in ascending order.</p></li>
  </ol>
  
    
</div>
  
  ### Sudoku:
  
    1. Detect objects and capture data from the camera.



    2. Use smart algorithem to process the data and solve it.
  
    
  ### Tic-Tac-Toe:
  
    1. Detect objects and capture data from the camera.



    2. Use smart algorithem to process the data and solve it.
