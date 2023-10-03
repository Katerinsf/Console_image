1) To compile type 'javac ./src/java/edu/school21/printer/app/Program.java ./src/java/edu/school21/printer/logic/Logic.java -d target',
   where option '-d target' sets the destination directory for class files (Before compiling create a folder: 'mkdir target')

2) To run the program type 'java -classpath ./target edu.school21.printer.app.Program <White symb> <Black symb>',
   where option '-classpath ./target' specifies where to find user class files.

3) To copy image type 'cp -r ./src/resources/ target/'

4) To create JAR file type 'jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target .'
    (Before compiling create a folder)

5) To run the program type 'java -jar ./target/images-to-chars-printer.jar <White symb> <Black symb>'
