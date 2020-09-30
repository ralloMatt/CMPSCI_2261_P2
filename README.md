# CMPSCI_2261_P2
Object oriented project with humans and dogs.

Project Description:
CS2261 Fall 2015
PROGRAMMING ASSIGNMENT 2:
In this assignment you will be doing a simulation of multiple humans and dogs.
In this assignment, you will have 2 classes.
1)	A class Human, having attributes of name, money, dogfood, and has-a certain number of dogs specified on creation (so an array of Dogs). Your methods for the human class should be walks, feeds, bathes, toString, passTheTime and buysFood. These methods should use getter and setter functions on all their dogs in a way that makes sense. For example, bathing your dog should increase cleanliness of them all, decrease fun and possibly increase hunger.
2)	) A class Dog, having attributes of name, hunger(1-100), fun(1-100), cleanliness(1-100) and loyalty(1-100) and a method toString. Loyalty should be a private method that can only be changed by a dog and is always kept at max(fun,100-hunger). Make sure to use getter/setter methods to enforce that loyalty always is set to this.
3)	A class that uses these classes to run our simulation

In your main method, you should start by prompting how many humans should exist. Create an array of these humans and then prompt for names for each human and number of Dogs that human should have. Then create each Human for your array, with the appropriate number of Dogs. The attributes of the Dogs should be set randomly, but the constructor of each Dog should prompt the user when it is created.
Once your humans and dogs are created, enter a loop. Inside the loop:
1)	Each iteration of the loop, call the toString methods of all the Humans. This toString method should display the attributes of the humans and also call the toString methods of their dogs.


2)	Then display a menu asking which human you wish to do something with. Depending on the selection, then present a menu asking what that human would like to do (for example, walk his dog or go to work). Perform that action. The user should also be able to simply do nothing (continue on with the next iteration), or to quit the program. If the user selects to do something with a particular human, after that action is performed the user should be asked again if they want to do something with another human before doing in iteration of the loop
3)	Before starting a new iteration of the loop, call passTheTime with all human objects.

Feel free to mess around with the internal values of the different methods if you want, but make sure you at least do the minimum that I requested.

For submission:
1)	Submit the 3 java files separately, not in a directory
2)	Make sure that they are not in a package. If they are in a package, please delete that line before submitting.
3)	Submit a UML diagram of the Dog and Human classes, as well as their relationship to each other.
