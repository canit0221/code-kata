hh,mm = map(int,input().split())

if mm >= 45:
    mm = mm - 45

elif mm < 45:
    if hh > 0:
        hh = hh - 1
        mm = mm + 15

    elif hh == 0:
        hh = 23
        mm = mm + 15

print(hh,mm)
