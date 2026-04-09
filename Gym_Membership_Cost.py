Level-Easy
Q) A gym offers membership plans based on the number of months a customer enrolls. Write a program that prints the total membership cost or an appropriate message for edge cases.

📐 Pricing Rules
Duration	                Cost (₹)
1 month	                  ₹2,000
2 or 3 months	            ₹5,000
4 to 6 months	            ₹9,000
9 months	                ₹12,000
12 months	                ₹15,000


Input < 0	invalid input
Input = 0	0

months = int(input())

if   months < 0:    print("invalid input")
elif months == 0:   print(0)
elif months == 1:   print(2000)
elif months <= 3:   print(5000)
elif months <= 6:   print(9000)
elif months == 9:   print(12000)
elif months == 12:  print(15000)
else:               print("Error")
