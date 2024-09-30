# CalculatorProject

This is a simple calculator application that performs basic arithmetic operations, such as addition and multiplication.
The project is only intendend for teaching, demonstrating the topic of unit testing in Python3.

## Features

- Add multiple numbers
- Multiply multiple numbers

## Requirements

- Python 3.8
- `pytest` for testing
- `nose2` for enhanced test output (typically, you only have one of the test runners)

## Installation

After cloning the project, you need to setup a virtual python environment and install the project dependencies. Please make sure you have installed either [Python venv](https://docs.python.org/3/library/venv.html) or [Python pipenv](https://pipenv.pypa.io/en/latest/) for installing the dependencies.
We will continue the example using Python *vevn*.

```bash
$ source venv/bin/activate  # activate your virtual environment
$ pip3 install -r requirements.txt
```

## Run the tests

You can either run the test using the [pytest](https://docs.pytest.org/en/stable/) framework, or the [nose2](https://docs.nose2.io/en/latest/) test framework:

### pytest
```bash
$ pytest # in the root directory of the project
```

### nose2
```bash
$ cd tests # in the root directory of the project
$ nose2 -v 
```


