import os

os.system("javac ./blinmatic/easytools/*.java")
os.system("jar cf easytools.jar ./blinmatic/easytools/*.class")

for file in os.listdir("blinmatic/easytools"):
    if file.endswith(".class"):
        os.remove(os.path.join("blinmatic/easytools", file))