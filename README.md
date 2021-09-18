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
    <img src="images/p.jpg">
    <img src="images/n.jpg">
    <li><p><a target="_blank" href="https://teachablemachine.withgoogle.com"> Using machine leaning tools to train the data and generate tflite file.</a></p></li>
    <li><p>Classification model embedded into the app to recognize objects.</p></li>
  </ol>
  
    
</div>
  
  ### Sudoku:
  
    1. Detect objects and capture data from the camera.



    2. Use smart algorithem to process the data and solve it.
  
    
  ### Tic-Tac-Toe:
  
    1. Detect objects and capture data from the camera.



    2. Use smart algorithem to process the data and solve it.
