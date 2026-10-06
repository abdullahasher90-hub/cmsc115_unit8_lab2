# Reflection – AI Number Program Lab

##  Student Name:
Abdullah Asher

##  GitHub Repository Link:
https://github.com/abdullahasher90-hub/cmsc115_unit8_lab2

## Iteration 1

What the AI code does:
- The prompt only gave the method name findResult and did not say what the result should be, so the AI guessed. It loops through the array and returns the sum of all the values.

Tests passed/failed:
- All tests failed (0 out of 45). The Basic Array test and the Negative test both failed because the tests expect the largest value in the array, not the sum.

What surprised you:
- The AI produced code that compiles and runs without errors, but it solved the wrong problem. A vague prompt led to a confident but incorrect answer.

Commit message:
- Iteration 1: AI-generated implementation

---

## Iteration 2

What changed:
- With the clearer prompt ("returns the largest integer in an array"), the AI replaced the sum with a max search. It sets max to values[0], then loops through the rest of the array and updates max whenever it finds a bigger value.

What improved:
- The Basic Array test (10/10) and the Negative test (5/5) now pass. Starting from values[0] instead of 0 means arrays with only negative numbers return the correct largest value. The score went from 0 to 15 out of 45.

What still failed and why:
- The Empty test failed, and one test in Single Value (testEmptyArray) failed with ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0. The code reads values[0] without checking if the array is empty, so it crashes when the array has no elements.

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
-

What was fixed:
-

What you learned:
-

Commit message:
-

---

## Final Reflection

- How did AI responses change across prompts?
- How did testing affect your changes?
- What did version control help you understand?
