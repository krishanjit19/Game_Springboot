# Game_Springboot
Mario, Pacman, Temple Run Game classes: with methods: - up()
- down()
- left()
- right()
Each method prints what that keypress would do in the game
Game Runner class:
- Takes in a game
- Has a run method that calls up(), down(), left(), right(), of the game that has been passed
to it.
Gaming class:
- Take input from the user “Game that you want to run”[Pacman -> 1, Mario -> 2,
TempleRun -> 3, Default -> 0]
- Contains main method, that passes a game to the Game runner class and calls its run()
method based on the user input
Implementing the above question using Loose Coupling, Application Context (Return the Bean from the application context, by calling getBean() and run the desired method on the Bean), Spring Beans
