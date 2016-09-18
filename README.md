# Java Points-To Analysis for Soufflé

This repository contains an modified DOOP extractor and a modified points-to specifications for Soufflé.
Currently there are two points-to analyses implemented in form of logical specifications: context-insensitive with call-graph construction on the fly and context-sensitive (2-Heap + 1-Object). 

The extractor can be build by typing 
```
./gradlew build
```

The extractor can be invoked by typing 
```
java -jar build/lib/extractor.jar <program-to-analyse.jar> -lsystem -d <fact-dir>
```
where ```<program-to-analyze.jar>``` is the jar file for which the fact files are produced and ```<fact-dir>``` is the directory where the fact files are written to. 

More information about DOOP can be found here:
http://doop.program-analysis.org/

The modified DOOP points-to analysis has been provided by Oracle Labs:
https://github.com/oracle/souffle/tree/master/samples

How to install and run the Soufflé can be found here:
http://github.com/souffle-lang/souffle




