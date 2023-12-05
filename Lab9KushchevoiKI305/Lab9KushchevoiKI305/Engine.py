# Class defining an engine
class Engine:
    # Constructor
    def __init__(self):
        self.__speed = 0
        self.__isStarted = False

    # Method to start the engine
    def start(self):
        if self.__isStarted:
            print("Engine already started!")
        else:
            print("Engine started")

    # Method to stop the engine
    def stop(self):
        if self.__isStarted:
            print("Engine stopped")
        else:
            print("Engine is not stopped!")

    # Method to set the speed
    def setSpeed(self, speed):
        self.__speed = speed
        print("Speed =", str(speed))