try:
    fnam = input("Enter File Name:")
    fget = open(fnam,'r',encoding="utf-8")
    x = fget.readline().replace(',', '').split(' ') #read file
    print("The original list:",x)
    y= []
    for i in range(1,len(x)):
        if int(x[i]) >0:
            y.append(x[i])
    print("The list after remove negative numbers:",y)
    fwrite = open(fnam,"w",encoding="utf-8")
    for i in range(0,len(y)):
        fwrite.write('{} ,'.format(y[i])) #write file
    fget.close()
    fwrite.close()
except FileExistsError:
    print("File not found")

