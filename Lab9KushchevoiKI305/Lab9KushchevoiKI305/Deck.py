# Class defining a deck
class Deck:
    # Constructor
    def __init__(self, square):
        self.__square = square

    # Method to get the square of the deck
    def getSquare(self):
        return self.__square   
     
    # Method to set the square of the deck
    def setSquare(self, newSquare):
        self.__square = newSquare