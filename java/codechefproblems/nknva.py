
import string

def remove_punctuation(text):

    punctuations = string.punctuation

    # Loop over each character in the text and remove any punctuation marks
    cleaned_text = ""
    for char in text:                   # Loop over each character in the text not through rach word
                                        #ex x="hansi"|for i in x:|print(i)|out: 'h' 'a' 'n' 's' 'i'
        if char not in punctuations:
            cleaned_text = cleaned_text+char
    return cleaned_text
text="hansi@! is  . ?"
print(remove_punctuation(text))
