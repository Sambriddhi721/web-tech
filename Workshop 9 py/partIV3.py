password_lookup = {}
print('Create multiple usernames and assign passwords to each.\n'
     'Input (z) exit.')


while True:
   usrN = input('Enter Username: ')
   if usrN.lower() == 'z':
       break
   usrP = input('Enter Password: ')
   password_lookup[usrN] = usrP


print('You have created %d accounts.\n'
     'The accounts are %s' % (len(password_lookup), ', '.join(password_lookup.keys())))

