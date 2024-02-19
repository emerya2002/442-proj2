# 442-proj2

To Compile (in order):
1. javac -d . Component.java
2. javac -d . Decorator.java
3. javac -d . FinalPeriod.java
4. javac -d . TestWords.java

- To help you the Decorator code for listing the General education categories a studnet has acheived is in the decotator folder in the class11set.zip file.
- For the assignment download the files assignment02.zip and assignment02data.zip.
- You need to implement 2 methods in Word.java and 2 methods in Decorator.java.
- Depending on how you are running Java, the location of the 3 text files in the data zip can vary. If using VS code, they probably go int he same folder as your java files. If using Eclipse, they go at the top level of you Javca project.
- Every consonant gets added to the set of characters returned by getConsonants (compare getAllStackableGeneds) but you are only allowed to count 1 vowel from each word at a time in the combinations. Hence "beauty", "water" and "assignment" would give the sets [['a', 'e', 'i'], ['a', 'e', 'u'], ['a', 'e', 'y'], ['a', 'i', 'y'], ['e', 'i', 'y']], none of the sets could have 'u' and 'y' together becuase they ony appear in one of those 3 words. So for getvowels compare getAllMutextGeneds.
- You can use different versions of TEST.txt and even with this one, there may we some works missing from yconsonant.txt or yvowel.txt and if so, you need to add them.

  
