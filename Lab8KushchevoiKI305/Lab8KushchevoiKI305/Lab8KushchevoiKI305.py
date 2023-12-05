import os
import struct
import sys
import math

# Function to write the result to a text file
def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))

# Function to read the result from a text file
def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# Function to write the result to a binary file
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))

# Function to read the result from a binary file
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# Function to calculate the given expression (handling possible errors)
def calculate(x):
    res = 0
    try:
        rad1 = math.radians(2 * x)
        rad2 = math.radians(3 * x - 1)
        res = math.cos(rad1) / 1 / math.tan(rad2)
    except ValueError as e:
        print(e)
    except ZeroDivisionError as e:
        print(e)
    return res

# Main program
if __name__ == "__main__":
    data = float(input("Enter data: "))
    result = calculate(data)
    print(f"Result: {result}")
    try:
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        print("Result: {0}".format(readResBin("binRes.bin")))
        print("Result: {0}".format(readResTxt("textRes.txt")))
    except FileNotFoundError as e:
        print (e)
        sys.exit(1)
