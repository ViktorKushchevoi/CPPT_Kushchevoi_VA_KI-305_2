# main.py
from Frigate import Frigate
from Military import Military
from Warship import Warship 
# Main program
if __name__ == "__main__":
    # Creating a frigate object
    warship = Warship(80000, 350, 18000)

    warship.startEngine()
    warship.setSpeed(25)
    warship.rudderLeft()
    warship.raiseFlag()
    warship.shoot()
    warship.info()
