password_hint = {}


print('Create security questions for your email.\n'
     'Enter (z) as an email to exit.')


while True:
   email = input('Enter Email: ')
   if email.lower() == 'z':
       break
   question = input('Enter Security Question: ')
   answer = input('Enter the answer to the question: ')
   password_hint[email] = (question, answer)


print('You have created %d security questions.\n'
     % (len(password_hint)))


while True:
   usrEmail = input('Enter your email: ')
   if usrEmail in password_hint:
       print(password_hint[usrEmail][0])
       usrAns = input(': ')
       if usrAns.lower() == password_hint[usrEmail][1].lower():
           print('Your account is now unlocked')
           break
       else:
           print('Incorrect answer')
           continue
   else:
       print('Email does not exist')
       continue