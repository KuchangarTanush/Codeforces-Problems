def WordCapital(word):
    answer=word[0].upper()+word[1:]
    print(answer)
if __name__=="__main__":
    word=input()
    WordCapital(word)