Smin = int(100)
Smax = int(0)
Savg = int(0)
Omin = int(100)
Omax = int(0)
Oavg = int(0)
Mark = int(0)
SubName = ''
temp = ''
SubTotal =int(0)
OTotal = int(0)
StdName = ''
for count in range(4):
    Smin =100
    Smax = 0
    Savg= 0
    SubTotal =0



    if count ==0:
        subName = 'Math'
    elif count ==1:
        subName ='ENglish'
    elif count ==2:
        subName = 'HCI'
    else:
        subName = 'OS'
    
    temp = "Entr the marks for ", subName
    for count1 in range(2):
        StdName = input('Please Enter Student Name')    
        Mark = int(input(temp))
        if Mark < Smin:
            Smin = Mark
        if Mark > Smax:
            Smax = Mark
        if Mark < Omin:
            Omin = Mark
        if Mark > Omax:
            Omax = Mark
        if Mark < Omin:
            Omin = Mark
        SubTotal = SubTotal + Mark
        OTotal = OTotal +Mark
    Savg = SubTotal/2
    #print 'Max Number in ', SubName, ' are' , STotal
    print 'Max Number in ', SubName, ' are' , Smax
    print 'Min Number in ', SubName, ' are' , Smin
    print 'Avg Number in ', SubName, ' are' , Savg
Oavg = OTotal/8
print 'Max Number are' , Omax
print 'Min Number  are' , Omin
print 'Avg Number are' , Oavg
    
