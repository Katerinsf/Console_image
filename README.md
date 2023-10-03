# Console_image
Создание библиотечного архива и использование внешних библиотек JCommander и JCDP для
вывода в консоль двухцветного изображения.

- Для написания программ использовалась версия Java 8.
- Для форматирования кода использовались стандарты Oracle.
- Код каждого задания находиться в папке src в соответствующей директории.

## Contents
1. [Exercise 00 – Packages](#exercise-00-packages)
2. [Exercise 01 – First JAR](#exercise-01-first-jar)
3. [Exercise 02 – JCommander & JCDP](#exercise-02-jcommander-jcdp)



### Exercise 00 – Packages

В данном задании реализован функционал, выводящий в консоль двухцветное изображение.
Пример черно-белого изображения в формате BMP.
Размер изображения 16*16 пикселей.

![it](misc/images/it_black.png)

Вы можете скачать это изображение [здесь](https://yadi.sk/i/nt-C_kZKWrlyNQ ).

Приложение принимает входные параметры, соответствующие символам, которые должны отображаться вместо белых и черных пикселей, и полный путь к изображению на вашем диске.

Если "." символ используется для белого цвета и «0» для черного, изображение в консоли может выглядеть следующим образом:


![it_console](misc/images/it_console.png)

Структура проекта:

- ImagesToChar - project folder
  - src - source files
    -	java - files of Java source code
        - edu.school21.printer - a series of main packages
          -	app - a package that contains classes for startup 
          -	logic - a package that contains the logic for converting an image into an array of characters
  -	target - compiled .class files
    -	edu.school21.printer ...
  -	README.txt

Файл README.txt содержит инструкции по компиляции и запуску исходного кода из консоли (не IDE). 
Инструкция написана для состояния, когда консоль открыта в корневой папке проекта.


### Exercise 01 – First JAR

В этом задании реализован дистрибутив приложения — JAR-архив. Изображение также содержится в этом архиве.

Структура проекта:
- ImagesToChar - project folder
  - src - source files
    - java - files of Java source code
      - ...
    -	resources - a folder with resource files
         - image.bmp - the displayed image
    - manifest.txt - a file containing the description of the initial point for archive startup  
  - target - compiled .class files and archive
    - edu.school21.printer ...
    - resources
    - images-to-chars-printer.jar
  - README.txt

Архив и все скомпилированные файлы при сборке помещаются в папку target.

Файл README.txt содержит инструкции по компиляции и запуску исходного кода из консоли.


### Exercise 02 – JCommander & JCDP

В данном задании использованы внешние библиотеки:
- JCommander для обработки аргументов при запуске программы. 
- JCDP для цветного вывода изображения.

Структура проекта:
- ImagesToChar - project folder
  -	lib - external library folder
    -	jcommander-*.**.jar
    -	JCDP-*.*.*.jar/JCOLOR-*.*.*.jar
  -	src - source files
  -	target - compiled .class files and archive
    -	edu.school21.printer
    -	com/beust ... - .class files of JCommander library
    -	com/diogonunes ... - .class files of JCDP library
    -	resources
    -	images-to-chars-printer.jar
  -	README.txt

Файл README.txt содержит инструкции по компиляции и запуску исходного кода из консоли.

Пример работы программы:

`$ java -jar images-to-chars-printer.jar --white=RED --black=GREEN`

![it_red](misc/images/it_red.png)
