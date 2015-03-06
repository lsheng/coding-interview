JAVAC=javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: $(classes)

test: all
	java TestFibonacci 

clean :
	rm -f *.class

%.class : %.java
	$(JAVAC) $<
