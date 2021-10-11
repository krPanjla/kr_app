num=input('enter the number ')
try:
    val=int(num)
    print("converted successfully")
except:
    val=-1
if val>0:
    print("your number is : ",val)
else:
    print(num ," not a number")
