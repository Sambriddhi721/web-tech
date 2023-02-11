temp = float(input("Enter the temperature:"))
humidity = float(input("Enter the humidity:"))
if temp >= 85 and humidity > 60:
    print('muggy day today')
else:
    if temp > 85:
        print('pleasant day')
    else:
        if temp <=45:
            print('cold day')
        else:
            print('cool day')
            

