n = int(input())

book ={}

for i in range(n):
    book_name = input()
    if book_name in book:
        book[book_name]+=1
    else:
        book[book_name] =1
        
sorted_dic = sorted(book.keys())
print(max(sorted_dic , book.keys()))