import sys

# Input for the size of the square matrix and checking its validity
nRows = int(input("Enter the size of the square matrix (must be at least 3!): "))
if nRows < 3:
    print("Matrix size is less than 3!!!")
    sys.exit()

# Input for the fill character of the square matrix and checking if it's a single character
symbol = input("Enter the fill character: ")
if len(symbol) != 1:
    print("You need to enter only one character!")
    sys.exit()
print()

arr = []
n = nRows
for i in range(nRows):
    if i != 0 and i != nRows-1:
        arr.append([" " if j % 2 == 0 else symbol for j in range(nRows-2)])


file_name = "result.txt"
with open(file_name, 'w') as file:
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if j == 0:
                print(" ", end=" ")
                file.write(" ")
            print(arr[i][j], end=" ")
            file.write(arr[i][j] + " ")
        print()
        file.write("\n")
print()
