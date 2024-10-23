
    // Define custom exception for TooHot
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

// Define custom exception for TooCold
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class assi23{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the temperature as a command line argument.");
            return;
        }

        try {
            // Parse temperature from command line argument
            int temperature = Integer.parseInt(args[0]);

            // Check if temperature is too hot
            if (temperature > 35) {
                throw new TooHot("Temperature is too hot: " + temperature + "°C");
            }

            // Check if temperature is too cold
            if (temperature < 5) {
                throw new TooCold("Temperature is too cold: " + temperature + "°C");
            }

            System.out.println("Temperature is within the normal range: " + temperature + "°C");

        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid number for the temperature.");
        }
    }
}

