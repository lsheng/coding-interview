JAVAC=javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: $(classes)

test: all
	java FizzBuzz

clean :
	rm -f *.class

%.class : %.java
	$(JAVAC) $<
