1) Create a folder for compiled files: 'mkdir target'

2) Copy folder with resource files to /target: 'cp -R src/resources target/'

3) Go to /target : 'cd target'

4) Extract jar-archive to /target :
    'jar xf ../lib/jcommander-1.82.jar'
    'jar xf ../lib/JCDP-4.0.0.jar'

5) Go to /ImagesToChar : 'cd ..'

6) To compile type:
    'javac -sourcepath src/java -cp lib\* ./src/java/edu/school21/printer/app/Program.java ./src/java/edu/school21/printer/logic/*.java -d target'

7) Сreate jar-archive: 'jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target .'

8) To run the program type 'java -jar ./target/images-to-chars-printer.jar --white=ColorBack --black=ColorFont'
