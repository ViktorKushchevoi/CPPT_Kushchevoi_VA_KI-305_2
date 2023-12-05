from Ship import Ship

# Class defining a frigate
class Frigate(Ship):
    # Constructor
    def __init__(self, weight, height, square):
        super().__init__(weight, height, square)

    # Method to raise the flag
    def raiseFlag(self):
        print("Flag is raised")

    # Method to simulate a gunshot
    def shoot(self):
        print("Shoot")

    # Method to show information about the ship
    def info(self):
        super().info()
        print("Type of ship = Frigate")