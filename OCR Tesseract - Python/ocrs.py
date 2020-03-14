import os

if len(os.listdir('/home/alifilho/PycharmProjects/OCR/Matriculas')) != 0 and len(os.listdir('/home/alifilho/PycharmProjects/OCR/TXTs')) == 0:
    directory = '/home/alifilho/PycharmProjects/OCR/Matriculas'

    number_of_files = len([item for item in os.listdir(directory) if os.path.isfile(os.path.join(directory, item))])

    for i in range(1, number_of_files):
        string = 'tesseract /home/alifilho/PycharmProjects/OCR/Matriculas/' + \
                 str(i) + '.TIF /home/alifilho/PycharmProjects/OCR/TXTs/' + str(i) + ' -l por'
        os.system(string)
else:
    print("Directory is not empty")
