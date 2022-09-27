- 👋 Hi, I’m @SabarinathanGunasekaran
- 👀 I’m interested in Fullstack Developer
- 🌱 I’m currently learning Fullstack developer in KodNest

list1=[1,2,3,4,5,6,7,8,9]
result={}
try:
    list2 = []

    while True:
        list2.append(int(input()))
except:
    print()


for i in range(0, len(list1)):
    count = 0
    for j in range(0, len(list2)):
        if list2[j] % list1[i] == 0:
            count += 1
            result[list1[i]] = count
print(result)
