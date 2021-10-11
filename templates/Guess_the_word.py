
import colorama
from colorama import Fore
import sys
from termcolor import colored , cprint
word=('players')
length=len(word)
life=length + 2
slist=list(word)

print(".............................................WELCOME TO GUESS GAME................................................. ")
print(colored('gola','red'))
while length>0:
    user=input("Your Alphabet is : ")
    for i in slist:
        if user==i:
            length=length-1
            print("Yess u found one ",length," only left ")
            if length==0:
                print("HURRAH!YOU WIN ",word)
                break
    if user not in slist:
        life=life-1
        print("OOPS!!!! YOU LOSS 1 LIFE ",life ," LEFT")
        if life==0:
            print("............BETTER LUCK NEXT TIME.............",word)
            break

    if len(user)>1:
        print("Only One By One Alphabet")
