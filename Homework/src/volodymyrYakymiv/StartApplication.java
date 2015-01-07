package volodymyrYakymiv;

import volodymyrYakymiv.ChoiceTask.ViewOfMenu;


/**
 * The StartApplication class for run application
 *
 * @author Volodymyr Yakymiv
 * @version 1.0, January 2015
 *          Note that this version is not thread safe.
 */
public class StartApplication {
    /**
     * The main method
     * @param args
     */
    public static void main(String[] args) {
        /**Create an object of {@link volodymyrYakymiv.ChoiceTask.ViewOfMenu} class*/
        ViewOfMenu welcomePage = new ViewOfMenu();
        welcomePage.startApplication();
    }
}
