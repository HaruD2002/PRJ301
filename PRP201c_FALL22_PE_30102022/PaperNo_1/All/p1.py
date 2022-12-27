'''Q1'''
try:
    x= int(input("Enter first number:"))
    while x< 0:
        x= int(input("Enter a positive number:"))
except ValueError:
    x= input("Enter a positive number:")
    while x < 0:
        x = int(input("Enter a positive number:"))

try:
    y= int(input("Enter secound number:"))
    while y< 0:
        y= int(input("Enter a positive number:"))
except ValueError:
    y= input("Enter a positive number:")
    while y < 0:
        y = int(input("Enter a positive number:"))

def least_comm_mult(first_number,second_number):
    'find least common multiplier'
    for i in range (1,100):
        for j in range (1,100):
            newx = first_number * i
            newy = second_number * j
            if newx == newy:
                return print("The least commom multiplier of", first_number,
                             "and", second_number, ":",newx)
            else:
                continue

def greater_comm_divisor(first_number, second_number):
    'find greater_comm_divisor'
    for i in range (1,100):
        for j in range (1,100):
            if first_number % i == 0 and second_number%j==0:
                thisx = x / i
                thisy = y / j
                if thisx == thisy:
                    return print("The least commom multiplier of", first_number,
                                 "and", second_number, ":", int(thisx))
                else:
                    continue

least_comm_mult(x,y)
greater_comm_divisor(x,y)
