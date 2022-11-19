## Instructions
```
Write a function that takes positive integers and outputs their string representation.
Your function should comply with the following additional rules:
If the number is a multiple of three, return the string "Fizz".
If the number is a multiple of five, return the string "Buzz".
If the number is a multiple of both three and five, return the string "FizzBuzz".
```
For example, given the numbers from 1 to 15 in order, the function would return:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

## Attempt
In iterative Cycles via `Green > Red > Refactor` steps
### Iteration Cycles
#### **cycle 1**
  - Green:
    - Initially there is nothing, no test, no class
    - System works/compile so can be considered Green
  - Red:
    - Make system state Red. White one failing test
    - Pick the minimal simplest unit of functionality
    - Implement the simplest failure (compilation failure is still a failure!)
      - Start with the Test Class, and reference the Target Class which doesn't exist yet
      - So the test will fail to compile because of the referenced non-existing Target Class
  - Refactor:
    - Is it failing for the right reason?
      - No: a compilation error is a failure but not a valid reason
    - Write just enough production code to make the test compile
      - It could be just rising an exception, so still failing
  - Green:
    - Write the simplest code to make test pass
    - Apply TDD principles:
      - `You are not allowed to write any production code unless it is for making a failing unit test pass`
      - `Faking it`
      - `KISS (or "keep it simple stupid"`
      - `YAGNI ("you ain't going to need it")`
      - `resist this urge`
      - `let you will be guided by the tests`
      - `fake it until you make it`
    - By concentrating on the simplest solution possible an elegant solution will _**emerge**_ as you add tests
  - Refactor:
    - only if the there is duplications
    - if done then keep it Green
#### **cycle 2**:
