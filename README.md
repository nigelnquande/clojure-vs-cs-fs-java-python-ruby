# Clojure versus BF, C, C#, F#, Java, JavaScript, Python & Ruby

This project contains comparison of Clojure versus BF, C, C#, F#, Java, JavaScript, Python &amp; Ruby to achieve the same thing. The premise is that C# and Java code is harder to write and understand, more time consuming and more verbose than that written in the other languages. For the sake of fairness, Brainfuck will also be used where possible (I am capable of doing so) as it is not an easy language to use by any means.

The aims of this project are:

1. to write code in Clojure and compare it to equivalent code (achieves the same thing) in the following languages:
+ Brainfuck (where applicable; imperative)
+ C (imperative)
+ C# (functional and imperative)
+ F# (functional)
+ Java 8+ (functional and imperative)
+ JavaScript (functional and imperative)
+ Python (functional and imperative)
+ Ruby (functional and imperative)

2. to write code in each of F#, JavaScript, Python and Ruby and compare it to equivalent code in Java, C and C#

3. To document the time it takes to write and verify working code (including looking at documentation)

These should give some indication as to how easy/hard it is to pick up functional/imperative programming in these languages.

_Note 1:_ I am currently unfamiliar with writing functional code in any of the languages listed (nor proficient in BrainFuck], coming from an imperative background in C#, Java, JavaScript and Python. My proficiency in Java is also quite low. I aim to approach the functional aspect(s) of these languages afresh as I am effectively a beginner in this regard.

_Note 2:_ As some/most of these languages ignore whitespace, I *could* run all my code together on one line for each. However, this doesn't give an accurate idea of lines of code. Each statement/function call will be on its own line.

For example, although `(vec (concat (subvec [1, 2, 3, 4, 5] 0, 2) (subvec [1, 2, 3, 4, 5] 3) ) )` is valid clojure, I will expand it to this:

```clojure
 (vec 
  (concat 
    (subvec [1, 2, 3, 4, 5] 0, 2) 
    (subvec [1, 2, 3, 4, 5] 3)
  )
)
```
