package store.business.util.logger.level;

/**
 * <h1>The Level code enumeration</h1>
 * <p>
 *     The Level code for the errors/infos log messages:
 *     <li>ERROR - <b>Important error, printed in red</b></li>
 *     <li>WARNING - <b>Warning, printed in magenta</b></li>
 *     <li>INFO - <b>Info, printed in blue</b></li>
 * </p>
 * <img src="../../../../uml/LevelDiagram.jpg" />
 *
 * @author Dray Raphael
 * @version 1.0.0
 * @since 1.0.0
 */
public enum Level {
    ERROR("Erreur"),
    WARNING("Warning"),
    INFO("Info");

    private String levelName;

    /**
     * The constructor of the Level initialize the levelname attribute
     * @param levelName The level name
     */
    Level(final String levelName) {
        this.levelName = levelName;
    }

    /**
     * Overriding toString method from the Object class
     * @return String - The code of a level
     * @see Override
     */
    @Override
    public String toString() {
        return this.levelName.toUpperCase();
    }
}