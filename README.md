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
- findResult returns the largest integer in the array, including arrays with only negative numbers and arrays with a single value. If the array is empty, it returns Integer.MIN_VALUE instead of crashing.

What was fixed:
- Added a check at the start of the method: if values.length is 0, return Integer.MIN_VALUE. This happens before values[0] is read, so the ArrayIndexOutOfBoundsException no longer occurs. All four test groups now pass: Basic Array 10/10, Negative 5/5, Single Value 5/5, and Empty 5/5.

What you learned:
- Edge cases like an empty array are easy to miss, even for an AI. Code that works for normal input can still crash on unusual input, and tests are what reveal it. I also learned that you have to tell the AI exactly what behavior you want for edge cases.

Commit message:
- Iteration 3: final version passing all tests

---

## Final Reflection

- How did AI responses change across prompts?
  - The answers got better as the prompts got more specific. The first prompt only named the method, so the AI guessed and returned a sum. The second prompt said "largest integer", so the AI wrote a correct max search but ignored empty arrays. The third prompt stated the empty-array rule, and the AI added the missing check. The AI only did what the prompt clearly asked for.

- How did testing affect your changes?
  - The JUnit tests showed exactly what was wrong at each step. In Iteration 1 every test failed, which showed the method was solving the wrong problem. In Iteration 2 the error ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 pointed directly to the empty-array case. Without the tests I would not have known the AI code was wrong, because it compiled and ran fine.

- What did version control help you understand?
  - Each commit saved one iteration, so the commit history shows how the code changed from a wrong guess, to a mostly correct version, to the final version that passes all tests. I can look back at any commit to see what the AI produced at that step and compare it with the next one.
