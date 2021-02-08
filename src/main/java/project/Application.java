package project;

import project.view.IUserInterface;
import project.view.UserInterface;

public class Application {

    public static void main(String[] args) {
        IUserInterface ui = new UserInterface();
        ui.showMenu();
    }
}
