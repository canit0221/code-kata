for i in range(3):
    try:
        num = int(input())
        num_index = i
    except:
        pass

num = num + 3 - num_index

if not num % 3 and not num % 5:
    print("FizzBuzz")
elif not num % 3 and num % 5:
    print("Fizz") 
elif num % 3 and not num % 5:
    print("Buzz")
else:
    print(num)
