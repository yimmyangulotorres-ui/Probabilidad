package edu.unl.ec;

public class PositiveNumberAdder {


        public int addPositiveNumbers(int firstNumber, int secondNumber) {
            validatePositiveNumbers(firstNumber, secondNumber);
            return firstNumber + secondNumber;
        }

        private void validatePositiveNumbers(int firstNumber, int secondNumber) {
            if (firstNumber <= 0 || secondNumber <= 0) {
                throw new IllegalArgumentException(
                        "Los números deben ser mayores que cero."
                );
            }
        }
    }
