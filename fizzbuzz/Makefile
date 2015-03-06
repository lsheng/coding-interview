JAVAC=javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: $(classes)

test: all
	java FizzBuzz| diff -q FizzBuzz.output -

clean :
	rm -f *.class

%.class : %.java
	$(JAVAC) $<
