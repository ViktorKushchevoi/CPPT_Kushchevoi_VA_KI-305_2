# Ship.py
from Deck import Deck
from Rudder import Rudder
from Engine import Engine

# Class defining a ship
class Ship:
    # Constructor
    def __init__(self, weight, height, square):
        # Private instances of Engine, Rudder, and Deck
        self.__engine = Engine()
        self.__rudder = Rudder()
        self.__deck = Deck(square)
        # Ship characteristics
        self.__weight = weight
        self.__height = height

    # Method to start the engine
    def startEngine(self):
         self.__engine.start()

    # Method to stop the engine
    def stopEngine(self):
         self.__engine.stop()

    # Method to set the speed of the ship
    def setSpeed(self, speed):
         self.__engine.setSpeed(speed)

    # Method to turn the rudder to the left
    def rudderLeft(self):
         self.__rudder.turnLeft()
         
    # Method to turn the rudder to the right
    def rudderRight(self):
         self.__rudder.turnRight()

    # Method to print the weight of the ship
    def printWeight(self):
         print("Weight of the ship = " + str(self.__weight) + "(kg)")

    # Method to print the height of the ship
    def printHeight(self):
         print("Height of the ship = " + str(self.__height) + "(m)")   

    # Method to print the square of the ship
    def printSquare(self):
         print("Square of the ship = " + str(self.__deck.getSquare()) + "(m2)")

    # Method to print information about the ship
    def info(self):
        print("Information about the ship: ")
        self.printWeight()
        self.printHeight()
        self.printSquare()