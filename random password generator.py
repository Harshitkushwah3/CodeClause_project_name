import string
import random
print("Welcome to random password generator !")
print("The length of password should be more than 5 characters")
length=int(input("Enter the length of password:"))
if(length>=5):
    small=string.ascii_lowercase
    caps=string.ascii_uppercase
    number=string.digits
    specialcharacter=string.punctuation
    full = small+caps+number+specialcharacter
    Generate=random.sample(full,length)
    password   = "".join(Generate)
    print(password)
else:
    print("The length of password should be more than 5 characters")