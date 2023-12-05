# Warship.py
from Frigate import Frigate
from Military import Military

class Warship(Frigate, Military):
    # Constructor
    def __init__(self, weight, height, square):
        Frigate.__init__(self, weight, height, square)
        Military.__init__(self, weight, height, square)
        
    def info(self):
        super().info()
        print("Type of ship = Warship")
