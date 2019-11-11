## Remote Control Project

### Week 1 Homework For Skill Distillery

#### Overview
In this project, we made a program that would simulate the functions of a remote
control. The program starts by asking you "To begin, please turn on the remote
control: ". The user inputs on. The system prints "Turning ON.....". The program
asks the user to "Please input a number between 0 through 9: ". If the user inputs
a number 0-9, the program will respond with "BOOP!", then ask the user to input a
number 0 through 9 again. If the user inputs something besides 0 through 9, the
program will respond "Command Not Recognized". If the user inputs "off" the
computer will respond "Turning off", and end the program will end.

#### Concepts
I started the program by printing the message, "To Begin, Please Turn ON The
Remote Control:" on line 16. Then the program reads and stores the users input on
line 16 which is stored as userInput. I also used ".tolowerCase();" to change
anything the user inputs to lowercase so additional code doesnt have to be
written for every way someone could input the word "on".
On line 19, I used a while loop. I didn't want the user to be able to proceed
until they typed in "on".
while (!userInput.equals("on")
I used an "!" which means "not". so if the user inputs anything other than "on"
the program will print line 20, and then on line 21, ask for users input again.
The loop will continue until the user types "on" which will break the while loop
and move to the method "turningON()".
On line 27, the method turningON() prints out "Turning on...".
On line 29, the program is then told to go to the method inputNum()
The method inputNum() first requests for the user to input a number 0-9, then
collects the users input. I wanted the program to do the same thing if the user
inputs 0-9. so i used the switch method without breaks. If the user inputs a
number 0-9 it will go to the method "pressButton()" which will print out BOOP!
Then the method inputNum() is called and the user will go through that method again.

I put in a break and a case for "off". This will call the method "turningOff()"
and end the program.

I wanted the program to respond differently if the user put anything other
than 0-9. I put in a break and a default on line 58, it will print off error
message.


#### Technologies Used
java
while loops
eclipse
atom
terminal
github


#### Lessons Learned
 In this assignment I learned how to use while loops and use the switch method.
 I also learned how you can use the fall-through on a switch to your advantage. I
 learned how you need to call the method you want the program to go to next. I
 thought it was efficient that i could call a previous method instead of
 rewriting the same code. 
