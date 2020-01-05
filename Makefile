SOURCE = ./src/*.java
OUTDIR = ./ClassFiles

compile: $(SOURCE)
	@mkdir $(OUTDIR)
	@javac -d $(OUTDIR) -verbose $(SOURCE) &> ./javac.out &

clean:
	@rm -rf $(OUTDIR) ./javac.out
