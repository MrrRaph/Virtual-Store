package store.business.util.logger;

import store.business.util.logger.color.Color;
import store.business.util.logger.level.Level;

/**
 * <h1>The console logger</h1>
 * <p>
 *     Log the messages into the console.
 *     It implements the {@code public interface Logger} interface
 * </p>
 * <img src="../../../../uml/ConsoleLogger.png" />
 * @author Raphael Dray
 * @version 1.0.0
 * @since 1.0.0
 * @see Logger
 * @see Level
 */
public class ConsoleLogger implements Logger{

    /**
     * Logs messages with a color depending on the level
     * Infos are in blue
     * Warnings are in magenta
     * Errors are in red
     * @param message {@inheritDoc}
     * @param level {@inheritDoc}
     * @see Level
     * @see Color
     * @see Override
     */
    @Override
    public void log(String message, Level level) {
        switch (level) {
            case INFO:
                System.out.print(Color.BLUE);
                System.out.print(level.toString());
                System.out.print(Color.RESET);
                System.out.println(": " + message);
                break;
            case WARNING:
                System.out.print(Color.MAGENTA);
                System.out.print(level.toString());
                System.out.print(Color.RESET);
                System.out.println(": " + message);
                break;
            case ERROR:
                System.out.print(Color.RED);
                System.out.print(level.toString());
                System.out.print(Color.RESET);
                System.out.println(": " + message);
                break;
        }
    }
}
