from Ship import Ship

class Military(Ship):
    # Constructor
    def __init__(self, weight, height, square):
        super().__init__(weight, height, square)

    def info(self):
        super().info()
        print("Type of ship = Military")