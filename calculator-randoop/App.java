public class App {
    public static void main(String[] args) {
        App app = new App();
        app.run(args);
    }

    public void run(String[] args) {
        // Prompt to welcome the user.
        System.out.println("--------Welcome to the Calculator4Randoop program!--------");

        // Prompt to ask the user for input.
        System.out.println("Please enter a mathematical expression (e.g., 2 + 2):");

        // Read the input from the user.
        String input = args[1];

        // Log the input received from the user.
        System.out.println("You entered: " + input);

        // Check if the input is empty or null.
        if (input == null || input.isEmpty()) {
            System.err.println("No input provided. Exiting the program.");
            return;
        }

        // Process the input by tokenizing it.
        String[] tokens = input.split(" ");

        if (tokens.length < 3) {
            System.err.println("Invalid input. Please provide a complete expression (e.g., 2 + 2).");
            return;
        }

        // Extract the operands and operator from the tokens.
        String operand1 = tokens[0];
        String operator = tokens[1];
        String operand2 = tokens[2];

        // Validate the operands and operator.
        if (!isValidOperand(operand1) || !isValidOperand(operand2)) {
            System.err.println("Invalid operands. Please provide valid numbers.");
            return;
        }
        if (!isValidOperator(operator)) {
            System.err.println("Invalid operator. Please use one of the following: +, -, *, /.");
            return;
        }

        // Perform the calculation based on the operator.
        double result = 0;
        double num1 = Double.parseDouble(operand1);
        double num2 = Double.parseDouble(operand2);

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.err.println("Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.err.println("Invalid operator. Please use one of the following: +, -, *, /.");
                return;
        }
        // Display the result to the user.
        System.out.println(String.format("The result of the expression %s is: %f", input, result));

        // Display a thank you message to the user.
        System.out.println("Thank you for using the Calculator4Randoop program!");
    }

    private boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

    private boolean isValidOperand(String operand) {
        try {
            Double.parseDouble(operand);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
